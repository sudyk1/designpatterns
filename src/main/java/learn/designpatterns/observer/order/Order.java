package learn.designpatterns.observer.order;

import learn.designpatterns.observer.notification.Observer;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {
    @Setter
    @Getter
    private Long orderNumber;
    @Setter
    @Getter
    private OrderStatus orderStatus;
    private final Set<Observer> registeredObservers = new HashSet<>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        registeredObservers.forEach(ob -> ob.update(this));
    }

    public void changeOrderStatus(OrderStatus orderStatus) {
        setOrderStatus(orderStatus);
        notifyObservers();
    }
}
