package learn.designpatterns.structural.flyweight;

public class TeslaTankUnitStats {
    private String name;
    private int hp;
    private int armour;
    private int damage;
    private int speed;
    private int resourceCost;

    public TeslaTankUnitStats(String name, int hp, int armour, int damage, int speed, int resourceCost) {
        this.name = name;
        this.hp = hp;
        this.armour = armour;
        this.damage = damage;
        this.speed = speed;
        this.resourceCost = resourceCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getResourceCost() {
        return resourceCost;
    }

    public void setResourceCost(int resourceCost) {
        this.resourceCost = resourceCost;
    }
}
