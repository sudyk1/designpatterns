package learn.designpatterns.behavioral.command.command;

import learn.designpatterns.behavioral.command.workshop.CoffeeMaker;

public class CoffeeMakerTurnOnCommand implements Command {
    private final CoffeeMaker coffeeMaker;

    public CoffeeMakerTurnOnCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOn();
    }

    @Override
    public void undo() {
        coffeeMaker.turnOff();
    }
}
