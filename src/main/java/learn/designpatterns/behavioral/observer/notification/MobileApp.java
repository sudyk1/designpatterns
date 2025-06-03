package learn.designpatterns.behavioral.observer.notification;

import learn.designpatterns.behavioral.observer.order.Order;

public class MobileApp implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("MobileApp: Order number " + order.getOrderNumber() + " changed status to: " + order.getOrderStatus());
    }
}
