package learn.designpatterns.creational.singleton;

import java.io.Serializable;

// If it implements Serializable deserializing creates new instances of that class, solution: readResolve()
// To protected Singleton from reflexion we can use Enum instead of class.
public class GameEngine implements Serializable {
    private int hp = 100;
    private String characterName = "Adam";
    private static GameEngine instance = new GameEngine();

    private GameEngine() {
    }

    // Initializing in ClassLoader if not there should be double if check with creating instance in synchronized (Class.class) block
    public static GameEngine getInstance() {
        return instance;
    }

    public void run() {
        while (true) {
            // render();
        }
    }

    public void render() {
        System.out.println(this.characterName + " - " + this.hp + "HP");
    }

    protected Object readResolve() {
        return getInstance();
    }
}
