package learn.designpatterns.creational.factory.abstractfactory;

public abstract class AbstractUnitFactory {
    public abstract InfantryUnit createRifleman();
    public abstract MechanizedUnit createTank();
}
