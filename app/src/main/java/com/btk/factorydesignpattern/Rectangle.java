package com.btk.factorydesignpattern;

import android.util.Log;

public class Rectangle extends Shape {

    private final String TAG = Rectangle.class.getSimpleName();

    @Override
    public void draw() {
        Log.v(TAG, "===>>> Draw a Rectangle");
    }
}
