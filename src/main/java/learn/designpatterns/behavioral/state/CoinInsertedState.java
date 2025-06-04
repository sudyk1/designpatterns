package learn.designpatterns.behavioral.state;

public class CoinInsertedState implements State {
    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Coin has been inserted.");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Button pressed, filling a cup.");
        coffeeMachine.state = new CupFullState();
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("First press the button to fill the cup.");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Returning the coin");
        coffeeMachine.state = new NoCoinState();
    }
}
