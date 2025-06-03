package learn.designpatterns.behavioral.command.command;

import learn.designpatterns.behavioral.command.workshop.Robot;

public class RobotTurnOffCommand implements Command {
    private final Robot robot;

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOff();
    }

    @Override
    public void undo() {
        robot.turnOn();
    }
}
