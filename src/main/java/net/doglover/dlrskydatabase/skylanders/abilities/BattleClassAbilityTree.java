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

    public String getString() {
        return getPrimary() + "\n" +
                getSecret() + "\n" +
                getSoulGemAbility();
    }

    private String getPrimary() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Primary Attacks:\n\n");

        for (int i = 0; i < primaryOptions.length; i++) {
            stringBuilder.append(i+1).append(". ").append(primaryOptions[i].getTitle()).append(":\n");
            stringBuilder.append(primaryOptions[i].getDescription());
            stringBuilder.append("\n\nUpgrades to: ").append(primaryUpgrades[i].getTitle()).append(" (Price: ").append(primaryUpgrades[i].getPrice()).append("):\n");
            stringBuilder.append(primaryUpgrades[i].getDescription());
            stringBuilder.append("\n(Requirement: ").append(primaryUpgrades[i].getRequirement()).append(")\n\n");
        }

        return stringBuilder.toString();
    }

    private String getSecret() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Secret Techniques:\n\n");

        for (int i = 1; i < secretOptions.length; i++) {
            stringBuilder.append(i+1).append(". ").append(secretOptions[i].getTitle()).append(":\n");
            stringBuilder.append(secretOptions[i].getDescription());
            stringBuilder.append("\n(Requirement: ").append(secretOptions[i].getRequirement()).append(")\n");
            stringBuilder.append("\n\nUpgrades to: ").append(secretUpgrades[i].getTitle()).append(" (Price: ").append(secretUpgrades[i].getPrice()).append("):\n");
            stringBuilder.append(secretUpgrades[i].getDescription());
            stringBuilder.append("\n(Requirement: ").append(secretUpgrades[i].getRequirement()).append(")\n\n");
        }

        return stringBuilder.toString();
    }

    private String getSoulGemAbility() {
        return "Soul Gem Ability: " + soulGemAbility.getTitle() + " (Price: " + soulGemAbility.getPrice() + "):\n" +
                soulGemAbility.getDescription() +
                "\n(Requirement: " + soulGemAbility.getRequirement() + ")";
    }
}