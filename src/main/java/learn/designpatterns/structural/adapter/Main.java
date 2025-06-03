package learn.designpatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        ContinentalDevice radio = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("Music is playing");
            }
        };

        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);

        UKDevice ukRadio = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("London calling to the faraway towns!");
            }
        };

        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(ukRadio);

        UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);

        continentalSocket.plugIn(adapter);
    }
}
