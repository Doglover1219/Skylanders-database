package net.doglover.dlrskydatabase.skylanders.abilities;

import java.util.Arrays;
import java.util.Objects;

public record BattleClassAbilityTree(Ability[] primaryOptions, Ability[] primaryUpgrades, Ability[] secretOptions,
                                     Ability[] secretUpgrades, Ability soulGemAbility) implements AbilityTree {
    public BattleClassAbilityTree(Ability[] primaryOptions, Ability[] primaryUpgrades, Ability[] secretOptions,
                                  Ability[] secretUpgrades, Ability soulGemAbility) {
        // Null‐checks
        Objects.requireNonNull(primaryOptions, "baseAbilities");
        Objects.requireNonNull(primaryUpgrades, "buyableAbilities");
        Objects.requireNonNull(secretOptions, "path1Abilities");
        Objects.requireNonNull(secretUpgrades, "path2Abilities");
        Objects.requireNonNull(soulGemAbility, "soulGemAbility");

        // Length‐checks
        if (primaryOptions.length != 2)
            throw new IllegalArgumentException("baseAbilities must have exactly 2 elements");
        if (primaryUpgrades.length != 2)
            throw new IllegalArgumentException("buyableAbilities must have exactly 2 elements");
        if (secretOptions.length != 4)
            throw new IllegalArgumentException("path1Abilities must have exactly 3 elements");
        if (secretUpgrades.length != 4)
            throw new IllegalArgumentException("path2Abilities must have exactly 3 elements");

        // Shallow‐copy to preserve immutability
        this.primaryOptions = Arrays.copyOf(primaryOptions, primaryOptions.length);
        this.primaryUpgrades = Arrays.copyOf(primaryUpgrades, primaryUpgrades.length);
        this.secretOptions = Arrays.copyOf(secretOptions, secretOptions.length);
        this.secretUpgrades = Arrays.copyOf(secretUpgrades, secretUpgrades.length);
        this.soulGemAbility = soulGemAbility;
    }

    public String getAbilityTree() {
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.toString();
    }
}