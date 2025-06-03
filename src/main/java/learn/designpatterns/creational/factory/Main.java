package learn.designpatterns.creational.factory;

import learn.designpatterns.creational.factory.abstractfactory.*;
import learn.designpatterns.creational.factory.factorymethod.Factory;
import learn.designpatterns.creational.factory.factorymethod.Unit;
import learn.designpatterns.creational.factory.factorymethod.UnitFactory;
import learn.designpatterns.creational.factory.factorymethod.UnitType;


public class Main {
    public static void main(String[] args) {
//        Unit rifleman = new Rifleman(30, 0, 10);
//        Unit tank = new Tank(200, 0, 100);

        Factory unitFactory = new UnitFactory();
        Unit rifleman = unitFactory.createUnit(UnitType.INFANTRY);
        Unit tank = unitFactory.createUnit(UnitType.MECHANIZED);

        System.out.println(rifleman);
        System.out.println(tank);


        /// ABSTRACT UNIT FACTORY
        AbstractUnitFactory blueUnitFactory = new BlueUnitFactory();
        InfantryUnit rifleman1 = blueUnitFactory.createRifleman();
        MechanizedUnit tank1 = blueUnitFactory.createTank();

        AbstractUnitFactory redUnitFactory = new RedUnitFactory();
        InfantryUnit rifleman2 = redUnitFactory.createRifleman();
        MechanizedUnit tank2 = redUnitFactory.createTank();

        System.out.println(rifleman1);
        System.out.println(rifleman2);
        System.out.println(tank1);
        System.out.println(tank2);
    }
}
