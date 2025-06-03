package learn.designpatterns.creational.factory.factorymethod;


public class Tank extends Unit {
    public Tank(int hp, int exp, int dmg) {
        super(hp, exp, dmg);
    }

    @Override
    public String toString() {
        return "Tank HP:" + super.getHp() + " DMG:" + super.getDmg();
    }
}
