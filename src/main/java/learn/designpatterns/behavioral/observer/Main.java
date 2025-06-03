package learn.designpatterns.behavioral.observer;

import learn.designpatterns.behavioral.observer.notification.Email;
import learn.designpatterns.behavioral.observer.notification.MobileApp;
import learn.designpatterns.behavioral.observer.notification.TextMessage;
import learn.designpatterns.behavioral.observer.order.Order;
import learn.designpatterns.behavioral.observer.order.OrderStatus;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(110L, OrderStatus.REGISTER);
        Order order1 = new Order(2L, OrderStatus.REGISTER);
        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);
        order1.registerObserver(email);

        order.changeOrderStatus(OrderStatus.SENT);
        order.changeOrderStatus(OrderStatus.RECEIVED);
        order1.changeOrderStatus(OrderStatus.SENT);
    }
}
