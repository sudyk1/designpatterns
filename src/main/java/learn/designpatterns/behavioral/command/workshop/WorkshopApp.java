package learn.designpatterns.behavioral.command.workshop;

import learn.designpatterns.behavioral.command.command.Command;

import java.util.ArrayList;
import java.util.List;

public class WorkshopApp {
    private final List<Command> commandQueue = new ArrayList<>();

    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void run() {
        if (commandQueue.isEmpty()) {
            System.out.println("Queue has no commands.");
            return;
        }
        commandQueue.forEach(Command::execute);
        commandQueue.clear();
    }

    public void undoLastCommand() {
        commandQueue.forEach(Command::undo);
    }
}
