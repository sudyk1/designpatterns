package learn.designpatterns.behavioral.state;

public class NoCoinState implements State {

    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Coin inserted.");
        coffeeMachine.state = new CoinInsertedState();
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("First insert the coin.");
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("First insert the coin.");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("No coin inserted, can't return.");
    }
}
