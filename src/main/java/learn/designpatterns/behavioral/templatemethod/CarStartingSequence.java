package learn.designpatterns.behavioral.templatemethod;

public abstract class CarStartingSequence {
    public final void startTheCar() {
        fastenSeatbelt();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Push gas pedal.");
    }

    private void fastenSeatbelt() {
        System.out.println("Fasten seatbelt.");
    }

    public abstract void startTheIgnition();
    public abstract void setTheGear();
}
