package learn.designpatterns.observer.notification;

import learn.designpatterns.observer.order.Order;

public interface Observer {
    void update(Order order);
}
