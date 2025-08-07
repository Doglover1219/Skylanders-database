package net.doglover.dlrskydatabase.games.chapters.objectives;

public record TitleObjective(String title) implements Objective {
    @Override
    public String getTitle() {
        return title;
    }
}