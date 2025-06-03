package learn.designpatterns.behavioral.templatemethod;

public class ButtonCarStartingSequence extends CarStartingSequence {
    @Override
    public void startTheIgnition() {
        System.out.println("Push start button.");
    }

    @Override
    public void setTheGear() {
        System.out.println("Set first gear.");
    }
}
