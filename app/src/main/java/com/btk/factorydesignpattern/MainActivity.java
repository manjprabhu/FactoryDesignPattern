package com.btk.factorydesignpattern;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.btk.factorydesignpattern.notification.Notification;
import com.btk.factorydesignpattern.notification.NotificationFactory;

/**
 * Real life example
 * <p>
 * 1. getInstance() method of java.util.Calendar, NumberFormat, and ResourceBundle uses factory method design pattern.
 * <p>
 * 2. All the wrapper classes like Integer, Boolean etc, in Java uses this pattern to evaluate the values using valueOf() method.
 * <p>
 * 3. java.nio.charset.Charset.forName(), java.sql.DriverManager#getConnection(), java.net.URL.openConnection(), java.lang.Class.newInstance(), java.lang.Class.forName() are some of their example where factory method design pattern has been used.
 **/
public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Shape shape = ShapeFactory.getShape("rectangle");

        shape.draw();

        Log.v(TAG, "Created shape:");

        Notification notification = NotificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
