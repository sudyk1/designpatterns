package learn.designpatterns.builder.builderlombok;

public class Main {
    public static void main(String[] args) {
        House house = House.builder()
                .walls("brick walls")
                .floors("wooden floors")
                .rooms("spacious rooms")
                .roof("tiled roof")
                .windows("double-glazed windows")
                .doors("oak doors")
                .garage("two-car garage")
                .build();

        System.out.println(house);
    }
}
