package learn.designpatterns.behavioral.command;

import learn.designpatterns.behavioral.command.command.*;
import learn.designpatterns.behavioral.command.workshop.CoffeeMaker;
import learn.designpatterns.behavioral.command.workshop.Robot;
import learn.designpatterns.behavioral.command.workshop.WorkshopApp;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeeMaker coffeeMaker  = new CoffeeMaker();
        WorkshopApp workshopApp = new WorkshopApp();

        workshopApp.addCommand(new RobotTurnOnCommand(robot));
        workshopApp.addCommand(new CoffeeMakerTurnOnCommand(coffeeMaker));
        workshopApp.addCommand(new RobotCutCommand(robot));
        workshopApp.addCommand(new CoffeeMakerTurnOffCommand(coffeeMaker));
        workshopApp.addCommand(new RobotCutCommand(robot));
        workshopApp.addCommand(new RobotDrillCommand(robot));
        workshopApp.addCommand(new RobotCutCommand(robot));
        workshopApp.addCommand(new RobotTurnOffCommand(robot));
        workshopApp.run();

        workshopApp.run();
    }
}
