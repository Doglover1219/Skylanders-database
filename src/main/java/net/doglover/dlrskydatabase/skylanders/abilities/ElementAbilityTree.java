package net.doglover.dlrskydatabase.skylanders.abilities;

import java.util.Arrays;
import java.util.Objects;

public record ElementAbilityTree(Ability[] secundaryOptions, Ability[] secundaryUpgrades, Ability soulGemAbility) implements AbilityTree {
    public ElementAbilityTree(Ability[] secundaryOptions, Ability[] secundaryUpgrades, Ability soulGemAbility) {
        // Null‐checks
        Objects.requireNonNull(secundaryOptions, "secundaryOptions");
        Objects.requireNonNull(secundaryUpgrades, "secundaryUpgrades");
        Objects.requireNonNull(soulGemAbility, "soulGemAbility");

        // Length‐checks
        if (secundaryOptions.length != 4)
            throw new IllegalArgumentException("baseAbilities must have exactly 2 elements");
        if (secundaryUpgrades.length != 4)
            throw new IllegalArgumentException("buyableAbilities must have exactly 4 elements");

        // Shallow‐copy to preserve immutability
        this.secundaryOptions = Arrays.copyOf(secundaryOptions, secundaryOptions.length);
        this.secundaryUpgrades = Arrays.copyOf(secundaryUpgrades, secundaryUpgrades.length);
        this.soulGemAbility = soulGemAbility;
    }

    public String getAbilityTree() {
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.toString();
    }
}