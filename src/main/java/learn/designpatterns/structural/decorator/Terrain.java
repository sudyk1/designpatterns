package learn.designpatterns.structural.decorator;

public abstract class Terrain {
    private String description;
    private int fuelCost;

    public Terrain(String description, int fuelCost) {
        this.description = description;
        this.fuelCost = fuelCost;
    }

    public int getFuelCost() {
        return fuelCost;
    }

    public String getDescription() {
        return description;
    }
}
