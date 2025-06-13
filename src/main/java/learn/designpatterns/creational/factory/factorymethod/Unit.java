package learn.designpatterns.creational.factory.factorymethod;

import lombok.ToString;

@ToString
public abstract class Unit {
    private int hp;
    private int exp;
    private int dmg;

    public Unit(int hp, int exp, int dmg) {
        this.hp = hp;
        this.exp = exp;
        this.dmg = dmg;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDmg() {
        return dmg;
    }
}
