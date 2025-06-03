package learn.designpatterns.creational.factory.abstractfactory;

public class RedUnitFactory extends AbstractUnitFactory {

    @Override
    public InfantryUnit createRifleman() {
        return new RiflemanInfantry(35, 0, 8);
    }

    @Override
    public MechanizedUnit createTank() {
        return new TankMechanized(150, 0, 130);
    }
}
