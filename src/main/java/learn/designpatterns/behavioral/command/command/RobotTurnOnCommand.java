package learn.designpatterns.behavioral.command.command;

import learn.designpatterns.behavioral.command.workshop.Robot;

public class RobotTurnOnCommand implements Command {
    private final Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOn();
    }

    @Override
    public void undo() {
        robot.turnOff();
    }
}
