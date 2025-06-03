package learn.designpatterns.creational.builder.builderclassic;

public interface HouseBuilder {
    void walls();
    void floors();
    void rooms();
    void roof();
    void windows();
    void doors();
    void garage();
    House getHouse();
}
