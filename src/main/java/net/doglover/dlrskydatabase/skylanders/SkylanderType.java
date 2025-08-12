package net.doglover.dlrskydatabase.skylanders;

public enum SkylanderType {
    SERIES1("Series 1"),
    SERIES2("Series 2"),
    LIGHTCORE("LightCore"),
    GIANT("Giant"),
    SERIES3("Series 3"),
    SWAP_FORCE("Swap Force"),
    SERIES4("Series 4"),
    TRAP_MASTER("Trap Master"),
    SUPERCHARGER("SuperCharger"),
    SENSEI("Sensei"),

    EONS_ELITE("Eon's Elite"),

    SIDEKICK("Sidekick"),
    MINI("Mini");

    /* --- Fields --- */
    private final String name;

    /* --- Constructor --- */
    SkylanderType(String name) {
        this.name = name;
    }

    /* --- Getter Methods --- */
    public String getName() {
        return name;
    }
}
