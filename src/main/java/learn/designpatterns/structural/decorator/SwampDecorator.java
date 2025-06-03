package learn.designpatterns.structural.decorator;

public class SwampDecorator extends TerrainDecorator {
    public static final int SWAMP_FUEL_COST = 20;
    public static final String SWAMP_DESCRIPTION = "Swamp";

    public SwampDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int getFuelCost() {
        return terrain.getFuelCost() + SWAMP_FUEL_COST;
    }

    @Override
    public String getDescription() {
        return SWAMP_DESCRIPTION + " " + terrain.getDescription();
    }
}
