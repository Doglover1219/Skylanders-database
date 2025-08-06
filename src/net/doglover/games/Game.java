package net.doglover.games;

public enum Game {
    SPYROS_ADVENTURE("Skylanders: Spyro's Adventure", "Bring the Skylanders to Life!",
            "Chapter", "Completion", "Collections",
            "The game that launched the franchise: you place real-world Skylanders figures on the Portal of Power and bring them into Skylands to battle the evil Kaos and restore the Core of Light. It combines light platforming, puzzle-solving, co‑op action, and character progression that’s saved on the figures themselves."),
    GIANTS("Skylanders: Giants", "Go Big!",
            "Star 1 Objectives", "Star 2 Objectives", "Collections",
            "A direct sequel introducing new giant-sized Skylanders who can smash obstacles and access hidden areas. Also adds LightCore figures that glow on the portal and perform special moves. Enhances core gameplay with tougher enemies, better boss battles, and more character variety while maintaining compatibility with Spyro’s Adventure figures."),
    SWAP_FORCE("Skylanders: Swap Force", "Swappable. Unstoppable.",
            "Story Goals", "Dares", "Collection",
            "Set in the Cloudbreak Islands, this entry brings in the Swap Force characters—heroes split by a volcano eruption who can swap upper and lower halves, enabling 256 combinations. It also adds jumping mechanics, elemental‑only zones, puzzles and mini‑games, along with drop‑in/drop‑out local co‑op gameplay."),
    TRAP_TEAM("Skylanders: Trap Team", "Capture Evil. Unleash Good.",
            "Star 1 Objectives", "Star 2 Objectives", "Collections",
            "This game introduces Trap Masters and the Traptanium Portal: you can capture villain characters in physical Traps and then play as them. Adds Dark and Light elements, villain‑playable characters, and Minis. Continues the traditional adventure-style platforming of previous entries while expanding collectible functionality."),
    SUPERCHARGERS("Skylanders: SuperChargers", "Drive Evil Crazy!",
            "Land Objective", "Sea Objective", "Air Objective",
            "For the first time, vehicle gameplay is integrated—land, sea, and air vehicles driven by special SuperChargers. These vehicles unlock new gameplay mechanics, racing segments, and puzzle-solving. Standard platform action remains, but much of the experience hinges on combining vehicles with Skylanders for unique abilities and GearBit upgrades."),
    IMAGINATORS("Skylanders: Imaginators", "Unleash Imagination, Create Your Own Skylanders!",
            "Story Goals", "Collections", "Dares",
            "The final mainline entry lets players create fully custom Skylanders—choose body parts, classes, powers, voices, and more. It also revives classic hero Spyro and includes a dedicated “Sensei” lineup. This game offers the most personalization of all entries while battling Kaos once again with user-built champions.");

    /* --- Fields --- */
    private final String name;
    private final String tagline;
    private final String objectives1Name;
    private final String objectives2Name;
    private final String objectives3Name;
    private final String description;

    /* --- Constructor --- */
    Game(String name, String tagline, String objectives1Name, String objectives2Name, String objectives3Name,  String description) {
        this.name = name;
        this.tagline = tagline;
        this.objectives1Name = objectives1Name;
        this.objectives2Name = objectives2Name;
        this.objectives3Name = objectives3Name;
        this.description = description;
    }

    /* --- Getter Functions --- */
    public String getName() {
        return name;
    }
    public String getTagline() {
        return tagline;
    }
    public String getDescription() {
        return description;
    }
    public String getObjectives1Name() {
        return objectives1Name;
    }
    public String getObjectives2Name() {
        return objectives2Name;
    }
    public String getObjectives3Name() {
        return objectives3Name;
    }
}
