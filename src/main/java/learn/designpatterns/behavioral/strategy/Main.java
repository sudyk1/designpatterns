package learn.designpatterns.behavioral.strategy;

import learn.designpatterns.behavioral.strategy.chef.Chef;
import learn.designpatterns.behavioral.strategy.chef.spaghetti_cooker.SpaghettiBologneseCooker;
import learn.designpatterns.behavioral.strategy.chef.spaghetti_cooker.SpaghettiCarbonaraCooker;

public class Main {
    public static void main(String[] args) {
        // new order - spaghetti bolognese
        Chef chef = new Chef("Gordon Ramsey");
        chef.setSpaghettiCooker(new SpaghettiBologneseCooker());
        chef.cook();
        // new order - spaghetti carbonara
        chef.setSpaghettiCooker(new SpaghettiCarbonaraCooker());
        chef.cook();
    }
}
