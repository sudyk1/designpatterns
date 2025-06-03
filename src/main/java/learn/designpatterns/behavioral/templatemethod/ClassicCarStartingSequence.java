package learn.designpatterns.behavioral.templatemethod;

public class ClassicCarStartingSequence extends CarStartingSequence {
    @Override
    public void setTheGear() {
        System.out.println("Set first gear.");
    }

    @Override
    public void startTheIgnition() {
        System.out.println("Turn the key.");
    }
}
