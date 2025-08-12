package net.doglover.dlrskydatabase.skylanders.abilities;

import java.util.Arrays;
import java.util.Objects;

public record ElementAbilityTree(Ability[] secundaryOptions, Ability[] secundaryUpgrades) implements AbilityTree {
    public ElementAbilityTree(Ability[] secundaryOptions, Ability[] secundaryUpgrades) {
        // Null‐checks
        Objects.requireNonNull(secundaryOptions, "secundaryOptions");
        Objects.requireNonNull(secundaryUpgrades, "secundaryUpgrades");

        // Length‐checks
        if (secundaryOptions.length != 4)
            throw new IllegalArgumentException("secundaryOptions must have exactly 4 elements");
        if (secundaryUpgrades.length != 4)
            throw new IllegalArgumentException("secundaryUpgrades must have exactly 4 elements");

        // Shallow‐copy to preserve immutability
        this.secundaryOptions = Arrays.copyOf(secundaryOptions, secundaryOptions.length);
        this.secundaryUpgrades = Arrays.copyOf(secundaryUpgrades, secundaryUpgrades.length);
    }

    public String getString() {
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.toString();
    }
}