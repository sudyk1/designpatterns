package learn.designpatterns.structural.proxy;

public class SavedGameProxy implements SavedGame {
    private String name;
    private SavedGame sg; // SavedGameFull

    @Override
    public void initialize() {
        this.name = "Save Game - " + System.currentTimeMillis();
    }

    @Override
    public void loadGame() {
        sg = new SavedGameFull();
        sg.initialize();
        sg.loadGame();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
