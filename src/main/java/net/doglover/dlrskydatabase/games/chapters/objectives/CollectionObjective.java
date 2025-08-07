package net.doglover.dlrskydatabase.games.chapters.objectives;

public record CollectionObjective(String title, int maxCount) implements Objective {
    @Override
    public String getTitle() {
        return title + "0/" + maxCount;
    }
}
