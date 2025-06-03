package learn.designpatterns.behavioral.command.command;

import learn.designpatterns.behavioral.command.workshop.Robot;

public class RobotCutCommand implements Command {
    private final Robot robot;

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.cut();
    }

    @Override
    public void undo() {

    }
}
