package learn.designpatterns.creational.builder.builderinner;

public class House {
    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String windows;
    private String doors;
    private String garage;

    private House(HouseBuilder houseBuilder) {
        this.walls = houseBuilder.walls;
        this.floors = houseBuilder.floors;
        this.rooms = houseBuilder.rooms;
        this.roof = houseBuilder.roof;
        this.windows = houseBuilder.windows;
        this.doors = houseBuilder.doors;
        this.garage = houseBuilder.garage;
    }

    public String getWalls() {
        return walls;
    }

    public String getFloors() {
        return floors;
    }

    public String getRooms() {
        return rooms;
    }

    public String getRoof() {
        return roof;
    }

    public String getWindows() {
        return windows;
    }

    public String getDoors() {
        return doors;
    }

    public String getGarage() {
        return garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", floors='" + floors + '\'' +
                ", rooms='" + rooms + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", doors='" + doors + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }

    public static class HouseBuilder {
        private String walls;
        private String floors;
        private String rooms;
        private String roof;
        private String windows;
        private String doors;
        private String garage;

        public HouseBuilder walls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder floors(String floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder rooms(String rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder roof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder windows(String windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder doors(String doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder garage(String garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
