package net.doglover.dlrskydatabase.games.chapters.objectives;

public record TimeObjective(String title, int minutes, int seconds, boolean leadingZero) implements Objective {
    @Override
    public String getTitle() {
        if (leadingZero) {
            return title  + (minutes >= 10 ? minutes : "0" + minutes) + ":" + (seconds >= 10 ? seconds : "0" + seconds);
        } else {
            return title  + minutes + ":" + (seconds >= 10 ? seconds : "0" + seconds);
        }
    }
}
