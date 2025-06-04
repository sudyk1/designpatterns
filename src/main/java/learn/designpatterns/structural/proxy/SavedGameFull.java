package learn.designpatterns.structural.proxy;

import static java.lang.Thread.sleep;

public class SavedGameFull implements SavedGame {
    private String name;
    private String gameData;

    public void initialize() {
        this.name = "Save Game - " + System.currentTimeMillis();
        this.gameData = loadFromStorage();
    }

    public void loadGame() {
        System.out.println("Game loaded.");
    }

    private String loadFromStorage() {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Loaded";
    }

    public String getName() {
        return name;
    }
}
