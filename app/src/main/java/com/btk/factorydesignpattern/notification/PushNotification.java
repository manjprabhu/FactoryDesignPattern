package com.btk.factorydesignpattern.notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("==>> Notify via Push notification...");
    }
}
