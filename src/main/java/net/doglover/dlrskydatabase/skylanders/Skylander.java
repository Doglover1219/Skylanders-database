package net.doglover.dlrskydatabase.skylanders;

import net.doglover.dlrskydatabase.games.Game;
import net.doglover.dlrskydatabase.games.chapters.Chapter;
import net.doglover.dlrskydatabase.skylanders.abilities.SkylanderAbilityTree;
import net.doglover.dlrskydatabase.skylanders.alignment.BattleClass;
import net.doglover.dlrskydatabase.skylanders.alignment.Element;
import net.doglover.dlrskydatabase.skylanders.alignment.SwapAbility;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Skylander {
    /* --- Static Fields --- */
    public static final List<Skylander> REGISTRY = new ArrayList<Skylander>();

    /* --- Spyro's Adventure --- */
    // - Air -
    public static final Skylander LIGHTNING_ROD = new Builder("Lightning Rod", Game.SPYROS_ADVENTURE, Element.AIR)
            .catchphrase("One Strike and You're Out!").soulGemChapter(Chapter.STONETOWN).build();
    public static final Skylander SONIC_BOOM = new Builder("Sonic Boom", Game.SPYROS_ADVENTURE, Element.AIR)
            .gender(Gender.FEMALE).catchphrase("Full Scream Ahead").soulGemChapter(Chapter.SKY_SCHOONER_DOCKS).build();
    public static final Skylander WARNADO = new Builder("Warnado", Game.SPYROS_ADVENTURE, Element.AIR)
            .catchphrase("For the Wind!").soulGemChapter(Chapter.STORMY_STRONGHOLD).build();
    public static final Skylander WHIRLWIND = new Builder("Whirlwind", Game.SPYROS_ADVENTURE, Element.AIR)
            .catchphrase("Twists of Fury!").soulGemChapter(Chapter.CREEPY_CITADEL).build();

    // - Life -
    public static final Skylander CAMO = new Builder("Camo", Game.SPYROS_ADVENTURE, Element.LIFE)
            .catchphrase("Fruit Punch!").soulGemChapter(Chapter.GOO_FACTORY).build();
    public static final Skylander STEALTH_ELF = new Builder("Stealth Elf", Game.SPYROS_ADVENTURE, Element.LIFE)
            .catchphrase("Silent but Deadly!").soulGemChapter(Chapter.FALLING_FOREST).build();
    public static final Skylander SIDEKICK_WHISPER_ELF = new Builder("Sidekick Whisper Elf", Game.SPYROS_ADVENTURE, Element.LIFE)
            .type(SkylanderType.SIDEKICK).baseVariant(STEALTH_ELF).build();
    public static final Skylander STUMP_SMASH = new Builder("Stump Smash", Game.SPYROS_ADVENTURE, Element.LIFE)
            .catchphrase("Drop the Hammer!").soulGemChapter(Chapter.PERILOUS_PASTURES).build();
    public static final Skylander ZOOK = new Builder("Zook", Game.SPYROS_ADVENTURE, Element.LIFE)
            .catchphrase("Locked and Loaded!").soulGemChapter(Chapter.TROLL_WAREHOUSE).build();

    // - Undead -
    public static final Skylander CHOP_CHOP = new Builder("Chop Chop", Game.SPYROS_ADVENTURE, Element.UNDEAD)
            .catchphrase("Slice and Dice!").soulGemChapter(Chapter.SHATTERED_ISLAND).build();
    public static final Skylander LEGENDARY_CHOP_CHOP = new Builder("Legendary Chop Chop", Game.SPYROS_ADVENTURE, Element.UNDEAD)
            .baseVariant(CHOP_CHOP).build();
    public static final Skylander CYNDER = new Builder("Cynder", Game.SPYROS_ADVENTURE, Element.UNDEAD)
            .gender(Gender.FEMALE).catchphrase("Volts and Lightning!").soulGemChapter(Chapter.MOLEKIN_MINE).build();
    public static final Skylander GHOST_ROASTER = new Builder("Ghost Roaster", Game.SPYROS_ADVENTURE, Element.UNDEAD)
            .catchphrase("No Chain, No Gain!").soulGemChapter(Chapter.DARKLIGHT_CRYPT).build();
    public static final Skylander HEX = new Builder("Hex",Game.SPYROS_ADVENTURE, Element.UNDEAD)
            .gender(Gender.FEMALE).catchphrase("Fear the Dark!").soulGemChapter(Chapter.CADAVEROUS_CRYPT).build();

    // - Earth -
    public static final Skylander BASH = new Builder("Bash", Game.SPYROS_ADVENTURE, Element.EARTH)
            .catchphrase("Rock and Roll!").soulGemChapter(Chapter.STONETOWN).build();
    public static final Skylander LEGENDARY_BASH = new Builder("Legendary Bash", Game.SPYROS_ADVENTURE, Element.EARTH)
            .baseVariant(BASH).build();
    public static final Skylander DINO_RANG = new Builder("Dino-Rang", Game.SPYROS_ADVENTURE, Element.EARTH)
            .catchphrase("Come 'Rang or Shine!").soulGemChapter(Chapter.DARK_WATER_COVE).build();
    public static final Skylander PRISM_BREAK = new Builder("Prism Break", Game.SPYROS_ADVENTURE, Element.EARTH)
            .catchphrase("The Beam is Supreme!").soulGemChapter(Chapter.CRYSTAL_EYE_CASTLE).build();
    public static final Skylander TERRAFIN = new Builder("Terrafin", Game.SPYROS_ADVENTURE, Element.EARTH)
            .catchphrase("It's Feeding Time!").soulGemChapter(Chapter.PIRATE_SEAS).build();
    public static final Skylander SIDEKICK_TERRABITE = new Builder("Sidekick Terrabite", Game.SPYROS_ADVENTURE, Element.EARTH)
            .type(SkylanderType.SIDEKICK).baseVariant(TERRAFIN).build();

    // - Fire -
    public static final Skylander ERUPTOR = new Builder("Eruptor", Game.SPYROS_ADVENTURE, Element.FIRE)
            .catchphrase("Born to Burn!").soulGemChapter(Chapter.LAVA_LAKES_RAILWAY).build();
    public static final Skylander FLAMESLINGER = new Builder("Flameslinger", Game.SPYROS_ADVENTURE, Element.FIRE)
            .catchphrase("Let the Flames Begin!").soulGemChapter(Chapter.MOLEKIN_MINE).build();
    public static final Skylander IGNITOR = new Builder("Ignitor", Game.SPYROS_ADVENTURE, Element.FIRE)
            .catchphrase("Slash and Burn!").soulGemChapter(Chapter.DARK_WATER_COVE).build();
    public static final Skylander SUNBURN = new Builder("Sunburn", Game.SPYROS_ADVENTURE, Element.FIRE)
            .catchphrase("Roast N' Toast!").soulGemChapter(Chapter.DRAGONS_PEAK).build();

    // - Water -
    public static final Skylander GILL_GRUNT = new Builder("Gill Grunt", Game.SPYROS_ADVENTURE, Element.WATER)
            .catchphrase("Fear the fish!").soulGemChapter(Chapter.TREETOP_TERRACE).build();
    public static final Skylander SIDEKICK_GILL_RUNT = new Builder("Sidekick Gill Runt", Game.SPYROS_ADVENTURE, Element.WATER)
            .type(SkylanderType.SIDEKICK).baseVariant(GILL_GRUNT).build();
    public static final Skylander SLAM_BAM = new Builder("Slam Bam", Game.SPYROS_ADVENTURE, Element.WATER)
            .catchphrase("Armed and Dangerous!").soulGemChapter(Chapter.EMPIRE_OF_ICE).build();
    public static final Skylander WHAM_SHELL = new Builder("Wham-Shell", Game.SPYROS_ADVENTURE, Element.WATER)
            .catchphrase("Brace for the Mace!").soulGemChapter(Chapter.OILSPILL_ISLAND).build();
    public static final Skylander ZAP = new Builder("Zap", Game.SPYROS_ADVENTURE, Element.WATER)
            .catchphrase("Ride the Lightning!").soulGemChapter(Chapter.LEVIATHAN_LAGOON).build();

    // - Magic -
    public static final Skylander DOUBLE_TROUBLE = new Builder("Double Trouble", Game.SPYROS_ADVENTURE, Element.MAGIC)
            .catchphrase("Boom Shock-A-Laka!").soulGemChapter(Chapter.LAIR_OF_KAOS).build();
    public static final Skylander SPYRO = new Builder("Spyro", Game.SPYROS_ADVENTURE, Element.MAGIC)
            .catchphrase("All Fired Up!").soulGemChapter(Chapter.CRAWLING_CATACOMBS).build();
    public static final Skylander DARK_SPYRO = new Builder("Dark Spyro", Game.SPYROS_ADVENTURE, Element.MAGIC)
            .baseVariant(SPYRO).build();
    public static final Skylander LEGENDARY_SPYRO = new Builder("Legendary Spyro", Game.SPYROS_ADVENTURE, Element.MAGIC)
            .baseVariant(SPYRO).build();
    public static final Skylander VOODOOD = new Builder("Voodood", Game.SPYROS_ADVENTURE, Element.MAGIC)
            .catchphrase("Axe First, Questions Later!").soulGemChapter(Chapter.ARKEYAN_ARMORY).build();
    public static final Skylander WRECKING_BALL = new Builder("Wrecking Ball", Game.SPYROS_ADVENTURE, Element.MAGIC)
            .catchphrase("Wreck-N-Roll!").soulGemChapter(Chapter.QUICKSILVER_VAULT).build();

    // - Tech -
    public static final Skylander BOOMER = new Builder("Boomer", Game.SPYROS_ADVENTURE, Element.TECH)
            .catchphrase("Bring the Boom!").soulGemChapter(Chapter.OILSPILL_ISLAND).build();
    public static final Skylander DRILL_SERGEANT = new Builder("Drill Sergeant", Game.SPYROS_ADVENTURE, Element.TECH)
            .catchphrase("Licensed to Drill!").soulGemChapter(Chapter.BATTLEFIELD).build();
    public static final Skylander DROBOT = new Builder("Drobot", Game.SPYROS_ADVENTURE, Element.TECH)
            .catchphrase("Blink and Destroy!").soulGemChapter(Chapter.BATTLEFIELD).build();
    public static final Skylander TRIGGER_HAPPY = new Builder("Trigger Happy", Game.SPYROS_ADVENTURE, Element.TECH)
            .catchphrase("No Gold, No Glory!").soulGemChapter(Chapter.CADAVEROUS_CRYPT).build();
    public static final Skylander LEGENDARY_TRIGGER_HAPPY = new Builder("Legendary Trigger Happy", Game.SPYROS_ADVENTURE, Element.TECH)
            .baseVariant(TRIGGER_HAPPY).build();
    public static final Skylander SIDEKICK_TRIGGER_SNAPPY = new Builder("Sidekick Trigger Snappy", Game.SPYROS_ADVENTURE, Element.TECH)
            .type(SkylanderType.SIDEKICK).baseVariant(TRIGGER_HAPPY).build();

    /* --- Giants --- */
    // - Air -
    public static final Skylander SWARM = new Builder("Swarm", Game.GIANTS, Element.AIR)
            .type(SkylanderType.GIANT).catchphrase("Bring the Sting!").soulGemChapter(Chapter.CUTTHROAT_CARNIVAL).build();
    public static final Skylander JET_VAC = new Builder("Jet-Vac", Game.GIANTS, Element.AIR)
            .catchphrase("Hawk and awe!").soulGemChapter(Chapter.AUTOGYRO_ADVENTURE).build();
    public static final Skylander LEGENDARY_JET_VAC = new Builder("Legendary Jet-Vac", Game.GIANTS, Element.AIR)
            .baseVariant(JET_VAC).build();
    public static final Skylander LIGHTCORE_JET_VAC = new Builder("LightCore Jet-Vac", Game.GIANTS, Element.AIR)
            .baseVariant(JET_VAC).build();
    
    public static final Skylander SERIES2_LIGHTNING_ROD = new Builder("Series 2 Lightning Rod", Game.GIANTS, Element.AIR)
            .baseVariant(LIGHTNING_ROD).build();
    public static final Skylander SERIES2_SONIC_BOOM = new Builder("Series 2 Sonic Boom", Game.GIANTS, Element.AIR)
            .baseVariant(SONIC_BOOM).build();
    public static final Skylander SERIES2_WHIRLWIND = new Builder("Series 2 Whirlwind", Game.GIANTS, Element.AIR)
            .baseVariant(WHIRLWIND).build();
    public static final Skylander POLAR_WHIRLWIND = new Builder("Polar Whirlwind", Game.GIANTS, Element.AIR)
            .baseVariant(WHIRLWIND).build();

    // - Life -
    public static final Skylander TREE_REX = new Builder("Tree Rex", Game.GIANTS, Element.LIFE)
            .type(SkylanderType.GIANT).catchphrase("Be Afraid of the Bark!").soulGemChapter(Chapter.MOLEKIN_MOUNTAIN).build();
    public static final Skylander GNARLY_TREE_REX = new Builder("Gnarly Tree Rex", Game.GIANTS, Element.LIFE)
            .baseVariant(TREE_REX).build();
    public static final Skylander SIDEKICK_BARKLEY = new Builder("Sidekick Barkley", Game.GIANTS, Element.LIFE)
            .type(SkylanderType.SIDEKICK).baseVariant(TREE_REX).build();
    public static final Skylander SIDEKICK_GNARLY_BARKLEY = new Builder("Sidekick Gnarly Barkley", Game.GIANTS, Element.LIFE)
            .type(SkylanderType.SIDEKICK).baseVariant(TREE_REX).build();
    public static final Skylander SHROOMBOOM = new Builder("Shroomboom", Game.GIANTS, Element.LIFE)
            .catchphrase("He Shoots, He Spores!").soulGemChapter(Chapter.TIME_OF_THE_GIANTS).build();
    public static final Skylander LIGHTCORE_SHROOMBOOM = new Builder("LightCore Shroomboom", Game.GIANTS, Element.LIFE)
            .baseVariant(SHROOMBOOM).build();

    public static final Skylander SERIES2_STEALTH_ELF = new Builder("Series 2 Stealth Elf", Game.GIANTS, Element.LIFE)
            .baseVariant(STEALTH_ELF).build();
    public static final Skylander LEGENDARY_STEALTH_ELF = new Builder("Legendary Stealth Elf", Game.GIANTS, Element.LIFE)
            .baseVariant(STEALTH_ELF).build();
    public static final Skylander SERIES2_STUMP_SMASH = new Builder("Series 2 Stump Smash", Game.GIANTS, Element.LIFE)
            .baseVariant(STUMP_SMASH).build();
    public static final Skylander SERIES2_ZOOK = new Builder("Series 2 Zook", Game.GIANTS, Element.LIFE)
            .baseVariant(ZOOK).build();

    // - Undead -
    public static final Skylander EYE_BRAWL = new Builder("Eye Brawl", Game.GIANTS, Element.UNDEAD)
            .type(SkylanderType.GIANT).catchphrase("I've got my eye on you!").soulGemChapter(Chapter.THE_ORACLE).build();
    public static final Skylander SIDEKICK_EYE_SMALL = new Builder("Sidekick Eye Small", Game.GIANTS, Element.UNDEAD)
            .type(SkylanderType.SIDEKICK).baseVariant(EYE_BRAWL).build();
    public static final Skylander FRIGHT_RIDER = new Builder("Fright Rider", Game.GIANTS, Element.UNDEAD)
            .catchphrase("Fear the Spear!").soulGemChapter(Chapter.AERIAL_ATTACK).build();

    public static final Skylander SERIES2_CHOP_CHOP = new Builder("Series 2 Chop Chop", Game.GIANTS, Element.UNDEAD)
            .baseVariant(CHOP_CHOP).build();
    public static final Skylander SERIES2_CYNDER = new Builder("Series 2 Cynder", Game.GIANTS, Element.UNDEAD)
            .baseVariant(CYNDER).build();
    public static final Skylander SERIES2_HEX = new Builder("Series 2 Hex", Game.GIANTS, Element.UNDEAD)
            .baseVariant(HEX).build();
    public static final Skylander LIGHTCORE_HEX = new Builder("LightCore Hex", Game.GIANTS, Element.UNDEAD)
            .baseVariant(HEX).build();

    // - Earth -
    public static final Skylander CRUSHER = new Builder("Crusher", Game.GIANTS, Element.EARTH)
            .type(SkylanderType.GIANT).catchphrase("It's crush hour!").soulGemChapter(Chapter.TROLL_HOME_SECURITY).build();
    public static final Skylander GRANITE_CRUSHER = new Builder("Granite Crusher", Game.GIANTS, Element.EARTH)
            .baseVariant(CRUSHER).build();
    public static final Skylander FLASHWING = new Builder("Flashwing", Game.GIANTS, Element.EARTH)
            .gender(Gender.FEMALE).catchphrase("Blinded by the Light!").soulGemChapter(Chapter.BRINGING_ORDER_TO_KAOS).build();
    public static final Skylander JADE_FLASHWING = new Builder("Jade Flashwing", Game.GIANTS, Element.EARTH)
            .baseVariant(FLASHWING).build();

    public static final Skylander SERIES2_BASH = new Builder("Series 2 Bash", Game.GIANTS, Element.EARTH)
            .baseVariant(BASH).build();
    public static final Skylander SERIES2_PRISM_BREAK = new Builder("Series 2 Prism Break", Game.GIANTS, Element.EARTH)
            .baseVariant(PRISM_BREAK).build();
    public static final Skylander LIGHTCORE_PRISM_BREAK = new Builder("LightCore Prism Break", Game.GIANTS, Element.EARTH)
            .baseVariant(PRISM_BREAK).build();
    public static final Skylander SERIES2_TERRAFIN = new Builder("Series 2 Terrafin", Game.GIANTS, Element.EARTH)
            .baseVariant(TERRAFIN).build();

    // - Fire -
    public static final Skylander HOT_HEAD = new Builder("Hot Head", Game.GIANTS, Element.FIRE)
            .type(SkylanderType.GIANT).catchphrase("Hey! I'm on fire!").soulGemChapter(Chapter.JUNKYARD_ISLES).build();
    public static final Skylander HOT_DOG = new Builder("Hot Dog", Game.GIANTS, Element.FIRE)
            .catchphrase("See Spot Burn!").soulGemChapter(Chapter.RUMBLETOWN).build();
    public static final Skylander MOLTEN_HOT_DOG = new Builder("Molten Hot Dog", Game.GIANTS, Element.FIRE)
            .baseVariant(HOT_DOG).build();

    public static final Skylander SERIES2_ERUPTOR = new Builder("Series 2 Eruptor", Game.GIANTS, Element.FIRE)
            .baseVariant(ERUPTOR).build();
    public static final Skylander LIGHTCORE_ERUPTOR = new Builder("LightCore Eruptor", Game.GIANTS, Element.FIRE)
            .baseVariant(ERUPTOR).build();
    public static final Skylander SERIES2_FLAMESLINGER = new Builder("Series 2 Flameslinger", Game.GIANTS, Element.FIRE)
            .baseVariant(FLAMESLINGER).build();
    public static final Skylander SERIES2_IGNITOR = new Builder("Series 2 Ignitor", Game.GIANTS, Element.FIRE)
            .baseVariant(IGNITOR).build();
    public static final Skylander LEGENDARY_IGNITOR = new Builder("Legendary Ignitor", Game.GIANTS, Element.FIRE)
            .baseVariant(IGNITOR).build();

    // - Water -
    public static final Skylander THUMPBACK = new Builder("Thumpback", Game.GIANTS, Element.WATER)
            .type(SkylanderType.GIANT).catchphrase("Hail to the whale!").soulGemChapter(Chapter.GLACIER_GULLY).build();
    public static final Skylander SIDEKICK_THUMPLING = new Builder("Sidekick Thumpling", Game.GIANTS, Element.WATER)
            .type(SkylanderType.SIDEKICK).baseVariant(THUMPBACK).build();
    public static final Skylander CHILL = new Builder("Chill", Game.GIANTS, Element.WATER)
            .gender(Gender.FEMALE).catchphrase("Stay Cool!").soulGemChapter(Chapter.LOST_CITY_OF_ARKUS).build();
    public static final Skylander LIGHTCORE_CHILL = new Builder("LightCore Chill", Game.GIANTS, Element.WATER)
            .baseVariant(CHILL).build();
    public static final Skylander LEGENDARY_LIGHTCORE_CHILL = new Builder("Legendary LightCore Chill", Game.GIANTS, Element.WATER)
            .baseVariant(CHILL).build();

    public static final Skylander SERIES2_GILL_GRUNT = new Builder("Series 2 Gill Grunt", Game.GIANTS, Element.WATER)
            .baseVariant(GILL_GRUNT).build();
    public static final Skylander SERIES2_SLAM_BAM = new Builder("Series 2 Slam Bam", Game.GIANTS, Element.WATER)
            .baseVariant(SLAM_BAM).build();
    public static final Skylander LEGENDARY_SLAM_BAM = new Builder("Legendary Slam Bam", Game.GIANTS, Element.WATER)
            .baseVariant(SLAM_BAM).build();
    public static final Skylander SERIES2_ZAP = new Builder("Series 2 Zap", Game.GIANTS, Element.WATER)
            .baseVariant(ZAP).build();

    // - Magic -
    public static final Skylander NINJINI = new Builder("Ninjini", Game.GIANTS, Element.MAGIC)
            .gender(Gender.FEMALE).type(SkylanderType.GIANT).catchphrase("Any last wishes?")
            .soulGemChapter(Chapter.KAOS_CASTLE).build();
    public static final Skylander SCARLET_NINJINI = new Builder("Scarlet Ninjini", Game.GIANTS, Element.MAGIC)
            .baseVariant(NINJINI).build();
    public static final Skylander SIDEKICK_MINI_JINI = new Builder("Sidekick Mini Jini", Game.GIANTS, Element.MAGIC)
            .type(SkylanderType.SIDEKICK).baseVariant(NINJINI).build();
    public static final Skylander POP_FIZZ = new Builder("Pop Fizz", Game.GIANTS, Element.MAGIC)
            .catchphrase("The Motion of the Potion!").soulGemChapter(Chapter.WILLIKIN_VILLAGE).build();
    public static final Skylander PUNCH_POP_FIZZ = new Builder("Punch Pop Fizz", Game.GIANTS, Element.MAGIC)
            .baseVariant(POP_FIZZ).build();
    public static final Skylander LIGHTCORE_POP_FIZZ = new Builder("Lightcore Pop Fizz", Game.GIANTS, Element.MAGIC)
            .baseVariant(POP_FIZZ).build();

    public static final Skylander SERIES2_DOUBLE_TROUBLE = new Builder("Series 2 Double Trouble", Game.GIANTS, Element.MAGIC)
            .baseVariant(DOUBLE_TROUBLE).build();
    public static final Skylander ROYAL_DOUBLE_TROUBLE = new Builder("Royal Double Trouble", Game.GIANTS, Element.MAGIC)
            .baseVariant(DOUBLE_TROUBLE).build();
    public static final Skylander SERIES2_SPYRO = new Builder("Series 2 Spyro", Game.GIANTS, Element.MAGIC)
            .baseVariant(SPYRO).build();
    public static final Skylander SERIES2_WRECKING_BALL = new Builder("Series 2 Wrecking Ball", Game.GIANTS, Element.MAGIC)
            .baseVariant(WRECKING_BALL).build();

    // - Tech -
    public static final Skylander BOUNCER = new Builder("Bouncer", Game.GIANTS, Element.TECH)
            .type(SkylanderType.GIANT).catchphrase("Deal with the wheel!").soulGemChapter(Chapter.SECRET_VAULT_OF_SECRETS).build();
    public static final Skylander LEGENDARY_BOUNCER = new Builder("Legendary Bouncer", Game.GIANTS, Element.TECH)
            .baseVariant(BOUNCER).build();
    public static final Skylander SPROCKET = new Builder("Sprocket", Game.GIANTS, Element.TECH)
            .gender(Gender.FEMALE).catchphrase("The Fix Is In!").soulGemChapter(Chapter.DRILL_XS_BIG_RIG).build();

    public static final Skylander SERIES2_DRILL_SERGEANT = new Builder("Series 2 Drill Sergeant", Game.GIANTS, Element.TECH)
            .baseVariant(DRILL_SERGEANT).build();
    public static final Skylander SERIES2_DROBOT = new Builder("Series 2 Drobot", Game.GIANTS, Element.TECH)
            .baseVariant(DROBOT).build();
    public static final Skylander LIGHTCORE_DROBOT = new Builder("LightCore Drobot", Game.GIANTS, Element.TECH)
            .baseVariant(DROBOT).build();
    public static final Skylander SERIES2_TRIGGER_HAPPY = new Builder("Series 2 Trigger Happy", Game.GIANTS, Element.TECH)
            .baseVariant(TRIGGER_HAPPY).build();

    /* --- Swap Force --- */
    // - Air -
    public static final Skylander BOOM_JET = new Builder("Boom Jet", Game.SWAP_FORCE, Element.AIR)
            .type(SkylanderType.SWAP_FORCE).catchphrase("Bombs Away!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.ROCKET).build();
    public static final Skylander FREE_RANGER = new Builder("Free Ranger", Game.SWAP_FORCE, Element.AIR)
            .type(SkylanderType.SWAP_FORCE).catchphrase("Whip Up A Storm!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.SPIN).build();
    public static final Skylander LEGENDARY_FREE_RANGER = new Builder("Legendary Free Ranger", Game.SWAP_FORCE, Element.AIR)
            .baseVariant(FREE_RANGER).build();
    // - Life -
    public static final Skylander GRILLA_DRILLA = new Builder("Grilla Drilla", Game.SWAP_FORCE, Element.LIFE)
            .type(SkylanderType.SWAP_FORCE).catchphrase("If There's a Drill, There's a Way!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.DIG).build();
    public static final Skylander STINK_BOMB = new Builder("Stink Bomb", Game.SWAP_FORCE, Element.LIFE)
            .type(SkylanderType.SWAP_FORCE).catchphrase("Clear the Air!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.SNEAK).build();
    // - Undead -
    public static final Skylander NIGHT_SHIFT = new Builder("Night Shift", Game.SWAP_FORCE, Element.UNDEAD)
            .type(SkylanderType.SWAP_FORCE).catchphrase("Roll with the Punches!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.TELEPORT).build();
    public static final Skylander LEGENDARY_NIGHT_SHIFT = new Builder("Legendary Night Shift", Game.SWAP_FORCE, Element.UNDEAD)
            .baseVariant(NIGHT_SHIFT).build();
    public static final Skylander RATTLE_SHAKE = new Builder("Rattle Shake", Game.SWAP_FORCE, Element.UNDEAD)
            .type(SkylanderType.SWAP_FORCE).catchphrase("Go Ahead - Snake My Day!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.BOUNCE).build();
    public static final Skylander QUICKDRAW_RATTLE_SHAKE = new Builder("Quickdraw Rattle Shake", Game.SWAP_FORCE, Element.UNDEAD)
            .baseVariant(RATTLE_SHAKE).build();

    public static final Skylander GRIM_CREEPER = new Builder("Grim Creeper", Game.SWAP_FORCE, Element.UNDEAD)
            .catchphrase("Your Time Is Up!").soulGemChapter(Chapter.SSF).build();
    public static final Skylander LIGHTCORE_GRIM_CREEPER = new Builder("LightCore Grim Creeper", Game.SWAP_FORCE, Element.UNDEAD)
            .baseVariant(GRIM_CREEPER).build();
    public static final Skylander LEGENDARY_LIGHTCORE_GRIM_CREEPER = new Builder("Legendary LightCore Grim Creeper", Game.SWAP_FORCE, Element.UNDEAD)
            .baseVariant(GRIM_CREEPER).build();
    public static final Skylander ROLLER_BRAWL = new Builder("Roller Brawl", Game.SWAP_FORCE, Element.UNDEAD)
            .catchphrase("Let's Roll!").soulGemChapter(Chapter.SSF).build();

    public static final Skylander PHANTOM_CYNDER = new Builder("Phantom Cynder", Game.SWAP_FORCE, Element.UNDEAD)
            .baseVariant(CYNDER).build();
    public static final Skylander TWIN_BLADE_CHOP_CHOP = new Builder("Twin Blade Chop Chop", Game.SWAP_FORCE, Element.UNDEAD)
            .baseVariant(CHOP_CHOP).build();
    // - Earth -
    public static final Skylander DOOM_STONE = new Builder("Doom Stone", Game.SWAP_FORCE, Element.EARTH)
            .type(SkylanderType.SWAP_FORCE).catchphrase( "Another Smash Hit!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.SPIN).build();
    public static final Skylander RUBBLE_ROUSER = new Builder("Rubble Rouser", Game.SWAP_FORCE, Element.EARTH)
            .type(SkylanderType.SWAP_FORCE).catchphrase("Brace For Impact!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.DIG).build();
    // - Fire -
    public static final Skylander BLAST_ZONE = new Builder("Blast Zone", Game.SWAP_FORCE, Element.FIRE)
            .type(SkylanderType.SWAP_FORCE).catchphrase("Blast and Furious!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.ROCKET).build();
    public static final Skylander DARK_BLAST_ZONE = new Builder("Dark Blast Zone", Game.SWAP_FORCE, Element.FIRE)
            .baseVariant(BLAST_ZONE).build();
    public static final Skylander FIRE_KRAKEN = new Builder("Fire Kraken", Game.SWAP_FORCE, Element.FIRE)
            .type(SkylanderType.SWAP_FORCE).catchphrase("Burn to be Wild!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.BOUNCE).build();
    public static final Skylander JADE_FIRE_KRAKEN = new Builder("Jade Fire Kraken", Game.SWAP_FORCE, Element.FIRE)
            .baseVariant(FIRE_KRAKEN).build();
    // - Water -
    public static final Skylander FREEZE_BLADE = new Builder("Freeze Blade", Game.SWAP_FORCE, Element.WATER)
            .type(SkylanderType.SWAP_FORCE).catchphrase("Keeping It Cool!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.SPEED).build();
    public static final Skylander NITRO_FREEZE_BLADE = new Builder("Nitro Freeze Blade", Game.SWAP_FORCE, Element.WATER)
            .baseVariant(FREEZE_BLADE).build();
    public static final Skylander WASH_BUCKLER = new Builder("Wash Buckler", Game.SWAP_FORCE, Element.WATER)
            .type(SkylanderType.SWAP_FORCE).catchphrase("Eight Legs and No Pegs!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.CLIMB).build();
    public static final Skylander DARK_WASH_BUCKLER = new Builder("Dark Wash Buckler", Game.SWAP_FORCE, Element.WATER)
            .baseVariant(WASH_BUCKLER).build();
    // - Magic -
    public static final Skylander HOOT_LOOP = new Builder("Hoot Loop", Game.SWAP_FORCE, Element.MAGIC)
            .type(SkylanderType.SWAP_FORCE).catchphrase("Let's Ruffle Some Feathers!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.TELEPORT).build();
    public static final Skylander ENCHANTED_HOOT_LOOP = new Builder("Enchanted Hoot Loop", Game.SWAP_FORCE, Element.MAGIC)
            .baseVariant(HOOT_LOOP).build();
    public static final Skylander TRAP_SHADOW = new Builder("Trap Shadow", Game.SWAP_FORCE, Element.MAGIC)
            .type(SkylanderType.SWAP_FORCE).catchphrase("Hide and Sleek!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.SNEAK).build();
    // - Tech -
    public static final Skylander MAGNA_CHARGE = new Builder("Margna Charge", Game.SWAP_FORCE, Element.TECH)
            .type(SkylanderType.SWAP_FORCE).catchphrase("Attract to Attack!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.SPEED).build();
    public static final Skylander NITRO_MAGNA_CHARGE = new Builder("Nitro Magna Charge", Game.SWAP_FORCE, Element.TECH)
            .baseVariant(MAGNA_CHARGE).build();
    public static final Skylander SPY_RISE = new Builder("Spy Rise", Game.SWAP_FORCE, Element.TECH)
            .type(SkylanderType.SWAP_FORCE).catchphrase("It's Classified!").soulGemChapter(Chapter.SSF)
            .swapAbility(SwapAbility.CLIMB).build();

    /* --- Trap Team --- */
    // - Light -
    public static final Skylander KNIGHT_LIGHT = new Builder("Knight Light", Game.TRAP_TEAM, Element.LIGHT)
            .type(SkylanderType.TRAP_MASTER).catchphrase("See the Light!").soulGemChapter(Chapter.STT).build();

    public static final Skylander SPOTLIGHT = new Builder("Spotlight", Game.TRAP_TEAM, Element.LIGHT)
            .gender(Gender.FEMALE).catchphrase("Time to Shine!").soulGemChapter(Chapter.STT).build();
    // - Air -
    public static final Skylander GUSTO = new Builder("Gusto", Game.TRAP_TEAM, Element.AIR)
            .type(SkylanderType.TRAP_MASTER).catchphrase("Gusts and Glory!").soulGemChapter(Chapter.STT).build();
    public static final Skylander THUNDERBOLT = new Builder("Thunderbolt", Game.TRAP_TEAM, Element.AIR)
            .type(SkylanderType.TRAP_MASTER).catchphrase("A Storm Is Coming!").soulGemChapter(Chapter.STT).build();
    // - Life -
    public static final Skylander BUSHWHACK = new Builder("Bushwhack", Game.TRAP_TEAM, Element.LIFE)
            .type(SkylanderType.TRAP_MASTER).catchphrase("Axe to the Max!").soulGemChapter(Chapter.STT).build();
    public static final Skylander LEGENDARY_BUSHWHACK = new Builder("Legendary Bushwhack", Game.TRAP_TEAM, Element.LIFE)
            .baseVariant(BUSHWHACK).build();
    public static final Skylander TUFF_LUCK = new Builder("Tuff Luck", Game.TRAP_TEAM, Element.LIFE)
            .type(SkylanderType.TRAP_MASTER).catchphrase("Deal With It!").soulGemChapter(Chapter.STT).build();
    // - Undead -
    public static final Skylander KRYPT_KING = new Builder("Krypt King", Game.TRAP_TEAM, Element.UNDEAD)
            .type(SkylanderType.TRAP_MASTER).catchphrase("I've Got the Edge!").soulGemChapter(Chapter.STT).build();
    public static final Skylander NITRO_KRYPT_KING = new Builder("Nitro Krypt King", Game.TRAP_TEAM, Element.UNDEAD)
            .baseVariant(KRYPT_KING).build();
    public static final Skylander SHORT_CUT = new Builder("Short Cut", Game.TRAP_TEAM, Element.UNDEAD)
            .type(SkylanderType.TRAP_MASTER).catchphrase("Cut To The Chase!").soulGemChapter(Chapter.STT).build();
    // - Earth -
    public static final Skylander HEAD_RUSH = new Builder("Head Rush", Game.TRAP_TEAM, Element.EARTH)
            .type(SkylanderType.TRAP_MASTER).catchphrase("Taking Charge!").soulGemChapter(Chapter.STT).build();
    public static final Skylander NITRO_HEAD_RUSH = new Builder("Nitro Head Rush", Game.TRAP_TEAM, Element.EARTH)
            .baseVariant(HEAD_RUSH).build();
    public static final Skylander WALLOP = new Builder("Wallop", Game.TRAP_TEAM, Element.EARTH)
            .type(SkylanderType.TRAP_MASTER).catchphrase("Hammer It Home!").soulGemChapter(Chapter.STT).build();
    // - Fire -
    public static final Skylander KA_BOOM = new Builder("Ka-Boom", Game.TRAP_TEAM, Element.FIRE)
            .type(SkylanderType.TRAP_MASTER).catchphrase("Boom Time!").soulGemChapter(Chapter.STT).build();
    public static final Skylander WILDFIRE = new Builder("Wildfire", Game.TRAP_TEAM, Element.FIRE)
            .type(SkylanderType.TRAP_MASTER).catchphrase("Bringing The Heat!").soulGemChapter(Chapter.STT).build();
    public static final Skylander DARK_WILDFIRE = new Builder("Dark Wildfire", Game.TRAP_TEAM, Element.FIRE)
            .baseVariant(WILDFIRE).build();
    // - Water -
    public static final Skylander LOB_STAR = new Builder("Lob-Star", Game.TRAP_TEAM, Element.WATER)
            .type(SkylanderType.TRAP_MASTER).catchphrase("Star Bright, Star Fight!").soulGemChapter(Chapter.STT).build();
    public static final Skylander WINTERFEST_LOB_STAR = new Builder("Winterfest Lob-Star", Game.TRAP_TEAM, Element.WATER)
            .baseVariant(LOB_STAR).build();
    public static final Skylander SNAP_SHOT = new Builder("Snap Shot", Game.TRAP_TEAM, Element.WATER)
            .type(SkylanderType.TRAP_MASTER).catchphrase("Croc and Roll!").soulGemChapter(Chapter.STT).build();
    public static final Skylander DARK_SNAP_SHOT = new Builder("Dark Snap Shot", Game.TRAP_TEAM, Element.WATER)
            .baseVariant(SNAP_SHOT).build();
    // - Magic -
    public static final Skylander BLASTERMIND = new Builder("Blastermind", Game.TRAP_TEAM, Element.MAGIC)
            .type(SkylanderType.TRAP_MASTER).catchphrase("Mind Over Matter!").soulGemChapter(Chapter.STT).build();
    public static final Skylander ENIGMA = new Builder("Enigma", Game.TRAP_TEAM, Element.MAGIC)
           .type(SkylanderType.TRAP_MASTER).catchphrase("Out of Sight!").soulGemChapter(Chapter.STT).build();
    // - Tech -
    public static final Skylander GEARSHIFT = new Builder("Gearshift", Game.TRAP_TEAM, Element.TECH)
            .gender(Gender.FEMALE).type(SkylanderType.TRAP_MASTER).catchphrase("All Geared Up!").soulGemChapter(Chapter.STT).build();
    public static final Skylander JAWBREAKER = new Builder("Jawbreaker", Game.TRAP_TEAM, Element.TECH)
            .type(SkylanderType.TRAP_MASTER).catchphrase("Down for the Count!").soulGemChapter(Chapter.STT).build();
    public static final Skylander LEGENDARY_JAWBREAKER = new Builder("Legendary Jawbreaker", Game.TRAP_TEAM, Element.TECH)
            .baseVariant(JAWBREAKER).build();
    // - Dark -
    public static final Skylander KNIGHT_MARE = new Builder("Knight Mare", Game.TRAP_TEAM, Element.DARK)
            .gender(Gender.FEMALE).type(SkylanderType.TRAP_MASTER).catchphrase("Nowhere to Hide!")
            .soulGemChapter(Chapter.STT).build();

    public static final Skylander BLACKOUT = new Builder("Blackout", Game.TRAP_TEAM, Element.DARK)
            .catchphrase("Darkness Falls!").soulGemChapter(Chapter.STT).build();

    /* --- SuperChargers --- */
    // - Light -
    public static final Skylander ASTROBLAST = new Builder("Astroblast", Game.SUPERCHARGERS, Element.LIGHT)
            .catchphrase("Ready, Set, Glow!").build();
    public static final Skylander LEGENDARY_ASTROBLAST = new Builder("Legendary Astroblast", Game.SUPERCHARGERS, Element.LIGHT)
            .baseVariant(ASTROBLAST).build();
    // - Air -
    public static final Skylander HURRICANE_JET_VAC = new Builder("Hurrican Jet-Vac", Game.SUPERCHARGERS, Element.AIR)
            .baseVariant(JET_VAC).build();
    public static final Skylander LEGENDARY_HURRICATE_JET_VAC = new Builder("Legendary Hurrican Jet Vac", Game.SUPERCHARGERS, Element.AIR)
            .baseVariant(JET_VAC).build();

    public static final Skylander STORMBLADE = new Builder("Stormblade", Game.SUPERCHARGERS, Element.AIR)
            .catchphrase("Feather the Storm!").build();
    // - Life -
    public static final Skylander SUPER_SHOT_STEALTH_ELF = new Builder("Super Shot Stealth Elf", Game.SUPERCHARGERS, Element.LIFE)
            .baseVariant(STEALTH_ELF).build();
    public static final Skylander DARK_SUPER_SHOT_STEALTH_ELF = new Builder("Dark Super Shot Stealth Elf", Game.SUPERCHARGERS, Element.LIFE)
            .baseVariant(STEALTH_ELF).build();

    public static final Skylander THRILLIPEDE = new Builder("Thrillipede", Game.SUPERCHARGERS, Element.LIFE)
            .catchphrase("All Hands on Deck!").build();
    public static final Skylander EGGCITED_THRILLIPEDE = new Builder("Eggcited Thrillipede", Game.SUPERCHARGERS, Element.LIFE)
            .baseVariant(THRILLIPEDE).build();

    public static final Skylander TURBO_CHARGE_DONKEY_KONG = new Builder("Turbo Charge Donkey Kong", Game.SUPERCHARGERS, Element.LIFE)
            .build();
    public static final Skylander DARK_TURBO_CHARGE_DONKEY_KONG = new Builder("Dark Turbo Charge Donkey Kong", Game.SUPERCHARGERS, Element.LIFE)
            .baseVariant(TURBO_CHARGE_DONKEY_KONG).build();
    // - Undead -
    public static final Skylander BONE_BASH_ROLLER_BRAWL = new Builder("Bone Bash Roller Brawl", Game.SUPERCHARGERS, Element.UNDEAD)
            .baseVariant(ROLLER_BRAWL).build();
    public static final Skylander LEGENDARY_BONE_BASH_ROLLER_BRAWL = new Builder("Legendary Bone Bash Roller Brawl", Game.SUPERCHARGERS, Element.UNDEAD)
            .baseVariant(ROLLER_BRAWL).build();

    public static final Skylander FIESTA = new Builder("Fiesta", Game.SUPERCHARGERS, Element.UNDEAD)
            .catchphrase("It's Party Time!").build();
    public static final Skylander FRIGHTFUL_FIESTA = new Builder("Frightful Fiesta", Game.SUPERCHARGERS, Element.UNDEAD)
            .baseVariant(FIESTA).build();
    // - Earth -
    public static final Skylander SHARK_SHOOTER_TERRAFIN = new Builder("Shark Shooter Terrafin", Game.SUPERCHARGERS, Element.EARTH)
            .baseVariant(TERRAFIN).build();

    public static final Skylander SMASH_HIT = new Builder("Smash Hit", Game.SUPERCHARGERS, Element.EARTH)
            .catchphrase("Let's Rock!").build();
    public static final Skylander STEEL_PLATED_SMASH_HIT = new Builder("Steel Plated Smash Hit", Game.SUPERCHARGERS, Element.EARTH)
            .baseVariant(SMASH_HIT).build();
    // - Fire -
    public static final Skylander LAVA_LANCE_ERUPTOR = new Builder("Lava Lance Eruptor", Game.SUPERCHARGERS, Element.FIRE)
            .baseVariant(ERUPTOR).build();

    public static final Skylander SPITFIRE = new Builder("Spitfire", Game.SUPERCHARGERS, Element.FIRE)
            .catchphrase("Fuel the Fire!").build();
    public static final Skylander DARK_SPITFIRE = new Builder("Dark Spitfire", Game.SUPERCHARGERS, Element.FIRE)
            .baseVariant(SPITFIRE).build();

    public static final Skylander HAMMER_SLAM_BOWSER = new Builder("Hammer Slam Bowser", Game.SUPERCHARGERS, Element.FIRE)
            .build();
    public static final Skylander DARK_HAMMER_SLAM_BOWSER = new Builder("Dark Hammer Slam Bowser", Game.SUPERCHARGERS, Element.FIRE)
            .baseVariant(HAMMER_SLAM_BOWSER).build();
    // - Water -
    public static final Skylander DEEP_DIVE_GILL_GRUNT = new Builder("Deep Dive Gill Grunt", Game.SUPERCHARGERS, Element.WATER)
            .baseVariant(GILL_GRUNT).build();

    public static final Skylander DIVE_CLOPS = new Builder("Dive-Clops", Game.SUPERCHARGERS, Element.WATER)
            .catchphrase("Look Out Below!").build();
    public static final Skylander MISSILE_TOW_DIVE_CLOPS = new Builder("Missile-Tow Dive-Clops", Game.SUPERCHARGERS, Element.WATER)
            .baseVariant(DIVE_CLOPS).build();
    // - Magic -
    public static final Skylander BIG_BUBBLE_POP_FIZZ = new Builder("Big Bubble Pop Fizz", Game.SUPERCHARGERS, Element.MAGIC)
            .baseVariant(POP_FIZZ).build();
    public static final Skylander BIRTHDAY_BASH_BIG_BUBBLE_POP_FIZZ = new Builder("Birthday Bash Big Bubble Pop Fizz", Game.SUPERCHARGERS, Element.MAGIC)
            .baseVariant(POP_FIZZ).build();

    public static final Skylander SPLAT = new Builder("Splat", Game.SUPERCHARGERS, Element.MAGIC)
            .catchphrase("The Art of War!").build();
    public static final Skylander POWER_BLUE_PLAT = new Builder("Power Blue Splat", Game.SUPERCHARGERS, Element.MAGIC)
            .baseVariant(SPLAT).build();
    // - Tech -
    public static final Skylander DOUBLE_DARE_TRIGGER_HAPPY = new Builder("Double Dare Trigger Happy", Game.SUPERCHARGERS, Element.TECH)
            .baseVariant(TRIGGER_HAPPY).build();
    public static final Skylander POWER_BLUE_DOUBLE_DARE_TRIGGER_HAPPY = new Builder("Power Blue Double Dare Trigger Happy", Game.SUPERCHARGERS, Element.TECH)
            .baseVariant(TRIGGER_HAPPY).build();

    public static final Skylander HIGH_VOLT = new Builder("High Volt", Game.SUPERCHARGERS, Element.TECH)
            .catchphrase("Protect and Surge!").build();
    // - Dark -
    public static final Skylander NIGHTFALL = new Builder("Nightfall", Game.SUPERCHARGERS, Element.DARK)
            .catchphrase("Dark and Dangerous!").build();

    /* --- Imaginators --- */
    // - Light -
    public static final Skylander AURORA = new Builder("Aurora", Game.IMAGINATORS, Element.LIGHT)
            .gender(Gender.FEMALE).catchphrase("The Speed of Light!").soulGemChapter(Chapter.SENSEI_LIGHT_REALM)
            .battleClass(BattleClass.SWASHBUCKLER).build();
    public static final Skylander SOLAR_FLARE_AURORA = new Builder("Solar Flare Aurora", Game.IMAGINATORS, Element.LIGHT)
            .baseVariant(AURORA).build();

    public static final Skylander BLASTER_TRON = new Builder("Blaster-Tron", Game.IMAGINATORS, Element.LIGHT)
            .catchphrase("Target Acquired!").soulGemChapter(Chapter.SKY_FORTRESS)
            .battleClass(BattleClass.KNIGHT).build();
    // - Air -
    public static final Skylander AIR_STRIKE = new Builder("Air Strike", Game.IMAGINATORS, Element.AIR)
            .catchphrase("Fight and Flight!").soulGemChapter(Chapter.GRYPHON_PARK_OBSERVATORY)
            .battleClass(BattleClass.BRAWLER).build();
    public static final Skylander EGG_BOMBER_AIR_STRIKE = new Builder("Egg Bomber Air Strike", Game.IMAGINATORS, Element.AIR)
            .baseVariant(AIR_STRIKE).build();
    public static final Skylander WILD_STORM = new Builder("Wild Storm", Game.IMAGINATORS, Element.AIR)
            .catchphrase("The Roar of Thunder!").soulGemChapter(Chapter.SENSEI_AIR_REALM)
            .battleClass(BattleClass.KNIGHT).build();

    public static final Skylander BAD_JUJU = new Builder("Bad Juju", Game.IMAGINATORS, Element.AIR)
            .gender(Gender.FEMALE).catchphrase("The Spirit is Willing!").soulGemChapter(Chapter.FIZZLAND)
            .battleClass(BattleClass.SWASHBUCKLER).build();
    public static final Skylander MYSTICAL_BAD_JUJU = new Builder("Mystical Bad Juju", Game.IMAGINATORS, Element.AIR)
            .baseVariant(BAD_JUJU).build();
    // - Life -
    public static final Skylander AMBUSH = new Builder("Ambush", Game.IMAGINATORS, Element.LIFE)
            .catchphrase("Weed 'Em and Reap!").soulGemChapter(Chapter.CRADLE_OF_CREATION)
            .battleClass(BattleClass.KNIGHT).build();
    public static final Skylander BOOM_BLOOM = new Builder("Boom Bloom", Game.IMAGINATORS, Element.LIFE)
            .catchphrase("Rooting Out Evil!").soulGemChapter(Chapter.ENCHANTED_ELVEN_FOREST)
            .battleClass(BattleClass.NINJA).build();

    public static final Skylander CHOMPY_MAGE = new Builder("Chompy Mage", Game.IMAGINATORS, Element.LIFE)
            .catchphrase("Chompy Power!").soulGemChapter(Chapter.SENSEI_LIFE_REALM)
            .battleClass(BattleClass.BAZOOKER).build();
    public static final Skylander JINGLE_BELL_CHOMPY_MAGE = new Builder("Jingle Bell Chompy Mage", Game.IMAGINATORS, Element.LIFE)
            .baseVariant(CHOMPY_MAGE).build();
    public static final Skylander CRASH_BANDICOOT = new Builder("Crash Bandicoot", Game.IMAGINATORS, Element.LIFE)
            .soulGemChapter(Chapter.THUMPIN_WUMPA_ISLANDS).battleClass(BattleClass.BRAWLER).build();
    // - Undead -
    public static final Skylander CHOPSCOTCH = new Builder("Chopscotch", Game.IMAGINATORS, Element.UNDEAD)
            .catchphrase("Chop 'til You Drop!").soulGemChapter(Chapter.MUSHROOM_RIVER)
            .battleClass(BattleClass.SMASHER).build();
    public static final Skylander CANDY_COATED_CHOPSCOTCH = new Builder("Candy Coated Chopscotch", Game.IMAGINATORS, Element.UNDEAD)
            .baseVariant(CHOPSCOTCH).build();
    public static final Skylander PIT_BOSS = new Builder("Pit Boss", Game.IMAGINATORS, Element.UNDEAD)
            .catchphrase("The Scales of Justice!").soulGemChapter(Chapter.MUSHROOM_RIVER)
            .battleClass(BattleClass.SORCERER).build();
    public static final Skylander LEGENDARY_PIT_BOSS = new Builder("Legendary Pit Boss", Game.IMAGINATORS, Element.UNDEAD)
            .baseVariant(PIT_BOSS).build();

    public static final Skylander WOLFGANG = new Builder("Wolfgang", Game.IMAGINATORS, Element.UNDEAD)
            .catchphrase("Let There Be Rock!").soulGemChapter(Chapter.SENSEI_UNDEAD_REALM)
            .battleClass(BattleClass.BOWSLINGER).build();
    public static final Skylander DARK_WOLFGANG = new Builder("Dark Wolfgang", Game.IMAGINATORS, Element.UNDEAD)
            .baseVariant(WOLFGANG).build();
    // - Earth -
    public static final Skylander BARBELLA = new Builder("Barbella", Game.IMAGINATORS, Element.EARTH)
            .catchphrase("It's Crunch Time!").soulGemChapter(Chapter.CRADLE_OF_CREATION)
            .battleClass(BattleClass.SENTINEL).build();
    public static final Skylander TRI_TIP = new Builder("Tri-Tip", Game.IMAGINATORS, Element.EARTH)
            .catchphrase("Face the Mace!").soulGemChapter(Chapter.SCHOLARVILLE)
            .battleClass(BattleClass.SMASHER).build();
    public static final Skylander LEGENDARY_TRI_TIP = new Builder("Legendary Tri-Tip", Game.IMAGINATORS, Element.EARTH)
            .baseVariant(TRI_TIP).build();

    public static final Skylander GOLDEN_QUEEN = new Builder("Golden Queen", Game.IMAGINATORS, Element.EARTH)
            .gender(Gender.FEMALE).catchphrase("I Reign Supreme!").soulGemChapter(Chapter.SENSEI_EARTH_REALM)
            .battleClass(BattleClass.SORCERER).build();
    public static final Skylander DARK_GOLDEN_QUEEN = new Builder("Dark Golden Queen", Game.IMAGINATORS, Element.EARTH)
            .baseVariant(GOLDEN_QUEEN).build();
    // - Fire -
    public static final Skylander EMBER = new Builder("Ember", Game.IMAGINATORS, Element.FIRE)
            .gender(Gender.FEMALE).catchphrase("Fan the Flames!").soulGemChapter(Chapter.SCHOLARVILLE)
            .battleClass(BattleClass.SENTINEL).build();
    public static final Skylander FLARE_WOLF = new Builder("Flare Wolf", Game.IMAGINATORS, Element.FIRE)
            .catchphrase("Ready to Rocket!").soulGemChapter(Chapter.FIZZLAND)
            .battleClass(BattleClass.BAZOOKER).build();
    public static final Skylander HARD_BOILED_FLARE_WOLF = new Builder("Hard Boiled Flare Wolf", Game.IMAGINATORS, Element.FIRE)
            .baseVariant(FLARE_WOLF).build();

    public static final Skylander TAE_KWON_CROW = new Builder("Tae Kwon Crow", Game.IMAGINATORS, Element.FIRE)
            .catchphrase("Who Dares Face Me?").soulGemChapter(Chapter.SENSEI_FIRE_REALM)
            .battleClass(BattleClass.NINJA).build();
    public static final Skylander MYSTICAL_TAE_KWON_CROW = new Builder("Mystical Tae Kwon Crow", Game.IMAGINATORS, Element.FIRE)
            .baseVariant(TAE_KWON_CROW).build();
    // - Water -
    public static final Skylander KING_PEN = new Builder("King Pen", Game.IMAGINATORS, Element.WATER)
            .catchphrase("Stay Frosty!").soulGemChapter(Chapter.SENSEI_WATER_REALM)
            .battleClass(BattleClass.BRAWLER).build();
    public static final Skylander DARK_KING_PEN = new Builder("Dark King Pen", Game.IMAGINATORS, Element.WATER)
            .baseVariant(KING_PEN).build();
    public static final Skylander TIDEPOOL = new Builder("Tidepool", Game.IMAGINATORS, Element.WATER)
            .catchphrase("In a League of My Own!").soulGemChapter(Chapter.ABANDONED_AMUSEMENT_PARK)
            .battleClass(BattleClass.QUICKSHOT).build(); //.battleClass(BattleClass.BRAWLER)

    public static final Skylander GRAVE_CLOBBER = new Builder("Grave Clobber", Game.IMAGINATORS, Element.WATER)
            .catchphrase("A Watery Grave Awaits!").soulGemChapter(Chapter.DRAGON_TEMPLE)
            .build();
    // - Magic -
    public static final Skylander BUCKSHOT = new Builder("Buckshot", Game.IMAGINATORS, Element.MAGIC)
            .catchphrase("Quiver with Fear!").soulGemChapter(Chapter.SENSEI_MAGIC_REALM)
            .battleClass(BattleClass.BOWSLINGER).build();
    public static final Skylander MYSTICAT = new Builder("Mysticat", Game.IMAGINATORS, Element.MAGIC)
            .catchphrase("The Master of Mystery!").soulGemChapter(Chapter.SHELLMONT_SHORES)
            .battleClass(BattleClass.SORCERER).build();

    public static final Skylander PAIN_YATTA = new Builder("Pain-Yatta", Game.IMAGINATORS, Element.MAGIC)
            .catchphrase("So Long, Sucker!").soulGemChapter(Chapter.THE_GOLDEN_ARCADE)
            .battleClass(BattleClass.SMASHER).build();
    // - Tech -
    public static final Skylander CHAIN_REACTION = new Builder("Chain Reaction", Game.IMAGINATORS, Element.TECH)
            .catchphrase("The Saw is Law!").soulGemChapter(Chapter.THE_GOLDEN_ARCADE)
            .battleClass(BattleClass.SWASHBUCKLER).build();
    public static final Skylander RO_BOW = new Builder("Ro-Bow", Game.IMAGINATORS, Element.TECH)
            .catchphrase("Compute and Shoot!").soulGemChapter(Chapter.SENSEI_TECH_REALM)
            .battleClass(BattleClass.BOWSLINGER).build();

    public static final Skylander DR_KRANKCASE = new Builder("Dr. Krankcase", Game.IMAGINATORS, Element.TECH)
            .catchphrase("The Doctor is In!").soulGemChapter(Chapter.SHELLMONT_SHORES)
            .battleClass(BattleClass.QUICKSHOT).build();
    public static final Skylander DR_NEO_CORTEX = new Builder("Dr. Neo Cortex", Game.IMAGINATORS, Element.TECH)
            .catchphrase("MWAHAHAHAHAHAAA!!!").soulGemChapter(Chapter.THUMPIN_WUMPA_ISLANDS)
            .battleClass(BattleClass.SORCERER).build();
    // - Dark -
    public static final Skylander STARCAST = new Builder("Starcast", Game.IMAGINATORS, Element.DARK)
            .catchphrase("A Shot in the Dark!").soulGemChapter(Chapter.SKY_FORTRESS).build();

    public static final Skylander HOOD_SICKLE = new Builder("Hood Sickle", Game.IMAGINATORS, Element.DARK)
            .catchphrase("Any Last Words?").soulGemChapter(Chapter.SENSEI_DARK_REALM)
            .battleClass(BattleClass.SENTINEL).build();
    public static final Skylander STEEL_PLATED_HOOD_SICKLE = new Builder("Steel Plated Hood Sickle", Game.IMAGINATORS, Element.DARK)
            .baseVariant(HOOD_SICKLE).build();
    // - Kaos -
    public static final Skylander KAOS = new Builder("Kaos", Game.IMAGINATORS, Element.KAOS)
            .catchphrase("Behold, My Catchphrase of Doom!").soulGemChapter(Chapter.THE_LAIR_OF_KAOS)
            .battleClass(BattleClass.KAOS).build();

    /* --- Fields --- */
    // - Required -
    // Basic Info
    private final String name;
    private final Game game;
    private final Element element;

    // Stats
    private final int health;
    private final int maxHealth;
    private final int speed;
    private final int maxSpeed;
    private final int armor;
    private final int maxArmor;
    private final int criticalHit;
    private final int maxCriticalHit;
    private final int elementalPower;
    private final int maxElementalPower;

    // - Optional or Defaulting -
    private final Gender gender;
    private final SkylanderType type;
    private final String catchphrase;
    private final Skylander baseVariant;
    private final Chapter soulGemChapter;
    private final SwapAbility swapAbility;
    private final BattleClass battleClass;
    private final SkylanderAbilityTree abilityTree;

    Skylander(Builder builder) {
        this.name = Objects.requireNonNull(builder.name, "name");
        this.game = Objects.requireNonNull(builder.game, "game");
        this.element = Objects.requireNonNull(builder.element, "element");

        this.health = builder.health;
        this.maxHealth = builder.maxHealth;
        this.speed = builder.speed;
        this.maxSpeed = builder.maxSpeed;
        this.armor = builder.armor;
        this.maxArmor = builder.maxArmor;
        this.criticalHit = builder.criticalHit;
        this.maxCriticalHit = builder.maxCriticalHit;
        this.elementalPower = builder.elementalPower;
        this.maxElementalPower = builder.maxElementalPower;

        this.swapAbility = builder.swapAbility;

        if (builder.game == Game.IMAGINATORS) {
            if (builder.battleClass != null) {
                this.battleClass = builder.battleClass;
            } else if (builder.baseVariant != null) {
                this.battleClass = builder.baseVariant.battleClass;
            } else {
                this.battleClass = null;
            }
        } else {
            this.battleClass = null;
        }

        this.abilityTree = builder.abilityTree;
        this.gender = builder.gender;

        this.type = Objects.requireNonNullElseGet(builder.type, () -> switch (builder.game) {
            case Game.IMAGINATORS -> SkylanderType.SENSEI;
            case Game.SUPERCHARGERS -> SkylanderType.SUPERCHARGER;
            default -> (builder.baseVariant == null) ? SkylanderType.CORE : builder.baseVariant.type;
        });

        this.baseVariant = builder.baseVariant;
        this.catchphrase = (builder.baseVariant == null)
                ? builder.catchphrase
                : builder.baseVariant.getCatchphrase();
        this.soulGemChapter = (builder.baseVariant == null
                || builder.baseVariant.getGame() == this.game)
                ? builder.soulGemChapter
                : builder.baseVariant.soulGemChapter;

        REGISTRY.add(this);
    }

    public static class Builder {
        /* --- Fields --- */
        // - Required -
        // Basic Info
        private final String name;
        private final Game game;
        private final Element element;

        // - Optional or Defaulting -
        // Stats
        private int health;
        private int maxHealth;
        private int speed;
        private int maxSpeed;
        private int armor;
        private int maxArmor;
        private int criticalHit;
        private int maxCriticalHit;
        private int elementalPower;
        private int maxElementalPower;

        // Other
        private Gender gender;
        private SkylanderType type;
        private String catchphrase;
        private Skylander baseVariant;
        private Chapter soulGemChapter;
        private SwapAbility swapAbility;
        private BattleClass battleClass;
        private SkylanderAbilityTree abilityTree;

        public Builder(String name, Game game, Element element) {
            this.name = name;
            this.game = game;
            this.element = element;
            this.gender = Gender.MALE;
        }

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder type(SkylanderType type) {
            this.type = type;
            return this;
        }

        public Builder baseVariant(Skylander baseVariant) {
            this.baseVariant = baseVariant;
            return this;
        }

        public Builder catchphrase(String catchphrase) {
            this.catchphrase = catchphrase;
            return this;
        }

        public Builder soulGemChapter(Chapter soulGemChapter) {
            this.soulGemChapter = soulGemChapter;
            return this;
        }

        public Builder stats(int health, int maxHealth, int speed, int maxSpeed, int armor, int maxArmor,
                             int criticalHit, int maxCriticalHit, int elementalPower, int maxElementalPower) {
            this.health = health;
            this.maxHealth = maxHealth;
            this.speed = speed;
            this.maxSpeed = maxSpeed;
            this.armor = armor;
            this.maxArmor = maxArmor;
            this.criticalHit = criticalHit;
            this.maxCriticalHit = maxCriticalHit;
            this.elementalPower = elementalPower;
            this.maxElementalPower = maxElementalPower;
            return this;
        }

        public Builder swapAbility(SwapAbility swapAbility) {
            this.swapAbility = swapAbility;
            return this;
        }

        public Builder battleClass(BattleClass battleClass) {
            this.battleClass = battleClass;
            return this;
        }

        public Builder abilityTree(SkylanderAbilityTree abilityTree) {
            this.abilityTree = abilityTree;
            return this;
        }

        public Skylander build() {
            return new Skylander(this);
        }
    }

    /* --- Getter Methods --- */
    public static Skylander[] values() {
        return REGISTRY.toArray(new Skylander[0]);
    }

    public String getName() {
        return name;
    }
    public Game getGame() {
        return game;
    }
    public Element getElement() {
        return element;
    }

    public int getHealth() {
        return health;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getSpeed() {
        return speed;
    }
    public int getmaxSpeed() {
        return maxSpeed;
    }
    public int getArmor() {
        return armor;
    }
    public int getMaxArmor() {
        return maxArmor;
    }
    public int getCriticalHit() {
        return criticalHit;
    }
    public int getMaxCriticalHit() {
        return maxCriticalHit;
    }
    public int getElementalPower() {
        return elementalPower;
    }
    public int getMaxElementalPower() {
        return maxElementalPower;
    }

    public Gender getGender() {
        return gender;
    }
    public SkylanderType getType() {
        return type;
    }
    public Skylander getBaseVariant() {
        return baseVariant;
    }
    public String getCatchphrase() {
        return catchphrase;
    }
    public SwapAbility getSwapAbility() {
        return swapAbility;
    }
    public BattleClass getBattleClass() {
        return battleClass;
    }
    public Chapter getSoulGemChapter() {
        return soulGemChapter;
    }
    public SkylanderAbilityTree getAbilityTree() {
        return abilityTree;
    }
}