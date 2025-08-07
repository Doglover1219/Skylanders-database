package net.doglover.dlrskydatabase.skylanders.abilities;

import java.util.Arrays;
import java.util.Objects;

public record BattleClassAbilityTree(Ability[] primaryOptions, Ability[] primaryUpgrades, Ability[] secretOptions,
                                     Ability[] secretUpgrades, Ability soulGemAbility) implements AbilityTree {
    public BattleClassAbilityTree(Ability[] primaryOptions, Ability[] primaryUpgrades, Ability[] secretOptions,
                                  Ability[] secretUpgrades, Ability soulGemAbility) {
        // Null‐checks
        Objects.requireNonNull(primaryOptions, "primaryOptions");
        Objects.requireNonNull(primaryUpgrades, "primaryUpgrades");
        Objects.requireNonNull(secretOptions, "secretOptions");
        Objects.requireNonNull(secretUpgrades, "secretUpgrades");
        Objects.requireNonNull(soulGemAbility, "soulGemAbility");

        // Length‐checks
        if (primaryOptions.length != 2) {
            throw new IllegalArgumentException("primaryOptions must have exactly 2 elements");
        }
        if (primaryUpgrades.length != 2) {
            throw new IllegalArgumentException("primaryUpgrades must have exactly 2 elements");
        }
        if (secretOptions.length != 4) {
            throw new IllegalArgumentException("secretOptions must have exactly 3 elements");
        }
        if (secretUpgrades.length != 4) {
            throw new IllegalArgumentException("secretUpgrades must have exactly 3 elements");
        }

        // Shallow‐copy to preserve immutability
        this.primaryOptions = Arrays.copyOf(primaryOptions, primaryOptions.length);
        this.primaryUpgrades = Arrays.copyOf(primaryUpgrades, primaryUpgrades.length);
        this.secretOptions = Arrays.copyOf(secretOptions, secretOptions.length);
        this.secretUpgrades = Arrays.copyOf(secretUpgrades, secretUpgrades.length);
        this.soulGemAbility = soulGemAbility;
    }

    public String getAbilityTree() {
        return "Primary Attacks:\n" +
                "1. " + primaryOptions[0].getTitle() + ":\n" +
                primaryOptions[0].getDescription() +
                "\n\nUpgrades to " + primaryUpgrades[0].getTitle() + " (Price: " + primaryUpgrades[0].getPrice() + "):\n" +
                primaryUpgrades[0].getDescription() +
                "\n(Requirement: " + primaryUpgrades[0].getRequirement() + ")" +
                "\n\n2. " + primaryOptions[1].getTitle() + ":\n" +
                primaryOptions[1].getDescription() +
                "\n\nUpgrades to " + primaryUpgrades[1].getTitle() + " (Price: " + primaryUpgrades[1].getPrice() + "):\n" +
                primaryUpgrades[1].getDescription() +
                "\n(Requirement: " + primaryUpgrades[1].getRequirement() + ")" +
                "\n\nSoul Gem Ability: " + soulGemAbility.getTitle() + " (Price: " + soulGemAbility.getPrice() + "):\n" +
                soulGemAbility.getDescription() +
                "\n(Requirement: " + soulGemAbility.getRequirement();
    }
}