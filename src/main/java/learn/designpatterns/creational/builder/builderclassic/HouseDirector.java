package learn.designpatterns.creational.builder.builderclassic;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.walls();
        houseBuilder.floors();
        houseBuilder.rooms();
        houseBuilder.roof();
        houseBuilder.windows();
        houseBuilder.doors();
        houseBuilder.garage();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
}
