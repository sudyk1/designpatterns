package learn.designpatterns.structural.adapter;

public class UKToContinentalAdapter implements ContinentalDevice {
    UKDevice ukDevice;

    public UKToContinentalAdapter(UKDevice ukDevice) {
        this.ukDevice = ukDevice;
    }

    @Override
    public void on() {
        ukDevice.powerOn();
    }
}
