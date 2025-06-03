package learn.designpatterns.behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("##### Button start car #####");
        ButtonCarStartingSequence buttonCarStartingSequence = new ButtonCarStartingSequence();
        buttonCarStartingSequence.startTheCar();
        System.out.println("##### Automatic start car #####");
        AutomaticCarStartSequence automaticCarStartSequence = new AutomaticCarStartSequence();
        automaticCarStartSequence.startTheCar();
        System.out.println("##### Classic start car #####");
        ClassicCarStartingSequence classicCarStartingSequence = new ClassicCarStartingSequence();
        classicCarStartingSequence.startTheCar();
    }
}
