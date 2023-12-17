package com.btk.factorydesignpattern.notification;

public class NotificationFactory {

    public static Notification createNotification(String type) {
        switch (type) {
            case "SMS": {
                return new SMSNotification();
            }
            case "PUSH": {
                return new PushNotification();
            }
            case "EMAIL": {
                return new EmailNotification();
            }
            default:
                return new SMSNotification();
        }
    }
}
