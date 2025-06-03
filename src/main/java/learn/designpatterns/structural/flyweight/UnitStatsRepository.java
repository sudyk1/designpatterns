package learn.designpatterns.structural.flyweight;

public class UnitStatsRepository {
    private static final ShipUnitStats shipUnitStats = new ShipUnitStats("Destroyer", 1500, 1000, 450, 40, 3000);
    private static final TeslaTankUnitStats teslaTankUnitStats = new TeslaTankUnitStats("Tank", 200, 100, 150, 20, 500);
    private static final RiflemanUnitStats rifleManUnitStats = new RiflemanUnitStats("Rifle", 30, 10, 30, 25, 30);

    private UnitStatsRepository() {}

    public static ShipUnitStats getShipStats() {
        return shipUnitStats;
    }

    public static TeslaTankUnitStats getTeslaTankUnitStats() {
        return teslaTankUnitStats;
    }

    public static RiflemanUnitStats getRifleManUnitStats() {
        return rifleManUnitStats;
    }
}
