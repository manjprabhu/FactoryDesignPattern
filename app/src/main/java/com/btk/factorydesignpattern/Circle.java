package com.btk.factorydesignpattern;

import android.util.Log;

public class Circle extends Shape {

    private final String TAG = Circle.class.getSimpleName();
    @Override
    public void draw() {
        Log.v(TAG,"===>>> Draw a Circle");
    }
}
