package learn.designpatterns.builder.builderinner;

public class Main {
    public static void main(String[] args) {
//        House house1 = new House("walls", "floors", "rooms", "roof", "windows", "doors", "garage");
        House house = new House.HouseBuilder()
                .walls("walls")
                .floors("floors")
                .roof("roof")
                .rooms("rooms")
                .build();

        System.out.println(house);
    }
}
