package learn.designpatterns.creational.factory.factorymethod;

public class Rifleman extends  Unit {
    public Rifleman(int hp, int exp, int dmg) {
        super(hp, exp, dmg);
    }

    @Override
    public String toString() {
        return "Rifleman HP:" + super.getHp() + " DMG:" + super.getDmg();
    }
}
