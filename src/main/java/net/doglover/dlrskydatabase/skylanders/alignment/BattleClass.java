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
                            new Ability("Buster", "Press Attack 1 to swipe enemies around you with your staff.", 0),
                            new Ability("Acrobat", "Press Attack 1 to focus your attack on enemies in front of you.", 0)
                    },
                    // Weapon Power Upgrades
                    new Ability[]{
                            new Ability("Master Buster", "Upgrade Buster", "Press Attack 1 for fast, powerful swipes that accelerate and do more damage as you score hits.", 700),
                            new Ability("Master Acrobat", "Upgrade Acrobat", "Press Attack 3 for swift spinning strikes that do more damage and knock enemies down.", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("Clothesline", "Must be at least level 2", "Press Attack 3 to clothesline your enemies.", 0),
                            new Ability("Top Spin", "Must be at least level 4", "Press Attack 3 to create a suction field by spinning your staff.", 0),
                            new Ability("Grand Slam", "Defeat Sentinel Doomlander", "Create a powerful shockwave that travels forward.", 0),
                            new Ability("Hypnotise", "Place a Sentinel Sensei on the portal", "Press Attack 3 to slow down your enemies by entrancing them with your staff.", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered Clothesline", "Upgrade Clothesline", "Press Attack 3 to clothesline your enemies.\nYour sheer power will push them away at the end of the attack.", 2000),
                            new Ability("Mastered Top Spin", "Upgrade Top Spin", "Press Attack 3 to suck enemies to you.\nEnemies you've pulled in are knocked up in the air.", 2000),
                            new Ability("Mastered Grand Slam", "Upgrade Grand Slam", "Press Attack 3 to create a powerful shockwave that travels across a wide area in front of you.", 2000),
                            new Ability("Mastered Hypnotise", "Upgrade Hypnotise", "Press Attack 3 to entrance enemies.\nSlowed enemies now take damage over time.", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("", "Requires Soul Gem from The Lair of Kaos", "Press Special Attack to create an expanding shockwave.", 4000)
            )),
    SMASHER("Smasher", Chapter.THE_GOLDEN_ARCADE,
            new BattleClassAbilityTree(
                    // Weapon Power Options
                    new Ability[]{
                            new Ability("Obliterator", "Press Attack 1 to smash things around you with your club!", 0),
                            new Ability("Pulverizer", "Press Attack 1 to smash things in front of you with full force!", 0)
                    },
                    // Weapon Power Upgrades
                    new Ability[]{
                            new Ability("Master Obliterator", "Upgrade Obliterator", "Press Attack 1 to powerfully smash, creating earthquakes that damage nearby enemies!", 700),
                            new Ability("Master Pulverizer", "Upgrade Pulverizer", "Press Attack 1 to swing your club, enemies launched create a shockwave upon landing!", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("War Cry Rage", "Must be at least level 2", "Press Attack 3 to scare and weaken your enemies.", 0),
                            new Ability("Seismic Slam", "Must be at least level 4", "Press Attack 3 to create a seismic blast.", 0),
                            new Ability("Berserker", "Defeat Smasher Doomlander", "Press Attack 3 to increase your power and speed.", 0),
                            new Ability("Here Comes the Pain", "Place a Smasher Sensei on the portal", "Press Attack 3 to charge and belly-flop your foes.", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered War Cry Rage", "Upgrade War Cry Rage", "Press Attack 3 to scare and weaken your enemies and damage them over time.", 2000),
                            new Ability("Mastered Seismic Slam", "Upgrade Seismic Slam", "Press Attack 3 to create a massive seismic blast.", 2000),
                            new Ability("Mastered Berserker", "Upgrade Berserker", "Press Attack 3 to increase your power, speed, and defense.", 2000),
                            new Ability("Mastered Here Comes the Pain", "Upgrade Here Comes the Pain", "Press Attack 3 to belly-flop and create a giant sinkhole that sucks enemies in.", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("Smash Smash Rinse Repeat", "Requires Soul Gem from The Golden Arcade", "Press and hold Special Attack to go on a crazy Smash Rampage.", 4000)
            )),
    SORCERER("Sorcerer", Chapter.CRADLE_OF_CREATION,
            new BattleClassAbilityTree(
                    // Weapon Power Options
                    new Ability[]{
                            new Ability("Enchanter", "Press Attack 1 to throw magical orbs at your enemies.\nPress A1, A1, A1 for a quintuple shot!", 0),
                            new Ability("Enlightened", "Press or hold Attack 1 to use a magic beam to zap your enemies with.", 0)
                    },
                    // Weapon Power Upgrades
                    new Ability[]{
                            new Ability("Master Enchanter", "Upgrade Enchanter", "Press Attack 1 to fire off a bigger burst of magical energy that does more damage.", 700),
                            new Ability("Master Enlightened", "Upgrade Enlightened", "Press or hold Attack 1 to zap enemies with a magic beam that does enhanced damage.", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("Summoned Fury", "Must be at least level 2", "Press and hold Attack 3 to summon powerful magical lightning.", 0),
                            new Ability("Mystic Grid", "Must be at least level 4", "Press Attack 3 and create a magical grid that will hurt your enemies.", 0),
                            new Ability("Sticky Orb", "Defeat Sorcerer Doomlander", "Press Attack 3 to create an orb that enemies get stuck to.", 0),
                            new Ability("Magic Upheaval", "Place a Sorcerer Sensei on the portal", "Press Attack 3 to throw enemies high up into the air around you.", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered Summoned Fury", "Upgrade Summoned Fury", "Summoned Fury becomes more powerful.", 2000),
                            new Ability("Mastered Mystic Grid", "Upgrade Mystic Grid", "Mystic Grid becomes more powerful, shocking smaller enemies.", 2000),
                            new Ability("Mastered Sticky Orb", "Upgrade Sticky Orb", "Sticky Orb becomes faster and more powerful.", 2000),
                            new Ability("Mastered Magic Upheaval", "Upgrade Magic Upheaval", "Press Attack 3 to blast enemies into the air for stronger impact and more damage.", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("Sorcerer's Circle", "Requires Soul Gem from Cradle of Creation", "Press Special Attack to create a damage barrier around you.\nPress Special Attack again to shoot it out at enemies.", 4000)
            )),
    SWASHBUCKLER("Swashbuckler", Chapter.SHELLMONT_SHORES,
            new BattleClassAbilityTree(
                    // Weapon Power Options
                    new Ability[]{
                            new Ability("Charger", "Press Attack 1 to attack with your dual blades at close range.", 0),
                            new Ability("Knife Thrower", "Press Attack 1 to throw blades at your enemies.", 0)
                    },
                    // Weapon Power Upgrades
                    new Ability[]{
                            new Ability("Master Charger", "Upgrade Charger", "Press Attack 1 to slash and deal more damage with these sharper blades.", 700),
                            new Ability("Master Knife Thrower", "Upgrade Knife Thrower", "Press Attack 1 to throw your blades, doing more damage and stunning on critical hits.", 700)
                    },
                    // Secret Technique Options
                    new Ability[]{
                            new Ability("Sword Wall", "Must be at least level 2", "Press Attack 3 to create a sword wall.\nHit the wall with Attack 1 to send swords flying.", 0),
                            new Ability("Takedown", "Must be at least level 4", "Press Attack 3 to swiftly yank enemies underground with a damaging blow.", 0),
                            new Ability("Bladenado", "Defeat Swashbuckler Doomlander", "Press Attack 3 for a ferocious blade spin attack.", 0),
                            new Ability("Criss-Cross", "Place a Swashbuckler Sensei on the portal", "Press Attack 3 to strike with a devastating criss-cross attack.", 0),
                    },
                    // Secret Technique Upgrades
                    new Ability[]{
                            new Ability("Mastered Sword Wall", "Upgrade Sword Wall", "Press Attack 3 to create an extra-damaging sword wall with increased range.", 2000),
                            new Ability("Mastered Takedown", "Upgrade Takedown", "Press Attack 3 to yank enemies underground.\nYour exit portal will now explode, damaging nearby enemies.", 2000),
                            new Ability("Mastered Bladenado", "Upgrade Bladenado", "Press Attack 3 for a ferocious blade spin attack that continues forward after you have finished the attack.", 2000),
                            new Ability("Mastered Criss-Cross", "Upgrade Criss-Cross", "Press Attack 3 to strike with a devastating criss-cross attack that now curses enemies, causing additional damage for a short time.", 2000),
                    },
                    // Soul Gem Ability
                    new Ability("Steel Fans", "Requires Soul Gem from Shellmont Shores", "Press Special Attack to turn swords into steel fans-a massive spiral attack.", 4000)
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
