package com.btk.factorydesignpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Shape shape = ShapeFactory.getShape("rectangle");

        shape.draw();

        Log.v(TAG,"Created shape:");
    }
}
