package net.doglover.skylanders.alignment;

public enum SwapAbility {
    BOUNCE("Bounce"),
    CLIMB("Climb"),
    DIG("Dig"),
    ROCKET("Rocket"),
    SNEAK("Sneak"),
    SPEED("Speed"),
    SPIN("Spin"),
    TELEPORT("Teleport");

    /* --- Fields --- */
    private final String name;

    /* --- Constructor --- */
    SwapAbility(String name) {
        this.name = name;
    }

    /* --- Getter Methods --- */
    public String getName() {
        return name;
    }
}
