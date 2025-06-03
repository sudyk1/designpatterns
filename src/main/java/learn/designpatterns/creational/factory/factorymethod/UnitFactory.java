package learn.designpatterns.creational.factory.factorymethod;

public class UnitFactory extends Factory {
    @Override
    public Unit createUnit(UnitType type) {
        return switch (type) {
            case INFANTRY -> new Rifleman(30, 0, 10);
            case MECHANIZED -> new Tank(200, 0, 100);
            case AIR -> null;
        };
    }
}
