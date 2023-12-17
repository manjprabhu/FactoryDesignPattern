package com.btk.factorydesignpattern.notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("==>> Notify via SMS");
    }
}
