package learn.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.run();
    }
}
