package learn.designpatterns.behavioral.strategy.chef.spaghetti_cooker;

public class SpaghettiBologneseCooker implements SpaghettiCooker {
    @Override
    public void cookSpaghetti() {
        System.out.println("Cooking Spaghetti Bolognese");
    }
}
