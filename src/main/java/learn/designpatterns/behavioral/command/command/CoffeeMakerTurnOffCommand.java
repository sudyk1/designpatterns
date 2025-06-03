package learn.designpatterns.behavioral.command.command;

import learn.designpatterns.behavioral.command.workshop.CoffeeMaker;

public class CoffeeMakerTurnOffCommand implements Command {
    private final CoffeeMaker coffeeMaker;

    public CoffeeMakerTurnOffCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOff();
    }

    @Override
    public void undo() {
        coffeeMaker.turnOn();
    }
}
