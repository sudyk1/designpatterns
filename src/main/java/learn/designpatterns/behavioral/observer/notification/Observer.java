package learn.designpatterns.behavioral.observer.notification;

import learn.designpatterns.behavioral.observer.order.Order;

public interface Observer {
    void update(Order order);
}
