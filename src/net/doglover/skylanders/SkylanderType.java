package net.doglover.skylanders;

public enum SkylanderType {
    CORE("Core"),
    GIANT("Giant"),
    SWAP_FORCE("Swap Force"),
    TRAP_MASTER("Trap Master"),
    SUPERCHARGER("SuperCharger"),
    SENSEI("Sensei"),

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
