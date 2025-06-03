package learn.designpatterns.behavioral.observer.notification;

import learn.designpatterns.behavioral.observer.order.Order;

public class TextMessage implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("SMS: Order number " + order.getOrderNumber() + " changed status to: " + order.getOrderStatus());
    }
}
