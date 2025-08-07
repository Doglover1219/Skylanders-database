package net.doglover.dlrskydatabase.skylanders.alignment;

import net.doglover.dlrskydatabase.games.chapters.Chapter;
import net.doglover.dlrskydatabase.skylanders.abilities.Ability;
import net.doglover.dlrskydatabase.skylanders.abilities.BattleClassAbilityTree;

public enum BattleClass {
    BAZOOKER("Bazooker", Chapter.SCHOLARVILLE,
            new BattleClassAbilityTree(
                    // Primary Attack Options
                    new Ability[]{
                            new Ability("Blaster", "Press Attack 1 to fire rockets. This attack can be fired rapidly.", 0),
                            new Ability("Destroyer", "Press Attack 1 to fire rockets with a small explosive radius.\nPress A1, A1, A1 to shoot a big rocket that explodes into smaller bombs.", 0)
                    },
                    // Primary Attack Upgrades
                    new Ability[]{
                            new Ability("Master Blaster", "Upgrade Blaster", "Shoot an additional rocket when you press Attack 1.", 700),
                            new Ability("Master Destroyer", "Upgrade Destroyer", "Press Attack 1 to fire explosive rockets, whose shrapnel does extra damage.", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("Rocket Jump", "Must be at least level 2", "Press Attack 3 to rocket jump with your bazooka.", 0),
                            new Ability("Birthday Present", "Must be at least level 4", "Press Attack 3 to drop a bomb that explodes when close to enemies or times out.", 0),
                            new Ability("Artillery Strike", "Defeat Bazooker Doomlander", "Press Attack 3 for targeted overhead shots.\nHold Attack 3 to fire shots for a longer period of time.", 0),
                            new Ability("Scorched Earth", "Place a Bazooker Sensei on the portal", "Press or hold Attack 3 to scorch the ground in front of you.", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered Rocket Jump", "Upgrade Rocket Jump", "Press Attack 3 to rocket-jump and shoot explosions on your way down for a speed and strength boost on landing.", 2000),
                            new Ability("Mastered Birthday Present", "Upgrade Birthday Present", "Press Attack 3 to drop a bomb that explodes three times.", 2000),
                            new Ability("Mastered Artillery Strike", "Upgrade Artillery Strike", "Press Attack 3 for targeted overhead shots that fall down more frequently.\nHold Attack 3 for a barrage of volleys.", 2000),
                            new Ability("Mastered Scorched Earth", "Upgrade Scorched Earth", "Press or hold Attack 3 to create a vortex grenade that pulls enemies towards the scorched impact area.", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("1M4G1N1T3 Payload", "Requires Soul Gem from Scholarville", "Hold Special Attack to launch a missile pack with Imaginite Explosives.", 4000)
            )),
    BOWSLINGER("Bowslinger", Chapter.DRAGON_TEMPLE,
            new BattleClassAbilityTree(
                    // Primary Attack Options
                    new Ability[]{
                            new Ability("", "", 0),
                            new Ability("", "", 0)
                    },
                    // Primary Attack Upgrades
                    new Ability[]{
                            new Ability("Master ", "Upgrade ", "", 700),
                            new Ability("Master ", "Upgrade ", "", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("", "Must be at least level 2", "", 0),
                            new Ability("", "Must be at least level 4", "", 0),
                            new Ability("", "Defeat Bowslinger Doomlander", "", 0),
                            new Ability("", "Place a Bowslinger Sensei on the portal", "", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("", "Requires Soul Gem from Dragon Temple", "", 4000)
            )),
    BRAWLER("Brawler", Chapter.MUSHROOM_RIVER,
            new BattleClassAbilityTree(
                    // Primary Attack Options
                    new Ability[]{
                            new Ability("", "", 0),
                            new Ability("", "", 0)
                    },
                    // Primary Attack Upgrades
                    new Ability[]{
                            new Ability("Master ", "Upgrade ", "", 700),
                            new Ability("Master ", "Upgrade ", "", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("", "Must be at least level 2", "", 0),
                            new Ability("", "Must be at least level 4", "", 0),
                            new Ability("", "Defeat Brawler Doomlander", "", 0),
                            new Ability("", "Place a Brawler Sensei on the portal", "", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("", "Requires Soul Gem from Mushroom River", "", 4000)
            )),
    KNIGHT("Knight", Chapter.SKY_FORTRESS,
            new BattleClassAbilityTree(
                    // Primary Attack Options
                    new Ability[]{
                            new Ability("", "", 0),
                            new Ability("", "", 0)
                    },
                    // Primary Attack Upgrades
                    new Ability[]{
                            new Ability("Master ", "Upgrade ", "", 700),
                            new Ability("Master ", "Upgrade ", "", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("", "Must be at least level 2", "", 0),
                            new Ability("", "Must be at least level 4", "", 0),
                            new Ability("", "Defeat Knight Doomlander", "", 0),
                            new Ability("", "Place a Knight Sensei on the portal", "", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("", "Requires Soul Gem from Sky Fortress", "", 4000)
            )),
    NINJA("Ninja", Chapter.FIZZLAND,
            new BattleClassAbilityTree(
                    // Primary Attack Options
                    new Ability[]{
                            new Ability("", "", 0),
                            new Ability("", "", 0)
                    },
                    // Primary Attack Upgrades
                    new Ability[]{
                            new Ability("Master ", "Upgrade ", "", 700),
                            new Ability("Master ", "Upgrade ", "", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("", "Must be at least level 2", "", 0),
                            new Ability("", "Must be at least level 4", "", 0),
                            new Ability("", "Defeat Ninja Doomlander", "", 0),
                            new Ability("", "Place a Ninja Sensei on the portal", "", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("", "Requires Soul Gem from Fizzland", "", 4000)
            )),
    QUICKSHOT("Quickshot", Chapter.ABANDONED_AMUSEMENT_PARK,
            new BattleClassAbilityTree(
                    // Primary Attack Options
                    new Ability[]{
                            new Ability("", "", 0),
                            new Ability("", "", 0)
                    },
                    // Primary Attack Upgrades
                    new Ability[]{
                            new Ability("Master ", "Upgrade ", "", 700),
                            new Ability("Master ", "Upgrade ", "", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("", "Must be at least level 2", "", 0),
                            new Ability("", "Must be at least level 4", "", 0),
                            new Ability("", "Defeat Quickshot Doomlander", "", 0),
                            new Ability("", "Place a Quickshot Sensei on the portal", "", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("", "Requires Soul Gem from Abandoned Amusement Park", "", 4000)
            )),
    SENTINEL("Sentinel", Chapter.THE_LAIR_OF_KAOS,
            new BattleClassAbilityTree(
                    // Primary Attack Options
                    new Ability[]{
                            new Ability("", "", 0),
                            new Ability("", "", 0)
                    },
                    // Primary Attack Upgrades
                    new Ability[]{
                            new Ability("Master ", "Upgrade ", "", 700),
                            new Ability("Master ", "Upgrade ", "", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("", "Must be at least level 2", "", 0),
                            new Ability("", "Must be at least level 4", "", 0),
                            new Ability("", "Defeat Sentinel Doomlander", "", 0),
                            new Ability("", "Place a Sentinel Sensei on the portal", "", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("", "Requires Soul Gem from The Lair of Kaos", "", 4000)
            )),
    SMASHER("Smasher", Chapter.THE_GOLDEN_ARCADE,
            new BattleClassAbilityTree(
                    // Primary Attack Options
                    new Ability[]{
                            new Ability("", "", 0),
                            new Ability("", "", 0)
                    },
                    // Primary Attack Upgrades
                    new Ability[]{
                            new Ability("Master ", "Upgrade ", "", 700),
                            new Ability("Master ", "Upgrade ", "", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("", "Must be at least level 2", "", 0),
                            new Ability("", "Must be at least level 4", "", 0),
                            new Ability("", "Defeat Smasher Doomlander", "", 0),
                            new Ability("", "Place a Smasher Sensei on the portal", "", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("", "Requires Soul Gem from The Golden Arcade", "", 4000)
            )),
    SORCERER("Sorcerer", Chapter.CRADLE_OF_CREATION,
            new BattleClassAbilityTree(
                    // Primary Attack Options
                    new Ability[]{
                            new Ability("", "", 0),
                            new Ability("", "", 0)
                    },
                    // Primary Attack Upgrades
                    new Ability[]{
                            new Ability("Master ", "Upgrade ", "", 700),
                            new Ability("Master ", "Upgrade ", "", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("", "Must be at least level 2", "", 0),
                            new Ability("", "Must be at least level 4", "", 0),
                            new Ability("", "Defeat Sorcerer Doomlander", "", 0),
                            new Ability("", "Place a Sorcerer Sensei on the portal", "", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("", "Requires Soul Gem from Cradle of Creation", "", 4000)
            )),
    SWASHBUCKLER("Swashbuckler", Chapter.SHELLMONT_SHORES,
            new BattleClassAbilityTree(
                    // Primary Attack Options
                    new Ability[]{
                            new Ability("", "", 0),
                            new Ability("", "", 0)
                    },
                    // Primary Attack Upgrades
                    new Ability[]{
                            new Ability("Master ", "Upgrade ", "", 700),
                            new Ability("Master ", "Upgrade ", "", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("", "Must be at least level 2", "", 0),
                            new Ability("", "Must be at least level 4", "", 0),
                            new Ability("", "Defeat Swashbuckler Doomlander", "", 0),
                            new Ability("", "Place a Swashbuckler Sensei on the portal", "", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                            new Ability("Mastered ", "Upgrade ", "", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("", "Requires Soul Gem from Shellmont Shores", "", 4000)
            )),
    KAOS("Kaos (Battle Class)", null, null);

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
