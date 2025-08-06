package net.doglover.skylanders.alignment;

import net.doglover.games.chapters.Chapter;
import net.doglover.skylanders.abilities.BattleClassAbilityTree;

public enum BattleClass {
    BAZOOKER("Bazooker", Chapter.SCHOLARVILLE),
    BOWSLINGER("Bowslinger", Chapter.DRAGON_TEMPLE),
    BRAWLER("Brawler", Chapter.MUSHROOM_RIVER),
    KNIGHT("Knight", Chapter.SKY_FORTRESS),
    NINJA("Ninja", Chapter.FIZZLAND),
    QUICKSHOT("Quickshot", Chapter.ABANDONED_AMUSEMENT_PARK),
    SENTINEL("Sentinel", Chapter.THE_LAIR_OF_KAOS),
    SMASHER("Smasher", Chapter.THE_GOLDEN_ARCADE),
    SORCERER("Sorcerer", Chapter.CRADLE_OF_CREATION),
    SWASHBUCKLER("Swashbuckler", Chapter.SHELLMONT_SHORES),
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
