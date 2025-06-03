package learn.designpatterns.creational.factory.abstractfactory;

public class BlueUnitFactory extends AbstractUnitFactory {
    @Override
    public InfantryUnit createRifleman() {
        return new RiflemanInfantry(30, 0, 10) {
        };
    }

    @Override
    public MechanizedUnit createTank() {
        return new TankMechanized(200,0,100);
    }
}
