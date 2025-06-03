package learn.designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        generateMap();
    }

    private static void generateMap() {
        Terrain terrain = new Plain();
        Terrain terrain1 = new Hill();
        Terrain terrain2 = new SwampDecorator(new Hill());
        Terrain terrain3 = new ForestDecorator(new SwampDecorator(new Hill()));
        Terrain terrain4 = new RoadDecorator(new Hill());
        System.out.println(terrain1.getDescription() + " fuel cost: " + terrain1.getFuelCost());
        System.out.println(terrain2.getDescription() + " fuel cost: " + terrain2.getFuelCost());
        System.out.println(terrain3.getDescription() + " fuel cost: " + terrain3.getFuelCost());
        System.out.println(terrain4.getDescription() + " fuel cost: " + terrain4.getFuelCost());
    }


}
