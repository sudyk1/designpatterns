package learn.designpatterns.structural.decorator;

public class ForestDecorator extends TerrainDecorator {
    private static final int FOREST_FUEL_COST = 5;
    public static final String FOREST_DESCRIPTION = "Forest";

    public ForestDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int getFuelCost() {
        return terrain.getFuelCost() + FOREST_FUEL_COST;
    }

    @Override
    public String getDescription() {
        return FOREST_DESCRIPTION + " " + terrain.getDescription();
    }
}
