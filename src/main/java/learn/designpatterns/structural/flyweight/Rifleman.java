package learn.designpatterns.structural.flyweight;

public class Rifleman {
    private RiflemanUnitStats stats;
    private int x;
    private int y;
    private int hpLeft;

    public Rifleman(int x, int y) {
        this.stats = UnitStatsRepository.getRifleManUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();

    }
}
