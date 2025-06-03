package learn.designpatterns.structural.flyweight;

public class Ship {
    private int x;
    private int y;
    private int hpLeft;
    private ShipUnitStats stats;

    public Ship(int x, int y) {
        this.stats = UnitStatsRepository.getShipStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
