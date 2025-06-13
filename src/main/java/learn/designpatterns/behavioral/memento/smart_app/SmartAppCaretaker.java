package learn.designpatterns.behavioral.memento.smart_app;

import java.util.ArrayList;
import java.util.List;

public class SmartAppCaretaker {
    private final List<SmartAppMemento> mementos = new ArrayList<>();

    public void addMemento(SmartAppMemento smartAppMemento) {
        mementos.add(smartAppMemento);
        System.out.println("Save version: v" + smartAppMemento.getVersion() + " under index " + (mementos.size() - 1));
    }

    public SmartAppMemento getMemento(int index) {
        System.out.println("Loaded version v" + mementos.get(index).getVersion());
        return mementos.get(index);
    }
}
