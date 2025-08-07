package net.doglover.dlrskydatabase.skylanders.alignment;

import net.doglover.dlrskydatabase.games.chapters.Chapter;
import net.doglover.dlrskydatabase.skylanders.abilities.BattleClassAbilityTree;

public enum BattleClass {
    BAZOOKER("Bazooker", Chapter.SCHOLARVILLE, null),
    BOWSLINGER("Bowslinger", Chapter.DRAGON_TEMPLE, null),
    BRAWLER("Brawler", Chapter.MUSHROOM_RIVER, null),
    KNIGHT("Knight", Chapter.SKY_FORTRESS, null),
    NINJA("Ninja", Chapter.FIZZLAND, null),
    QUICKSHOT("Quickshot", Chapter.ABANDONED_AMUSEMENT_PARK, null),
    SENTINEL("Sentinel", Chapter.THE_LAIR_OF_KAOS, null),
    SMASHER("Smasher", Chapter.THE_GOLDEN_ARCADE, null),
    SORCERER("Sorcerer", Chapter.CRADLE_OF_CREATION, null),
    SWASHBUCKLER("Swashbuckler", Chapter.SHELLMONT_SHORES, null),
    KAOS("Kaos", null, null);

    /* --- Fields --- */
    private final String name;
    private final Chapter soulGemChapter;
    private final BattleClassAbilityTree abilityTree;

    /* --- Constructor --- */
    BattleClass(String name, Chapter soulGemChapter, BattleClassAbilityTree abilityTree) {
        this.name = name;
        this.soulGemChapter = soulGemChapter;
        this.abilityTree = abilityTree;
    }

    /* --- Getter Methods --- */
    public String getName() {
        return name;
    }
    public Chapter getSoulGemChapter() {
        return soulGemChapter;
    }
    public BattleClassAbilityTree getAbilityTree() {
        return abilityTree;
    }
}
