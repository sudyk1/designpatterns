package learn.designpatterns.structural.facade;

import learn.designpatterns.structural.facade.deliverybox.DeliveryBoxFacade;

public class Main {
    public static void main(String[] args) {
        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();
    }
}
