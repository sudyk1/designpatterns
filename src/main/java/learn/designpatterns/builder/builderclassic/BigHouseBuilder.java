package learn.designpatterns.builder.builderclassic;

public class BigHouseBuilder implements HouseBuilder {
    private House house;

    public BigHouseBuilder() {
        house = new House();
    }

    @Override
    public void walls() {
        this.house.setWalls("big walls");
    }

    @Override
    public void floors() {
        this.house.setFloors("big floors");
    }

    @Override
    public void rooms() {
        this.house.setRooms("big rooms");
    }

    @Override
    public void roof() {
        this.house.setRoof("big roof");
    }

    @Override
    public void windows() {
        this.house.setWindows("big windows");
    }

    @Override
    public void doors() {
        this.house.setDoors("big doors");
    }

    @Override
    public void garage() {
        this.house.setGarage("big garage");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
