package net.doglover.dlrskydatabase;


import net.doglover.dlrskydatabase.games.Game;
import net.doglover.dlrskydatabase.games.chapters.Chapter;
import net.doglover.dlrskydatabase.games.chapters.objectives.Objective;
import net.doglover.dlrskydatabase.skylanders.Skylander;
import net.doglover.dlrskydatabase.skylanders.alignment.BattleClass;
import net.doglover.dlrskydatabase.skylanders.alignment.Element;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ItemEvent;
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
    private final Map<Element, ImageIcon> iconCache = new EnumMap<>(Element.class);

    public MainFrame() {
        setTitle("Skylander Database Explorer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLayout(new BorderLayout());

        // Top panel: search + dropdowns
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        searchField = new JTextField(20);
        sortBox = new JComboBox<>(new String[]{"Default", "A → Z", "Z → A"});
        typeBox = new JComboBox<>(new String[]{"All", "Skylander", "Game", "Chapter", "Element", "Battle Class"});

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
        resultList.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                          boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                String name = (String) value;
                // Only load icons for Skylanders
                Skylander skylander = findSkylander(name);
                if (skylander != null) {
                    Element el = skylander.getElement();
                    ImageIcon icon = iconCache.computeIfAbsent(el, this::loadIcon);
                    label.setIcon(icon);
                } else {
                    label.setIcon(null);
                }
                return label;
            }
            private ImageIcon loadIcon(Element el) {
                String path = "/images/" + el.getName().toLowerCase() + ".png";
                URL url = getClass().getResource(path);
                if (url == null) return null;
                try {
                    BufferedImage img = ImageIO.read(url);
                    Image scaled = img.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                    return new ImageIcon(scaled);
                } catch (IOException ex) {
                    return null;
                }
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
        add(new JScrollPane(detailsArea), BorderLayout.CENTER);

        setVisible(true);
        refresh();
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
                    .map(BattleClass::name)   // or getName(), if you have it
                    .collect(Collectors.toList()));

        // 2) Filter by substring:
        items = items.stream()
                .filter(name -> name.toLowerCase().contains(query))
                .collect(Collectors.toList());

        // 3) Sort if needed:
        if (sort.equals("A → Z")) {
            items.sort(String::compareToIgnoreCase);
        } else if (sort.equals("Z → A")) {
            items.sort((a,b) -> b.compareToIgnoreCase(a));
        }
        // if “Default” is selected, leave the list in insertion order

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
        if (!chapter.getSenseiShrineClasses().isEmpty()) {
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
        stringBuilder.append("Imaginator Abilities:\n");
        stringBuilder.append(battleClass.getAbilityTree());
        detailsArea.setText(stringBuilder.toString());
    }
}