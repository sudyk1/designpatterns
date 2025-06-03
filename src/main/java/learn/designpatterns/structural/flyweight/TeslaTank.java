package learn.designpatterns.structural.flyweight;

public class TeslaTank {

    private TeslaTankUnitStats stats;
    private int x;
    private int y;
    private int hpLeft;


    public TeslaTank(int x, int y) {
        this.stats = UnitStatsRepository.getTeslaTankUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
