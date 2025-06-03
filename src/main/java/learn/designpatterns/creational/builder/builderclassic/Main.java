package learn.designpatterns.creational.builder.builderclassic;

public class Main {
    public static void main(String[] args) {
        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector houseDirector = new HouseDirector(smallHouseBuilder);
        houseDirector.buildHouse();
        House house = houseDirector.getHouse();

        System.out.println(house);


    }
}
