package learn.designpatterns.observer;

import learn.designpatterns.observer.notification.Email;
import learn.designpatterns.observer.notification.MobileApp;
import learn.designpatterns.observer.notification.TextMessage;
import learn.designpatterns.observer.order.Order;
import learn.designpatterns.observer.order.OrderStatus;

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
