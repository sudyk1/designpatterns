package learn.designpatterns.behavioral.command.command;

import learn.designpatterns.behavioral.command.workshop.Robot;

public class RobotDrillCommand implements Command {
    private final Robot robot;

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.drill();
    }

    @Override
    public void undo() {

    }
}
