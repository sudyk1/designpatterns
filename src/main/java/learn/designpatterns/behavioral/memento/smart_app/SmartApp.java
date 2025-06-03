package learn.designpatterns.behavioral.memento.smart_app;

public class SmartApp {
    private Double version;

    public void changeVersion(Double version) {
        this.version = version;
        System.out.println("New version: v" + this.version);
    }

    public SmartAppMemento save() {
        return new SmartAppMemento(this.version);
    }

    public void load(SmartAppMemento smartAppMemento) {
        this.version = smartAppMemento.getVersion();
    }

    @Override
    public String toString() {
        return "SmartApp version: v" + version;
    }
}
