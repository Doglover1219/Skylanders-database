package net.doglover.dlrskydatabase.games.chapters;

import net.doglover.dlrskydatabase.games.Game;
import net.doglover.dlrskydatabase.games.chapters.objectives.CollectionObjective;
import net.doglover.dlrskydatabase.games.chapters.objectives.Objective;
import net.doglover.dlrskydatabase.games.chapters.objectives.TimeObjective;
import net.doglover.dlrskydatabase.games.chapters.objectives.TitleObjective;

import java.util.ArrayList;
import java.util.List;

public enum Chapter {
    // Palceholders:
    SSF("SSF", 0, Game.SWAP_FORCE, false,
            objective1(""),
            objective1(""),
            objective1("")),
    STT("STT", 0, Game.TRAP_TEAM, false,
            objective1(""),
            objective1(""),
            objective1("")),
    SSC("SSC", 0, Game.SUPERCHARGERS, false,
            objective1(""),
            objective1(""),
            objective1("")),

    // Spyro's Adventure chapters
    SHATTERED_ISLAND("Shattered Island", 1, Game.SPYROS_ADVENTURE, true,
            objective1("Rescue the Villagers"),
            ssaObjective2(3, 48),
            ssaObjective3(1, 3)),
    PERILOUS_PASTURES("Perilous Pastures", 2, Game.SPYROS_ADVENTURE, true,
            objective1("Find Cali"),
            ssaObjective2(3, 51),
            ssaObjective3(1, 2)),
    SKY_SCHOONER_DOCKS("Sky Schooner Docks", 3, Game.SPYROS_ADVENTURE, true,
            objective1("Find the Golden Propeller"),
            ssaObjective2(7, 59),
            ssaObjective3(1, 2)),
    STORMY_STRONGHOLD("Stormy Stronghold", 4, Game.SPYROS_ADVENTURE, true,
            objective1("Rebuild the Bridge", "Find the Eternal Air Source"),
            ssaObjective2(5, 22),
            ssaObjective3(1, 2)),
    OILSPILL_ISLAND("Oilspill Island", 5, Game.SPYROS_ADVENTURE, true,
            objective1("Free the caged Gillmen", "Destroy the Troll Refinery"),
            ssaObjective2(5, 7),
            ssaObjective3(2, 1)),
    DARK_WATER_COVE("Dark Water Cove", 6, Game.SPYROS_ADVENTURE, true,
            objective1("Find the Twin Spouts' Location", "Retrieve the Twin Spouts", "Escape in the Pirate Ship"),
            ssaObjective2(6, 3),
            ssaObjective3(2, 2)),
    LEVIATHAN_LAGOON("Leviathan Lagoon", 7, Game.SPYROS_ADVENTURE, true,
            objective1("Bring 4 Statues to the Shrine", "Find the Eternal Water Source"),
            ssaObjective2(9, 5),
            ssaObjective3(1, 1)),
    CRYSTAL_EYE_CASTLE("Crystal Eye Castle", 8, Game.SPYROS_ADVENTURE, true,
            objective1("Destroy the two Towers", "Get the Crystal Eye"),
            ssaObjective2(5, 59),
            ssaObjective3(1, 2)),
    STONETOWN("Stonetown", 9, Game.SPYROS_ADVENTURE, true,
            objective1("Defeat the Stone Golem"),
            ssaObjective2(7, 39),
            ssaObjective3(2, 1)),
    TREETOP_TERRACE("Treetop Terrace", 10, Game.SPYROS_ADVENTURE, true,
            objective1("Collect the Life Seeds"),
            ssaObjective2(5, 54),
            ssaObjective3(1, 1)),
    FALLING_FOREST("Falling Forest", 11, Game.SPYROS_ADVENTURE, true,
            objective1("Find the Eternal Life Source"),
            ssaObjective2(7, 43),
            ssaObjective3(1, 1)),
    TROLL_WAREHOUSE("Troll Warehouse", 12, Game.SPYROS_ADVENTURE, true,
            objective1("Find the Troll Warehouse", "Find the pieces of the Map", "Get through the Minefield"),
            ssaObjective2(8, 53),
            ssaObjective3(1, 2)),
    GOO_FACTORY("Goo Factory", 13, Game.SPYROS_ADVENTURE, true,
            objective1("Find the Mabu Captain", "Level the wall with MEGA BOMB", "Raise all Goo Factory Flags"),
            ssaObjective2(6, 36),
            ssaObjective3(1, 2)),
    BATTLEFIELD("Battlefield", 14, Game.SPYROS_ADVENTURE, true,
            objective1("Find the Command Team", "Get the Tech Source from the Fort"),
            ssaObjective2(4, 25),
            ssaObjective3(2, 1)),
    CRAWLING_CATACOMBS("Crawling Catacombs", 15, Game.SPYROS_ADVENTURE, true,
            objective1("Find the Skull Mask"),
            ssaObjective2(5, 8),
            ssaObjective3(1, 1)),
    CADAVEROUS_CRYPT("Cadaverous Crypt", 16, Game.SPYROS_ADVENTURE, true,
            objective1("Find the Skeleton Key"),
            ssaObjective2(5, 53),
            ssaObjective3(2, 2)),
    CREEPY_CITADEL("Creepy Citadel", 17, Game.SPYROS_ADVENTURE, true,
            objective1("Enter the Castle", "Collect the Undead Source"),
            ssaObjective2(12, 3),
            ssaObjective3(1, 1)),
    MOLEKIN_MINE("Molekin Mine", 18, Game.SPYROS_ADVENTURE, true,
            objective1("Rescue all Molekin Miners", "Roll Molekin in cart to safety"),
            ssaObjective2(5, 53),
            ssaObjective3(2, 1)),
    LAVA_LAKES_RAILWAY("Lava Lakes Railway", 19, Game.SPYROS_ADVENTURE, true,
            objective1("Set each of the track switches", "Repair the train tracks", "Find the Eternal Fire Source"),
            ssaObjective2(6, 29),
            ssaObjective3(1, 1)),
    QUICKSILVER_VAULT("Quicksilver Vault", 20, Game.SPYROS_ADVENTURE, true,
            objective1("Unlock the Gate to the Quicksilver", "Activate the Vault Beams", "Find the vial of Quicksilver"),
            ssaObjective2(6, 43),
            ssaObjective3(1, 1)),
    ARKEYAN_ARMORY("Arkeyan Armory", 21, Game.SPYROS_ADVENTURE, true,
            objective1("Use War Machine to find Temple", "Use Security Card on Panel", "Use switches to get the Source"),
            ssaObjective2(10, 8),
            ssaObjective3(1, 1)),
    LAIR_OF_KAOS("Lair of Kaos", 22, Game.SPYROS_ADVENTURE, true,
            objective1("Find the entrance to the castle"),
            ssaObjective2(8, 51),
            ssaObjective3(1, 1)),

    EMPIRE_OF_ICE("Empire of Ice", 23, Game.SPYROS_ADVENTURE, false,
            objective1("Find parts to fix the Catapult", "Destroy the Wall"),
            ssaObjective2(12, 11),
            ssaObjective3(1, 2)),
    PIRATE_SEAS("Pirate Seas", 24, Game.SPYROS_ADVENTURE, false,
            objective1("Defeat the Pirates", "Destroy the Island defences", "Defeat Dreadbeard"),
            ssaObjective2(17, 34),
            ssaObjective3(1, 2)),
    DARKLIGHT_CRYPT("Darklight Crypt", 25, Game.SPYROS_ADVENTURE, false,
            objective1("Find the Undead Customer", "Find Occulous and defeat him", "Talk to Gallant"),
            ssaObjective2(17, 17),
            ssaObjective3(1, 2)),
    DRAGONS_PEAK("Dragon's Peak", 26, Game.SPYROS_ADVENTURE, false,
            objective1("Find the Dragon's Throne", "Find the Dragon's Throne"),
            ssaObjective2(16, 56),
            ssaObjective3(1, 2)),

    // --- Giants Chapters ---
    TIME_OF_THE_GIANTS("Time of the Giants", 1, Game.GIANTS, true,
            objective1("Meet Norticus", "Free the Mabu Slaves"),
            sgObjective2(4, 20, 40, 12),
            sgObjective3(3)),
    JUNKYARD_ISLES("Junkyard Isles", 2, Game.GIANTS, true,
            objective1("Find the Music Box", "Buy the Engine", "Find the Compass"),
            sgObjective2(5, 30, 60, 21),
            sgObjective3(2)),
    RUMBLETOWN("Rumbletown", 3, Game.GIANTS, true,
            objective1("Locate the Hermit", "Win the Arena"),
            sgObjective2(8, 40, 185, 20),
            sgObjective3(2)),
    CUTTHROAT_CARNIVAL("Cutthroat Carnival", 4, Game.GIANTS, true,
            objective1("Repair the Ship"),
            sgObjective2(8, 15, 80, 18),
            sgObjective3(2)),
    GLACIER_GULLY("Glacier Gully", 5, Game.GIANTS, true,
            objective1("Find the Giant Robot"),
            sgObjective2(7, 40, 75, 15),
            sgObjective3(2)),
    SECRET_VAULT_OF_SECRETS("Secret Vault of Secrets", 6, Game.GIANTS, true,
            objective1("Unlocked the East Dam", "Unlocked the West Dam", "Opened the Arkeyan Vault"),
            sgObjective2(13, 10, 50, 15),
            sgObjective3(2)),
    WILLIKIN_VILLAGE("Willikin Village", 7, Game.GIANTS, true,
            objective1("Enter Willikin World", "Clear out all the Monsters", "Beat the Chompy Mage"),
            sgObjective2(11, 15, 95, 22),
            sgObjective3(2)),
    TROLL_HOME_SECURITY("Troll Home Security", 8, Game.GIANTS, true,
            objective1("Trigger the Explosives", "Take out the Big Cannons", "Destroy the Shield Gun"),
            sgObjective2(7, 5, 115, 14),
            sgObjective3(2)),
    KAOS_CASTLE("Kaos' Castle", 9, Game.GIANTS, true,
            objective1("Enter the Castle", "Remove the 2 Arena Door Locks", "Defeat the Arena Master"),
            sgObjective2(11, 50, 110, 24),
            sgObjective3(2)),
    AERIAL_ATTACK("Aerial Attack!", 10, Game.GIANTS, true,
            objective1("Survive the Attack", "Destroy the 2 Turrets", "Sink the Dreadnaught"),
            sgObjective2(13, 30, 135, 14),
            sgObjective3(2)),
    DRILL_XS_BIG_RIG("Drill-X's Big Rig", 11, Game.GIANTS, true,
            objective1("Defeat the Drill", "Find the Big Drill"),
            sgObjective2(8, 0, 85, 22),
            sgObjective3(2)),
    MOLEKIN_MOUNTAIN("Molekin Mountain", 12, Game.GIANTS, true,
            objective1("Rid the Village of Bad Guys", "Overthrow Pipsqueak"),
            sgObjective2(10, 40, 140, 15),
            sgObjective3(2)),
    THE_ORACLE("The Oracle", 13, Game.GIANTS, true,
            objective1("Pass the Oracle's Trials"),
            sgObjective2(5, 25, 50, 14),
            sgObjective3(2)),
    AUTOGYRO_ADVENTURE("Autogyro Adventure", 14, Game.GIANTS, true,
            objective1("Reached the Machine", "Unlocked the Gate to Arkus", "Escaped the Caverns"),
            sgObjective2(14, 50, 40, 15),
            sgObjective3(2)),
    LOST_CITY_OF_ARKUS("Lost City of Arkus", 15, Game.GIANTS, true,
            objective1("Enter the Palace"),
            sgObjective2(6, 40, 55, 23),
            sgObjective3(2)),
    BRINGING_ORDER_TO_KAOS("Bringing order to Kaos!", 16, Game.GIANTS, true,
            objective1("Destroy the Fist of Arkus", "Find the Arkeyan Throne Room"),
            sgObjective2(8, 50, 65, 15),
            sgObjective3(2)),

    // --- Swap Force Chapters ---

    // --- Trap Team chapters ---

    // SuperChargers levels ---
    THE_RIFT_TO_SKYLANDS("The Rift to Skylands", 1, Game.SUPERCHARGERS, true,
            objective1("Save the Espace Pods"),
            objective1("Save the Pit Crew"),
            objective1("Destroy the Catalytic Cyclotron")),

    // --- Imaginators chapters ---
    CRADLE_OF_CREATION("Cradle of Creation", 1, Game.IMAGINATORS, true,
            objective1("Reach the Mountain", "Escape the Maze", "Complete each path", "Get to the Doomlander"),
            siObjective2(3, 1, 3),
            siObjective3(25, 14, 9, 0)),
    MUSHROOM_RIVER("Mushroom River", 2, Game.IMAGINATORS, true,
            objective1("Find the River", "Survive the Tilting Ships", "Complete the Water Pipe", "Push the Cannonballs", "Reach the End of the River"),
            siObjective2(3, 1, 3, 1),
            siObjective3(25, 13, 8, 0)),
    SCHOLARVILLE("Scholarville", 3, Game.IMAGINATORS, true,
            objective1("Reach the Cannon", "Escape the Ship", "Find the Next Cannon", "Escape the Second Ship", "Reach the Castle"),
            siObjective2(3, 1, 3, 1),
            siObjective3(25, 18, 13, 0)),
    SHELLMONT_SHORES("Shellmont Shores", 4, Game.IMAGINATORS, true,
            objective1("Shut Down the Brain Storm", "Get the Key", "Get to the Top of the Stairs!", "Get to the Top of the Brain Storm"),
            siObjective2(3, 1, 3, 1),
            siObjective3(25, 7, 12, 30)),
    SKY_FORTRESS("Sky Fortress", 5, Game.IMAGINATORS, true,
            objective1("Use the Station", "Board Vulture Dropship", "Activate the Wrecking Ball", "Reach the Hangar", "Recapture the Battleship"),
            siObjective2(3, 1, 3, 1),
            siObjective3(50, 12, 15, 0)),
    FIZZLAND("Fizzland", 6, Game.IMAGINATORS, true,
            objective1("Stop Kaos!", "Suck Up the Globules!", "Sort the Globules"),
            siObjective2(3, 1, 3, 1),
            siObjective3(40, 12)),
    THE_GOLDEN_ARCADE("The Golden Arcade", 7, Game.IMAGINATORS, true,
            objective1("Find a way inside", "Find the Brain"),
            siObjective2(3, 1, 3, 1),
            siObjective3(30, 13)),
    DRAGON_TEMPLE("Dragon Temple", 8, Game.IMAGINATORS, true,
            objective1("Climb to the Dragon Temple", "Glide down to Skylands"),
            siObjective2(3, 1, 2, 1),
            siObjective3(120, 12, 18, 20)),
    ABANDONED_AMUSEMENT_PARK("Abandoned Amusement Park", 9, Game.IMAGINATORS, true,
            objective1("Enter the Amusement Park to Decorate the Cake", "Move the Octopus", "Restore Power to the Frosting Cannon", "Frost the Cake", "Restore Power to reach the Winter Wonderland", "Defeat the Doomlander"),
            siObjective2(3, 1, 2, 1),
            siObjective3(50, 16, 16, 30)),
    THE_LAIR_OF_KAOS("The Lair of Kaos", 10, Game.IMAGINATORS, true,
            objective1("Approach Kaos' Fortress", "Play Kaos' Game Show!", "Finish the Bonus Round!"),
            siObjective2(3, 1, 2, 1),
            siObjective3(9, 3, 30)),

    THUMPIN_WUMPA_ISLANDS("Thumpin' Wumpa Islands", 11, Game.IMAGINATORS, false,
            objective1("Investigate The Island Disruption", "Meet with Spyro in Pau Pau Village", "Get to the Synchronization Dance Hall", "Defeat Fake Crash"),
            siObjective2a(6, 2, 5),
            siObjective3a(12, 12, 0, 25)),
    GRYPHON_PARK_OBSERVATORY("Gryphon Park Observatory", 12, Game.IMAGINATORS, false,
            objective1("Return Eggs to Nests", "Return Eggs to Nests", "Return Eggs to Nests"),
            siObjective2b(3, 1, 1),
            siObjective3(0, 0, 0, 0)),
    ENCHANTED_ELVEN_FOREST("Enchanted Elven Forest", 13, Game.IMAGINATORS, false,
            objective1("Save the Elven Village"),
            siObjective2b(3, 1, 1),
            siObjective3b(25, 16)),
    CURSED_TIKI_TEMPLE("Cursed Tiki Temple", 14, Game.IMAGINATORS, false,
            objective1("Ride the airship to the Cursed Tiki Temple", "Enter the Cursed Tiki Temple", "Get to the Throne"),
            siObjective2(3, 1),
            siObjective3(110, 8, 12, 0)),
    LOST_IMAGINITE_MINES("Lost Imaginite Mines", 15, Game.IMAGINATORS, false,
            objective1("Find the entrance to the Lost Imaginite Mine", "Acquire the Pure Imaginite cache", "Escape with the Pure Imaginite Cache"),
            siObjective2(3, 1),
            siObjective3(70, 11, 11, 0)),

    // - Sensei Realms -
    SENSEI_LIGHT_REALM("Sensei Light Realm",
            objective1("Rotate Crystals to Connect Lasers", "Rotate Crystals to Connect Lasers", "Rotate Crystals to Connect Lasers"),
            siObjective2(),
            siObjective3(30, 7)),
    SENSEI_AIR_REALM("Sensei Air Realm",
            objective1("Turn on the Giant Fan!"),
            siObjective2(),
            siObjective3(50, 4)),
    SENSEI_LIFE_REALM("Sensei Life Realm",
            objective1("Defeat Hidden Enemies", "Grow a Cannon", "Use Cannons to Eliminate Rats", "Find the Treasure!"),
            siObjective2(),
            siObjective3(20, 5)),
    SENSEI_UNDEAD_REALM("Sensei Undead Realm",
            objective1("Find the Arena", "Complete Arena Battle"),
            siObjective2(),
            siObjective3(90, 2, 4, 30)),
    SENSEI_EARTH_REALM("Sensei Earth Realm",
            objective1("Head into the Mine", "Head Deeper into the Mine", "Defeat Enemy Waves"),
            siObjective2(),
            siObjective3(35, 6)),
    SENSEI_FIRE_REALM("Sensei Fire Realm",
            objective1("Freeze Lava Geysers", "Open the Vault", "Return to Avril and Eruptor"),
            siObjective2(),
            siObjective3(60, 5, 5, 30)),
    SENSEI_WATER_REALM("Sensei Water Realm",
            objective1("Open the Temple Gate", "Close the Water Vortex"),
            siObjective2(),
            siObjective3(100, 5)),
    SENSEI_MAGIC_REALM("Sensei Magic Realm",
            objective1("Use Gems to Complete Maze", "Defeat Bottle Beast", "Grind the Rails"),
            siObjective2(),
            siObjective3(90, 7, 7, 0)),
    SENSEI_TECH_REALM("Sensei Tech Realm",
            objective1("Push Toy Parts into Assembly Tunnels", "Return to Pachinkinator Machine", "Collect Toy"),
            siObjective2(),
            siObjective3(6)),
    SENSEI_DARK_REALM("Sensei Dark Realm",
            objective1("Take control of the Light Ball", "Reach the Nightmare Area", "Defeat all enemies in the Nightmare Area", "Rail Grind back to the Start Area"),
            siObjective2(),
            siObjective3(25, 6));

    /* --- Fields --- */
    private final String name;
    private final int chapterNumber;
    private final Game game;
    private final boolean isMainChapter;
    private final List<Objective> objectives1;
    private final List<Objective> objectives2;
    private final List<Objective> objectives3;
    private final List<Objective> objectives;

    /* --- Constructors --- */
    Chapter(String name, int chapterNumber, Game game, boolean isMainChapter,
            List<Objective> objectives1, List<Objective> objectives2, List<Objective> objectives3) {
        this.name = name;
        this.chapterNumber = chapterNumber;
        this.game = game;
        this.isMainChapter = isMainChapter;
        this.objectives1 = objectives1;
        this.objectives2 = objectives2;
        this.objectives3 = objectives3;
        this.objectives = new ArrayList<>();
        objectives.addAll(objectives1);
        objectives.addAll(objectives2);
        objectives.addAll(objectives3);
    }
    Chapter(String name, List<Objective> objectives1, List<Objective> objectives2, List<Objective> objectives3) {
        this(name, 0, Game.IMAGINATORS, false, objectives1, objectives2, objectives3);
    }

    /* --- Getter Methods --- */
    public String getName() {
        return name;
    }
    public int getChapterNumber() {
        return chapterNumber;
    }
    public Game getGame() {
        return game;
    }
    public boolean getIsMainChapter() {
        return isMainChapter;
    }
    public List<Objective> getObjectives(int objective) {
        return switch (objective) {
            case 1 -> objectives1;
            case 2 -> objectives2;
            case 3 -> objectives3;
            default -> objectives;
        };
    }

    /* --- Static Helper Methods --- */
    static List<Objective> objective1(String... objectives) {
        List<Objective> list = new ArrayList<>();
        for (String objective : objectives) {
            list.add(new TitleObjective(objective));
        }
        return list;
    }

    // - Spyro's Adventure Helpers -
    private static List<Objective> ssaObjective2(int minutes, int seconds) {
        return List.of(
                new TitleObjective("Enemy Goal"),
                new TitleObjective("No Lives Lost"),
                new TitleObjective("All Areas Found"),
                new TimeObjective("Cleared in under ", minutes, seconds, true)
        );
    }
    private static List<Objective> ssaObjective3(int soul, int hat) {
        return List.of(
                new CollectionObjective("Soul Gems: ", soul),
                new CollectionObjective("Legendary Treasure: ", 1),
                new CollectionObjective("Hats: ", hat),
                new CollectionObjective("Treasure Chests: ", 3),
                new CollectionObjective("Story Scroll: ", 1)
        );
    }

    // - Giants Helpers -
    private static List<Objective> sgObjective2(int minutes, int seconds, int enemy, int area) {
        return List.of(
                new TimeObjective("Cleared in Under ", minutes, seconds, true),
                new CollectionObjective("Enemy Goal ", enemy),
                new CollectionObjective("All Areas Found ", area),
                new TitleObjective("No Lives Lost")
        );
    }
    private static List<Objective> sgObjective3(int hats) {
        return List.of(
                new CollectionObjective("Soul Gem Found ", 1),
                new CollectionObjective("Legendary Treasure Found ", 1),
                new CollectionObjective("All Hats Found ", hats),
                new CollectionObjective("Treasure Chests Found ", 4),
                new CollectionObjective("Story Scroll Found ", 1),
                new CollectionObjective("Winged Sapphire Found ", 1),
                new CollectionObjective("Luck-O-Tron Wheel Found ", 1)
        );
    }

    // - Imaginators Helpers -
    private static List<Objective> siObjective2(int chest, int frame, int soul) {
        return List.of(
                new CollectionObjective("Treasure Chests ", chest),
                new CollectionObjective("Legendary Selfie Frame ", frame),
                new CollectionObjective("Soul Gems ", soul)
        );
    }
    private static List<Objective> siObjective2() {
        return List.of(
                new CollectionObjective("Treasure Chests ", 3),
                new CollectionObjective("Legendary Selfie Frame ", 1),
                new CollectionObjective("Soul Gems ", 1)
        );
    }
    private static List<Objective> siObjective2(int chest, int frame, int soul, int radio) {
        return List.of(
                new CollectionObjective("Treasure Chests ", chest),
                new CollectionObjective("Legendary Selfie Frame ", frame),
                new CollectionObjective("Soul Gems ", soul),
                new CollectionObjective("Troll Radio ", radio)
        );
    }
    private static List<Objective> siObjective2(int chest, int radio) {
        return List.of(
                new CollectionObjective("Treasure Chests ", chest),
                new CollectionObjective("Troll Radio ", radio)
        );
    }
    private static List<Objective> siObjective2a(int chest, int soul, int boom_boxes) {
        return List.of(
                new CollectionObjective("Treasure Chests ", chest),
                new CollectionObjective("Soul Gems ", soul),
                new CollectionObjective("Boom Boxes ", boom_boxes)
        );
    }
    private static List<Objective> siObjective2b(int chest, int soul, int radio) {
        return List.of(
                new CollectionObjective("Treasure Chests ", chest),
                new CollectionObjective("Soul Gems ", soul),
                new CollectionObjective("Troll Radio ", radio)
        );
    }
    private static List<Objective> siObjective3(int enemies, int areas, int minutes, int seconds) {
        return List.of(
                new TitleObjective("Battle Gong"),
                new TitleObjective("No Lives Lost"),
                new CollectionObjective("Defeat Enemies ", enemies),
                new CollectionObjective("Find All Areas ", areas),
                new TimeObjective("Speed Run ", minutes, seconds, false)
        );
    }
    private static List<Objective> siObjective3(int enemies, int areas) {
        return List.of(
                new TitleObjective("No Lives Lost"),
                new CollectionObjective("Defeat Enemies ", enemies),
                new CollectionObjective("Find All Areas ", areas)
        );
    }
    private static List<Objective> siObjective3(int areas) {
        return List.of(
                new TitleObjective("No Lives Lost"),
                new CollectionObjective("Find All Areas ", areas)
        );
    }
    private static List<Objective> siObjective3(int areas, int minutes, int seconds) {
        return List.of(
                new TitleObjective("Battle Gong"),
                new TitleObjective("No Lives Lost"),
                new CollectionObjective("Find All Areas ", areas),
                new TimeObjective("Speed Run ", minutes, seconds, false)
        );
    }
    private static List<Objective> siObjective3a(int areas, int minutes, int seconds, int enemies) {
        return List.of(
                new CollectionObjective("Find All Areas ", areas),
                new TitleObjective("No Lives Lost"),
                new TimeObjective("Speed Run", minutes, seconds, false),
                new CollectionObjective("Defeated Enemies ", enemies)
        );
    }
    private static List<Objective> siObjective3b(int enemies, int areas) {
        return List.of(
                new TitleObjective("Battle Gong"),
                new TitleObjective("No Lives Lost"),
                new CollectionObjective("Defeat Enemies ", enemies),
                new CollectionObjective("Find All Areas ", areas)
        );
    }
}
