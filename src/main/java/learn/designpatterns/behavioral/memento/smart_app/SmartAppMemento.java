package learn.designpatterns.behavioral.memento.smart_app;

class SmartAppMemento {
    private Double version;

    SmartAppMemento(Double version) {
        this.version = version;
    }

    Double getVersion() {
        return version;
    }
}
