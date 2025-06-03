package learn.designpatterns.structural.decorator;

public class RoadDecorator extends TerrainDecorator {
    public static final int ROAD_FUEL_COST = -10;
    public static final String ROAD_DESCRIPTION = "Road";

    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int getFuelCost() {
        if (terrain.getFuelCost() + ROAD_FUEL_COST <= 0) {
            return 1;
        }
        return terrain.getFuelCost() + ROAD_FUEL_COST;
    }

    @Override
    public String getDescription() {
        return ROAD_DESCRIPTION + " " + terrain.getDescription();
    }
}
