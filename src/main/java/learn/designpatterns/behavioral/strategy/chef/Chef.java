package learn.designpatterns.behavioral.strategy.chef;

import learn.designpatterns.behavioral.strategy.chef.spaghetti_cooker.SpaghettiCooker;

public class Chef {
    private String name;
    private SpaghettiCooker spaghettiCooker;

    public Chef(String name) {
        this.name = name;
    }

    public void cook() {
        this.spaghettiCooker.cookSpaghetti();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpaghettiCooker getSpaghettiCooker() {
        return spaghettiCooker;
    }

    public void setSpaghettiCooker(SpaghettiCooker spaghettiCooker) {
        this.spaghettiCooker = spaghettiCooker;
    }
}
