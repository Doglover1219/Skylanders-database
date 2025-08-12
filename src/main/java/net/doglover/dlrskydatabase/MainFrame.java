package net.doglover.dlrskydatabase;

import net.doglover.dlrskydatabase.games.Game;
import net.doglover.dlrskydatabase.games.chapters.Chapter;
import net.doglover.dlrskydatabase.games.chapters.objectives.Objective;
import net.doglover.dlrskydatabase.skylanders.Skylander;
import net.doglover.dlrskydatabase.skylanders.SkylanderType;
import net.doglover.dlrskydatabase.skylanders.alignment.BattleClass;
import net.doglover.dlrskydatabase.skylanders.alignment.Element;
import net.doglover.dlrskydatabase.skylanders.alignment.SwapAbility;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainFrame extends JFrame {
    private final JComboBox<String> sortBox;
    private final JComboBox<String> typeBox;
    private final JTextField searchField;
    private final DefaultListModel<String> listModel;
    private final JList<String> resultList;
    private final JTextArea detailsArea;

    // caches
    private final Map<String, ImageIcon> singleIconCache = new HashMap<>();
    private final Map<String, Icon> compositeIconCache = new HashMap<>();

    // Controls the target square size for each icon and the fixed list row height.
    private static final int ICON_TARGET_SIZE = 36;

    public MainFrame() {
        setTitle("Skylander Database Explorer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLayout(new BorderLayout());

        // Top panel: search + dropdowns
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        searchField = new JTextField(20);
        sortBox = new JComboBox<>(new String[]{"Default", "A → Z", "Z → A"});
        typeBox = new JComboBox<>(new String[]{"Skylander", "Game", "Chapter", "Element", "Battle Class", "All"});

        DocumentListener dl = new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { refresh(); }
            public void removeUpdate(DocumentEvent e) { refresh(); }
            public void changedUpdate(DocumentEvent e) { refresh(); }
        };
        searchField.getDocument().addDocumentListener(dl);
        sortBox.addItemListener(e -> { if (e.getStateChange()==ItemEvent.SELECTED) refresh(); });
        typeBox.addItemListener(e -> { if (e.getStateChange()==ItemEvent.SELECTED) refresh(); });

        topPanel.add(new JLabel("Search:"));
        topPanel.add(searchField);
        topPanel.add(new JLabel("Sort:"));
        topPanel.add(sortBox);
        topPanel.add(new JLabel("Type:"));
        topPanel.add(typeBox);
        add(topPanel, BorderLayout.NORTH);

        // Result list
        listModel = new DefaultListModel<>();
        resultList = new JList<>(listModel);

        // Increase readable font size
        resultList.setFont(resultList.getFont().deriveFont(Font.PLAIN, 15f));
        searchField.setFont(searchField.getFont().deriveFont(Font.PLAIN, 15f));

        // Make each list cell height equal ICON_TARGET_SIZE.
        resultList.setFixedCellHeight(ICON_TARGET_SIZE);

        resultList.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                          boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                String name = (String) value;

                // Put text to the right of the icon and center vertically
                label.setHorizontalTextPosition(SwingConstants.RIGHT);
                label.setIconTextGap(8);
                label.setVerticalAlignment(SwingConstants.CENTER);
                label.setFont(label.getFont().deriveFont(Font.PLAIN, 14f));

                Skylander skylander = findSkylander(name);
                if (skylander != null) {
                    Icon composite = compositeIconCache.computeIfAbsent(skylander.getName(), k -> buildCompositeForSkylander(skylander));
                    label.setIcon(composite);
                } else {
                    // Elements or Battle Classes show single square icons
                    Element element = findElement(name);
                    if (element != null) {
                        String path = "/dlrskydatabase/textures/element/" + element.getName().toLowerCase() + ".png";
                        label.setIcon(loadAndCacheSquareIcon(path));
                    } else {
                        BattleClass battleClass = findBattleClass(name);
                        if (battleClass != null) {
                            String path = "/dlrskydatabase/textures/battle_class/" + battleClass.getName().toLowerCase() + ".png";
                            label.setIcon(loadAndCacheSquareIcon(path));
                        } else {
                            label.setIcon(null);
                        }
                    }
                }

                return label;
            }
        });

        resultList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        resultList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) showDetails(resultList.getSelectedValue());
        });
        add(new JScrollPane(resultList), BorderLayout.WEST);

        // Details
        detailsArea = new JTextArea();
        detailsArea.setEditable(false);
        detailsArea.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
        add(new JScrollPane(detailsArea), BorderLayout.CENTER);

        setVisible(true);
        refresh();
    }

    /**
     * Build a composed icon for a Skylander:
     * Left = special trait icon (swap-ability for SWAP_FORCE if present, battle class for SENSEI if present,
     *         otherwise the type icon),
     * Right = element icon.
     *
     * Each sub-icon is a square ICON_TARGET_SIZE×ICON_TARGET_SIZE image (transparent padding if needed).
     */
    private Icon buildCompositeForSkylander(Skylander skylander) {
        ImageIcon left = null;
        SkylanderType type = skylander.getType();

        // SWAP_FORCE: prefer swap ability icon (if available), then battle class, then type icon
        if (type == SkylanderType.SWAP_FORCE) {
            SwapAbility sa = skylander.getSwapAbility();
            if (sa != null) {
                String p = "/dlrskydatabase/textures/swap_ability/" + sa.getName().toLowerCase() + ".png";
                left = loadAndCacheSquareIcon(p);
            }
            if (left == null) {
                BattleClass bc = skylander.getBattleClass();
                if (bc != null) {
                    String p = "/dlrskydatabase/textures/battle_class/" + bc.getName().toLowerCase() + ".png";
                    left = loadAndCacheSquareIcon(p);
                }
            }
            if (left == null) {
                String p = "/dlrskydatabase/textures/type/" + type.getName().toLowerCase() + ".png";
                left = loadAndCacheSquareIcon(p);
            }
        }
        // SENSEI: prefer battle class, then type icon
        else if (type == SkylanderType.SENSEI) {
            BattleClass bc = skylander.getBattleClass();
            if (bc != null) {
                String p = "/dlrskydatabase/textures/battle_class/" + bc.getName().toLowerCase() + ".png";
                left = loadAndCacheSquareIcon(p);
            }
            if (left == null) {
                String p = "/dlrskydatabase/textures/type/" + type.getName().toLowerCase() + ".png";
                left = loadAndCacheSquareIcon(p);
            }
        }
        // Default: use type icon
        else {
            String p = "/dlrskydatabase/textures/type/" + type.getName().toLowerCase() + ".png";
            left = loadAndCacheSquareIcon(p);
        }

        // Right icon is element
        ImageIcon right = null;
        Element el = skylander.getElement();
        if (el != null) {
            String p = "/dlrskydatabase/textures/element/" + el.getName().toLowerCase() + ".png";
            right = loadAndCacheSquareIcon(p);
        }

        if (left == null && right == null) return null;
        if (left == null) return right;
        if (right == null) return left;

        return new CombinedIcon(left, right, 6);
    }

    /**
     * Loads an image resource, scales it preserving aspect ratio so the longest axis fits ICON_TARGET_SIZE,
     * then draws the scaled image centered into an ICON_TARGET_SIZE×ICON_TARGET_SIZE transparent BufferedImage
     * (so the resulting icon is square and never stretched).
     *
     * Uses a higher-quality scaling routine (progressive downscale and bicubic transform) to reduce pixelation.
     * Caches the final ImageIcon by resourcePath.
     */
    private ImageIcon loadAndCacheSquareIcon(String resourcePath) {
        if (resourcePath == null) return null;
        synchronized (singleIconCache) {
            ImageIcon cached = singleIconCache.get(resourcePath);
            if (cached != null) return cached;
        }

        URL url = MainFrame.class.getResource(resourcePath);
        if (url == null) return null;
        try {
            BufferedImage src = ImageIO.read(url);
            if (src == null) return null;

            int origW = src.getWidth();
            int origH = src.getHeight();

            // compute scaled size so longest side == ICON_TARGET_SIZE
            int targetW, targetH;
            if (origW >= origH) {
                targetW = ICON_TARGET_SIZE;
                targetH = Math.max(1, (origH * ICON_TARGET_SIZE) / origW);
            } else {
                targetH = ICON_TARGET_SIZE;
                targetW = Math.max(1, (origW * ICON_TARGET_SIZE) / origH);
            }

            // produce a high-quality scaled image (preserve detail, avoid blockiness)
            BufferedImage scaled = getHighQualityScaledInstance(src, targetW, targetH);

            // center scaled image into square canvas
            BufferedImage square = new BufferedImage(ICON_TARGET_SIZE, ICON_TARGET_SIZE, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = square.createGraphics();
            g.setComposite(AlphaComposite.Clear);
            g.fillRect(0, 0, ICON_TARGET_SIZE, ICON_TARGET_SIZE);
            g.setComposite(AlphaComposite.SrcOver);
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int x = (ICON_TARGET_SIZE - scaled.getWidth()) / 2;
            int y = (ICON_TARGET_SIZE - scaled.getHeight()) / 2;
            g.drawImage(scaled, x, y, null);
            g.dispose();

            ImageIcon icon = new ImageIcon(square);
            synchronized (singleIconCache) {
                singleIconCache.put(resourcePath, icon);
            }
            return icon;
        } catch (IOException ex) {
            return null;
        }
    }

    /**
     * High-quality scaling helper:
     *  - For downscaling: progressive (stepwise halving) resampling using bilinear and finishes with bicubic transform.
     *  - For upscaling: bicubic AffineTransformOp.
     */
    private static BufferedImage getHighQualityScaledInstance(BufferedImage src, int targetW, int targetH) {
        int w = src.getWidth();
        int h = src.getHeight();

        // If no scaling needed, return copy
        if (w == targetW && h == targetH) {
            BufferedImage copy = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = copy.createGraphics();
            g.drawImage(src, 0, 0, null);
            g.dispose();
            return copy;
        }

        // Upscale: use AffineTransformOp bicubic directly
        if (targetW > w || targetH > h) {
            double sx = (double) targetW / w;
            double sy = (double) targetH / h;
            AffineTransform at = AffineTransform.getScaleInstance(sx, sy);
            AffineTransformOp ato = new AffineTransformOp(at, AffineTransformOp.TYPE_BICUBIC);
            BufferedImage dest = new BufferedImage(targetW, targetH, BufferedImage.TYPE_INT_ARGB);
            ato.filter(src, dest);
            return dest;
        }

        // Downscale progressively by halves to avoid artifacts.
        BufferedImage img = src;
        int currentW = w;
        int currentH = h;

        // While halving still keeps at or above the target, do step shrink
        while ((currentW / 2) >= targetW || (currentH / 2) >= targetH) {
            int nextW = Math.max(targetW, currentW / 2);
            int nextH = Math.max(targetH, currentH / 2);
            BufferedImage tmp = new BufferedImage(nextW, nextH, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = tmp.createGraphics();
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.drawImage(img, 0, 0, nextW, nextH, null);
            g.dispose();
            img = tmp;
            currentW = img.getWidth();
            currentH = img.getHeight();
        }

        // final refine step to exact size with bicubic AffineTransformOp
        if (currentW != targetW || currentH != targetH) {
            double sx = (double) targetW / currentW;
            double sy = (double) targetH / currentH;
            AffineTransform at = AffineTransform.getScaleInstance(sx, sy);
            AffineTransformOp ato = new AffineTransformOp(at, AffineTransformOp.TYPE_BICUBIC);
            BufferedImage dest = new BufferedImage(targetW, targetH, BufferedImage.TYPE_INT_ARGB);
            ato.filter(img, dest);
            return dest;
        }

        return img;
    }

    /**
     * CombinedIcon draws two icons horizontally with a spacing and reports width/height correctly.
     * Both sub-icons are expected to be square ICON_TARGET_SIZE height, so combined height is ICON_TARGET_SIZE.
     */
    private static class CombinedIcon implements Icon {
        private final Icon left;
        private final Icon right;
        private final int spacing;
        private final int width;
        private final int height;

        CombinedIcon(Icon left, Icon right, int spacing) {
            this.left = left;
            this.right = right;
            this.spacing = spacing;
            this.width = left.getIconWidth() + spacing + right.getIconWidth();
            this.height = Math.max(left.getIconHeight(), right.getIconHeight());
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            int leftY = y + (height - left.getIconHeight()) / 2;
            left.paintIcon(c, g, x, leftY);

            int rightX = x + left.getIconWidth() + spacing;
            int rightY = y + (height - right.getIconHeight()) / 2;
            right.paintIcon(c, g, rightX, rightY);
        }

        @Override
        public int getIconWidth() {
            return width;
        }

        @Override
        public int getIconHeight() {
            return height;
        }
    }

    private void refresh() {
        String query = searchField.getText().trim().toLowerCase();
        String sort   = (String) sortBox.getSelectedItem();
        String type   = (String) typeBox.getSelectedItem();

        // 1) Gather in “natural” order:
        List<String> items = new ArrayList<>();
        if (type.equals("All") || type.equals("Skylander"))
            items.addAll(Stream.of(Skylander.values())
                    .map(Skylander::getName)
                    .collect(Collectors.toList()));
        if (type.equals("All") || type.equals("Game"))
            items.addAll(Stream.of(Game.values())
                    .map(Game::getName)
                    .collect(Collectors.toList()));
        if (type.equals("All") || type.equals("Chapter"))
            items.addAll(Stream.of(Chapter.values())
                    .map(Chapter::getName)
                    .collect(Collectors.toList()));
        if (type.equals("All") || type.equals("Element"))
            items.addAll(Stream.of(Element.values())
                    .map(Element::getName)
                    .collect(Collectors.toList()));
        if (type.equals("All") || type.equals("Battle Class"))
            items.addAll(Stream.of(BattleClass.values())
                    .map(BattleClass::getName)
                    .collect(Collectors.toList()));

        // 2) Filter by substring:
        items = items.stream()
                .filter(name -> name.toLowerCase().contains(query))
                .collect(Collectors.toList());

        // 3) Sort if needed:
        if ("A → Z".equals(sort)) {
            items.sort(String::compareToIgnoreCase);
        } else if ("Z → A".equals(sort)) {
            items.sort((a,b) -> b.compareToIgnoreCase(a));
        }

        // 4) Update the UI:
        listModel.clear();
        items.forEach(listModel::addElement);
    }

    private Skylander findSkylander(String name) {
        for (Skylander skylander : Skylander.values()) if (skylander.getName().equals(name)) return skylander;
        return null;
    }

    private Game findGame(String name) {
        for (Game game : Game.values()) if (game.getName().equals(name)) return game;
        return null;
    }

    private Chapter findChapter(String name) {
        for (Chapter chapter : Chapter.values()) if (chapter.getName().equals(name)) return chapter;
        return null;
    }

    private Element findElement(String name) {
        for (Element element : Element.values()) if (element.getName().equals(name)) return element;
        return null;
    }

    private BattleClass findBattleClass(String name) {
        for (BattleClass battleClass : BattleClass.values()) if (battleClass.getName().equals(name)) return battleClass;
        return null;
    }

    private void showDetails(String name) {
        detailsArea.setText("");
        if (name == null) {
            return;
        }
        if (findSkylander(name) != null) {
            displaySkylander(findSkylander(name));
        } else if (findGame(name) != null) {
            displayGame(findGame(name));
        } else if (findChapter(name) != null) {
            displayChapter(findChapter(name));
        } else if (findElement(name) != null) {
            displayElement(findElement(name));
        } else if (findBattleClass(name) != null) {
            displayBattleClass(findBattleClass(name));
        }
    }

    private void displaySkylander(Skylander skylander) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(skylander.getName()).append("\n\n");
        stringBuilder.append("Game: ").append(skylander.getGame().getName()).append("\n");
        stringBuilder.append("Gender: ").append(skylander.getGender().getName()).append("\n");
        stringBuilder.append("Element: ").append(skylander.getElement().getName()).append("\n");
        stringBuilder.append("Catchphrase: ").append(skylander.getCatchphrase()).append("\n\n");
        if (skylander.getBaseVariant() != null) {
            stringBuilder.append("Variant of: ").append(skylander.getBaseVariant().getName()).append("\n");
        }
        stringBuilder.append("Type: ").append(skylander.getType().getName()).append("\n");
        if (skylander.getBattleClass() != null) {
            stringBuilder.append("Battle Class: ").append(skylander.getBattleClass().getName()).append("\n");
        }
        // if swap ability exists, show it too
        if (skylander.getSwapAbility() != null) {
            stringBuilder.append("Swap Ability: ").append(skylander.getSwapAbility().getName()).append("\n");
        }
        stringBuilder.append("Soul Gem Location: ").append(skylander.getSoulGemChapter()).append("\n");
        detailsArea.setText(stringBuilder.toString());
    }

    private void displayGame(Game game) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Game: ").append(game.getName()).append("\n");
        stringBuilder.append("Tagline: ").append(game.getTagline()).append("\n\n");
        stringBuilder.append(game.getDescription()).append("\n");
        detailsArea.setText(stringBuilder.toString());
    }

    private void displayChapter(Chapter chapter) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Chapter: ").append(chapter.getName()).append("\n");
        stringBuilder.append("Game: ").append(chapter.getGame().getName()).append("\n\n");
        stringBuilder.append(chapter.getGame().getObjectives1Name()).append(":\n");
        for (Objective objective : chapter.getObjectives(1)) {
            stringBuilder.append(" - ").append(objective.getTitle()).append("\n");
        }
        stringBuilder.append("\n");
        stringBuilder.append(chapter.getGame().getObjectives2Name()).append(":\n");
        for (Objective objective : chapter.getObjectives(2)) {
            stringBuilder.append(" - ").append(objective.getTitle()).append("\n");
        }
        stringBuilder.append("\n");
        stringBuilder.append(chapter.getGame().getObjectives3Name()).append(":\n");
        for (Objective objective : chapter.getObjectives(3)) {
            stringBuilder.append(" - ").append(objective.getTitle()).append("\n");
        }
        stringBuilder.append("\n");
        if (chapter.getSenseiShrineClasses() != null) {
            if (chapter.getSenseiShrineClasses().size() == 1) {
                stringBuilder.append("Sensei Shrine: ")
                        .append(chapter.getSenseiShrineClasses().getFirst().getName());
            } else {
                stringBuilder.append("Sensei Shrines: ")
                        .append(chapter.getSenseiShrineClasses().getFirst().getName()).append(" and ")
                        .append(chapter.getSenseiShrineClasses().getLast().getName());
            }
        }
        detailsArea.setText(stringBuilder.toString());
    }

    private void displayElement(Element element) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(element.getName()).append("\n\n");
        detailsArea.setText(stringBuilder.toString());
    }

    private void displayBattleClass(BattleClass battleClass) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(battleClass.getName()).append("\n\n");
        if (battleClass.getSoulGemChapter() != null) {
            stringBuilder.append("Soul Gem Location: ").append(battleClass.getSoulGemChapter()).append("\n");
        }
        detailsArea.setText(stringBuilder.toString());
    }
}