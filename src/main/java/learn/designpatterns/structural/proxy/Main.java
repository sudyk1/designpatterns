package learn.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SavedGame> savedGames = loadSavedGames();
        listSavedGames(savedGames);
    }

    private static List<SavedGame> loadSavedGames() {
        int savedGamesCount = 20;
        List<SavedGame> savedGames = new ArrayList<>(savedGamesCount);
        for (int i = 0; i < savedGamesCount; i++) {
            SavedGame sg = new SavedGameProxy();
            sg.initialize();
            savedGames.add(sg);
        }
        return savedGames;
    }

    private static void listSavedGames(List<SavedGame> savedGames) {
        savedGames.forEach(sg -> System.out.println(sg.getName()));
    }
}
