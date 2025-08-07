package net.doglover.dlrskydatabase.skylanders;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    UNKNOWN("Unknown"); // This one's here for when it's needed, though hopefully it isn't.

    private final String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
