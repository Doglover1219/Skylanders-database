package net.doglover.skylanders.alignment;

public enum Element {
    LIGHT("Light"),
    AIR("Air"),
    LIFE("Life"),
    UNDEAD("Undead"),
    EARTH("Earth"),
    FIRE("Fire"),
    WATER("Water"),
    MAGIC("Magic"),
    TECH("Tech"),
    DARK("Dark"),
    KAOS("Kaos");

    /* --- Fields --- */
    private final String name;

    /* --- Constructor --- */
    Element(String name) {
        this.name = name;
    }

    /* --- Getter Methods --- */
    public String getName() {
        return name;
    }
}
