package net.doglover.dlrskydatabase.skylanders.abilities;

import java.util.Arrays;
import java.util.Objects;

public record SkylanderAbilityTree(Ability[] baseAbilities, Ability[] buyableAbilities, Ability[] path1Abilities,
                                   Ability[] path2Abilities, Ability soulGemAbility) implements AbilityTree {
    public SkylanderAbilityTree(Ability[] baseAbilities, Ability[] buyableAbilities, Ability[] path1Abilities,
                                Ability[] path2Abilities, Ability soulGemAbility) {
        // Null‐checks
        Objects.requireNonNull(baseAbilities, "baseAbilities");
        Objects.requireNonNull(buyableAbilities, "buyableAbilities");
        Objects.requireNonNull(path1Abilities, "path1Abilities");
        Objects.requireNonNull(path2Abilities, "path2Abilities");
        Objects.requireNonNull(soulGemAbility, "soulGemAbility");

        // Length‐checks
        if (baseAbilities.length != 2)
            throw new IllegalArgumentException("baseAbilities must have exactly 2 elements");
        if (buyableAbilities.length != 4)
            throw new IllegalArgumentException("buyableAbilities must have exactly 4 elements");
        if (path1Abilities.length != 3)
            throw new IllegalArgumentException("path1Abilities must have exactly 3 elements");
        if (path2Abilities.length != 3)
            throw new IllegalArgumentException("path2Abilities must have exactly 3 elements");

        // Shallow‐copy to preserve immutability
        this.baseAbilities = Arrays.copyOf(baseAbilities, baseAbilities.length);
        this.buyableAbilities = Arrays.copyOf(buyableAbilities, buyableAbilities.length);
        this.path1Abilities = Arrays.copyOf(path1Abilities, path1Abilities.length);
        this.path2Abilities = Arrays.copyOf(path2Abilities, path2Abilities.length);
        this.soulGemAbility = soulGemAbility;
    }

    public String getAbilityTree() {
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.toString();
    }
}
