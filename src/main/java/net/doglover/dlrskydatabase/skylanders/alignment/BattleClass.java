package net.doglover.dlrskydatabase.skylanders.alignment;

import net.doglover.dlrskydatabase.games.chapters.Chapter;
import net.doglover.dlrskydatabase.skylanders.abilities.Ability;
import net.doglover.dlrskydatabase.skylanders.abilities.BattleClassAbilityTree;

public enum BattleClass {
    BAZOOKER("Bazooker", Chapter.SCHOLARVILLE,
            new BattleClassAbilityTree(
                    // Weapon Power Options
                    new Ability[]{
                            new Ability("Blaster", "Press Attack 1 to fire rockets.\nThis attack can be fired rapidly.", 0),
                            new Ability("Destroyer", "Press Attack 1 to fire rockets with a small explosive radius.\nPress A1, A1, A1 to shoot a big rocket that explodes into smaller bombs.", 0)
                    },
                    // Weapon Power Upgrades
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
                    // Weapon Power Options
                    new Ability[]{
                            new Ability("Long Shot", "Press Attack 1 to fling arrows at your enemies.", 0),
                            new Ability("Multi Shot", "Press Attack 1 to fire a spread of three arrows.", 0)
                    },
                    // Weapon Power Upgrades
                    new Ability[]{
                            new Ability("Master Long Shot", "Upgrade Long Shot", "Press Attack 1 to add an additional arcing arrow whenever you shoot!", 700),
                            new Ability("Master Multi Shot", "Upgrade Multi Shot", "Press Attack 1 to fire a spread of four arrows with a wider range!", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("Knockback Shot", "Must be at least level 2", "Press Attack 3 to fire an arrow that packs a punch.", 0),
                            new Ability("Target Tag", "Must be at least level 4", "Press Attack 3 to paint targets for lightning-fast shots.", 0),
                            new Ability("Slow Shot", "Defeat Bowslinger Doomlander", "Press Attack 3 to fire a shot that you can fire at for an explosion.", 0),
                            new Ability("Lob Shot", "Place a Bowslinger Sensei on the portal", "Press Attack 3 to fire a powerful lobbed attack!", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered Knockback Shot", "Upgrade Knockback Shot", "Press Attack 3 to fire an explosive shot that leaves a lingering cloud of damage!", 2000),
                            new Ability("Mastered Target Tag", "Upgrade Target Tag", "Press Attack 3 to target enemies faster than ever, doing even more damage!", 2000),
                            new Ability("Mastered Slow Shot", "Upgrade Slow Shot", "Press Attack 3 to fire a slow explosive that drags enemies in and can be shot again to explode for extra damage!", 2000),
                            new Ability("Mastered Lob Shot", "Upgrade Lob Shot", "Press Attack 3 to fire multiple lobbed arrows!", 2000),
                    },
                    // Soul Gem Power
                    new Ability("Volley Storm", "Requires Soul Gem from Dragon Temple", "Press Special Attack to fire a hail of exploding arrows!\n", 4000)
            )),
    BRAWLER("Brawler", Chapter.MUSHROOM_RIVER,
            new BattleClassAbilityTree(
                    // Weapon Power Options
                    new Ability[]{
                            new Ability("Boxer", "Press Attack 1, A1, A1, A1 to quickly jab and uppercut your enemies.", 0),
                            new Ability("Bruiser", "Press Attack 1, A1, A1 to hammer your enemies with powerful blows.", 0)
                    },
                    // Weapon Power Upgrades
                    new Ability[]{
                            new Ability("Master Boxer", "Upgrade Boxer", "Press Attack 1 for quick attacks with extra damage output.", 700),
                            new Ability("Master Bruiser", "Upgrade Bruiser", "Press Attack 1 for power attacks that deal more damage.", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("Megaton Punch", "Must be at least level 2", "Press Attack 3 to wind up a supercharged punch to send enemies flying.", 0),
                            new Ability("Knockout Clap", "Must be at least level 4", "Press Attack 3 to unleash a shockwave that stuns nearby enemies.", 0),
                            new Ability("Wave Fist", "Defeat Brawler Doomlander", "Press Attack 3 to release an explosive energy punch at your enemies.", 0),
                            new Ability("Dashing Uppercut", "Place a Brawler Sensei on the portal", "Press Attack 3 to push and damage enemies with a charge, before you uppercut them.", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered Megaton Punch", "Upgrade Megaton Punch", "Press Attack 3 to wind up a punch that creates an explosion, dealing damage to a large area.", 2000),
                            new Ability("Mastered Knockout Clap", "Upgrade Knockout Clap", "Press Attack 3 to deal a deafening shockwave that stuns enemies longer.", 2000),
                            new Ability("Mastered Wave Fist", "Upgrade Wave Fist", "Press and hold Attack 3 to charge up your explosive energy punch for more damage.", 2000),
                            new Ability("Mastered Dashing Uppercut", "Upgrade Dashing Uppercut", "Press Attack 3 to charge at and uppercut enemies with devastating force.", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("Fists of Fury", "Requires Soul Gem from Mushroom River", "Press Special Attack to unleash the ultimate Dempsey Roll by punching your way forward through your enemies.", 4000)
            )),
    KNIGHT("Knight", Chapter.SKY_FORTRESS,
            new BattleClassAbilityTree(
                    // Weapon Power Options
                    new Ability[]{
                            new Ability("Duelist", "Press Attack 1 for fast sword swings that hit foes in front of you.", 0),
                            new Ability("Gladiator", "Press Attack 1 for powerful swings that hit foes all around you.", 0)
                    },
                    // Weapon Power Upgrades
                    new Ability[]{
                            new Ability("Master Duelist", "Upgrade Duelist", "Press Attack 1 for rapid swings.\nPress Attack 1 while jumping for a powerful wind shear.", 700),
                            new Ability("Master Gladiator", "Upgrade Gladiator", "Press Attack 1 for strong swings.\nPress Attack 1 while jumping to create a suction field in front of you.", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("Upper-Cutting Sword", "Must be at least level 2", "Press Attack 1 to knock enemies up in the air.", 0),
                            new Ability("Spinning Slash", "Must be at least level 4", "Press Attack 1 for a spinning attack.", 0),
                            new Ability("Mighty Cleave", "Defeat Knight Doomlander", "Press Attack 3 to hit foes with powerful shockwaves.", 0),
                            new Ability("Ground Stab", "Place a Knight Sensei on the portal", "Press Attack 3 to stun enemies by shaking the ground.", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered Upper-Cutting Sword", "Upgrade Upper-Cutting Sword", "Press Attack 3 to knock enemies up in the air.\nHit them with Attack 1 while they're in the air to send them flying.", 2000),
                            new Ability("Mastered Spinning Slash", "Upgrade Spinning Slash", "Press Attack 3 for a spinning attack.\nHold Attack 3 to spin longer.", 2000),
                            new Ability("Mastered Mighty Cleave", "Upgrade Mighty Cleave", "Press Attack 3 to hit foes with powerful shockwaves.\nHold Attack 3 to increase damage and range.", 2000),
                            new Ability("Mastered Ground Stab", "Upgrade Ground Stab", "Press Attack 3 to stun enemies by shaking the ground.\nThe force will unleash an expanding shockwave.", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("Excalibur Execution", "Requires Soul Gem from Sky Fortress", "Press Special Attack to trade health for a temporary speed and damage boost.", 4000)
            )),
    NINJA("Ninja", Chapter.FIZZLAND,
            new BattleClassAbilityTree(
                    // Weapon Power Options
                    new Ability[]{
                            new Ability("Piercer", "Press Attack 1 to throw piercing ninja stars in front of you.", 0),
                            new Ability("Sneaky", "Press Attack 1 to throw ninja stars around you.", 0)
                    },
                    // Weapon Power Upgrades
                    new Ability[]{
                            new Ability("Master Piercer", "Upgrade Piercer", "Press Attack 1 to throw four ninja stars in a wider area!", 700),
                            new Ability("Master Sneaky", "Upgrade Sneaky", "Press Attack 1 to throw stars around you that deal more damage!", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("Party Popper", "Must be at least level 2", "Press Attack 3 to create ninja mines that explode when hit with ninja stars.", 0),
                            new Ability("Ninja Teleport", "Must be at least level 4", "Press Attack 3 to throw out a beacon.\nPress Attack 3 on the ground to quickly dash towards that beacon.", 0),
                            new Ability("Invisibility", "Defeat Ninja Doomlander", "Press Attack 3 to create a decoy while you become invisible.\nMove faster when invisible.", 0),
                            new Ability("Knife Storm", "Place a Ninja Sensei on the portal", "Press Attack 3 for a flurry of throwing knives.", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered Party Popper", "Upgrade Party Popper", "Press Attack 3 to create explosive ninja mines that you can now pop twice for extra impact.", 2000),
                            new Ability("Mastered Ninja Teleport", "Upgrade Ninja Teleport", "Press Attack 3 to throw out a beacon.\nPressing A3 again now throws a barrage of ninja stars before and after you teleport.", 2000),
                            new Ability("Mastered Invisibility", "Upgrade Invisibility", "Press Attack 3 to create a decoy that explodes when it expires.\nYou and your decoy both do area damage while in stealth mode.", 2000),
                            new Ability("Mastered Knife Storm", "Upgrade Knife Storm", "Press Attack 3 for a flurry of throwing knives with larger and harder-hitting knives.", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("Near and Far", "Requires Soul Gem from Fizzland", "Press Special Attack to teleport to nearby enemies and throw stars at each one.", 4000)
            )),
    QUICKSHOT("Quickshot", Chapter.ABANDONED_AMUSEMENT_PARK,
            new BattleClassAbilityTree(
                    // Weapon Power Options
                    new Ability[]{
                            new Ability("Marksman", "Press Attack 1 to fire bullets fast and straight out.", 0),
                            new Ability("Wild Style", "Press Attack 1 to fire powerful scatter shots.", 0)
                    },
                    // Weapon Power Upgrades
                    new Ability[]{
                            new Ability("Master Marksman", "Upgrade Marksman", "Press Attack 1 for fast-paced shots that ricochet off of walls!", 700),
                            new Ability("Master Wild Style", "Upgrade Wild Style", "Press Attack 1 for spread shots that have more range and do more damage!", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("Death Blossom", "Must be at least level 2", "Press Attack 3 to spin around, firing your pistols like crazy.", 0),
                            new Ability("Blast Zone", "Must be at least level 4", "Press Attack 3 to create a danger zone where your enemies take more damage.", 0),
                            new Ability("Charge Shot", "Defeat Quickshot Doomlander", "Hold Attack 3 to charge up a massive shot.", 0),
                            new Ability("Gunslinging It", "Place a Quickshot Sensei on the portal", "Press Attack 3 for concentrated rapid fire in a single direction.", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered Death Blossom", "Upgrade Death Blossom", "Press Attack 3 to spin around, firing your pistols like crazy.\nYou can now move while firing.", 2000),
                            new Ability("Mastered Blast Zone", "Upgrade Blast Zone", "Press Attack 3 for a larger Blast Zone that deals more damage.", 2000),
                            new Ability("Mastered Charge Shot", "Upgrade Charge Shot", "Press Attack 3 to charge a massive shot that deals more damage and knocks enemies back.", 2000),
                            new Ability("Mastered Gunslinging It", "Upgrade Gunslinging It", "Press Attack 3 for concentrated rapid fire in a single direction with greater range and faster movement.", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("Bounty Hunter", "Requires Soul Gem from Abandoned Amusement Park", "Press Special Attack to put a bounty on your enemies - they take extra damage and are slowed.\nDefeat them for extra gold.", 4000)
            )),
    SENTINEL("Sentinel", Chapter.THE_LAIR_OF_KAOS,
            new BattleClassAbilityTree(
                    // Weapon Power Options
                    new Ability[]{
                            new Ability("", "", 0),
                            new Ability("", "", 0)
                    },
                    // Weapon Power Upgrades
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
                    // Weapon Power Options
                    new Ability[]{
                            new Ability("", "", 0),
                            new Ability("", "", 0)
                    },
                    // Weapon Power Upgrades
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
                    // Weapon Power Options
                    new Ability[]{
                            new Ability("", "", 0),
                            new Ability("", "", 0)
                    },
                    // Weapon Power Upgrades
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
                    // Weapon Power Options
                    new Ability[]{
                            new Ability("", "", 0),
                            new Ability("", "", 0)
                    },
                    // Weapon Power Upgrades
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
