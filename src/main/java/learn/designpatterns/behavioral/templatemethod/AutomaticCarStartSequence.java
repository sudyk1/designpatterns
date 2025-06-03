package learn.designpatterns.behavioral.templatemethod;

public class AutomaticCarStartSequence extends ClassicCarStartingSequence{
    @Override
    public void setTheGear() {
        System.out.println("Set lever to D - Drive");
    }
}
