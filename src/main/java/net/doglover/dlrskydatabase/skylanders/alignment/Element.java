package net.doglover.dlrskydatabase.skylanders.alignment;

public enum Element {
    LIGHT("Light",
        new ElementAbilityTree {
            new Ability[] {
                new Ability("Rainbow Rampage", "Press Attack 2 to attack your enemies with rainbows.", 0),
                new Ability("Flashbang", "Press Attack 2 to toss a blinding orb into the air, damaging and stunning enemies.", 0),
                new Ability("Speed of Light", "Must be at least level 3", "Press Attack 2 to quickly dash through enemies and send them flying."),
                new Ability("Luminous Block", "Must be at least level 5", "Press Attack 2 to generate energy cover.\nIf you're hit while pulsing, you create a large explosion of light.", 0)
            },
            new Ability[] {
                new Ability("Mastered Rainbow Rampage", "Upgrade Rainbow Rampage", "Press Attack 2 to attack with rainbows.\nHold Attack 2 to charge a devastating beam.", 1500),
                new Ability("Mastered Flashbang", "Upgrade flashbang", "Press Attack 2 to toss a blinding orb that leaves behind a radiant light pool that damages enemies.", 1500),
                new Ability("Mastered Speed of Light", "Upgrade Speed of Light", "Press Attack 2 to dash and summon twin suns that hit a bigger area and deal more damage.", 1500),
                new Ability("Mastered Luminous Block", "Upgrade Luminous Block", "Press Attack 2 to generate energy that slows nearby enemies and always ends with an explosion.", 1500),
            }
        }),
    AIR("Air", null),
    LIFE("Life", null),
    UNDEAD("Undead", null),
    EARTH("Earth", null),
    FIRE("Fire", null),
    WATER("Water", null),
    MAGIC("Magic", null),
    TECH("Tech", null),
    DARK("Dark", null),
    KAOS("Kaos (Element)", null);

    /* --- Fields --- */
    private final String name;
    private final ElementAbilityTree abilityTree;

    /* --- Constructor --- */
    Element(String name, ElementAbilityTree abilityTree) {
        this.name = name;
        this.abilityTree = abilityTree;
    }

    /* --- Getter Methods --- */
    public String getName() {
        return name;
    }
    public ElementAbilityTree getAbilityTree() {
        return abilityTree;
    }
}
