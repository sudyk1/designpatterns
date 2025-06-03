package learn.designpatterns.structural.adapter;

public class TwoWayAdapter implements UKDevice, ContinentalDevice {
    private final UKDevice ukDevice;
    private final ContinentalDevice continentalDevice;

    public TwoWayAdapter(UKDevice ukDevice, ContinentalDevice continentalDevice) {
        this.ukDevice = ukDevice;
        this.continentalDevice = continentalDevice;
    }

    @Override
    public void on() {
        ukDevice.powerOn();
    }

    @Override
    public void powerOn() {
        continentalDevice.on();
    }
}
