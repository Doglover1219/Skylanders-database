package net.doglover.dlrskydatabase.skylanders.abilities;

public class Ability {
    /* --- Fields --- */
    private final String title;
    private final String requirement;
    private final String description;
    private final int price;

    /* --- Constructors --- */
    public Ability(String title, String requirement, String description, int price) {
        this.title = title;
        this.requirement = requirement;
        this.description = description;
        this.price = price;
    }

    public Ability(String title, String description, int price) {
        this(title, null, description, price);
    }

    /* --- Getter Methods --- */
    public String getTitle() {
        return title;
    }
    public String getRequirement() {
        return requirement;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }
}
