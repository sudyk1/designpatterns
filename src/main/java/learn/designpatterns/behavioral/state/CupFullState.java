package learn.designpatterns.behavioral.state;

public class CupFullState implements State {
    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Take the cup.");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("First take a full cup of coffee.");
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Taking a cup");
        coffeeMachine.state = new NoCoinState();
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Coffee already made, can't return coin.");
    }
}
