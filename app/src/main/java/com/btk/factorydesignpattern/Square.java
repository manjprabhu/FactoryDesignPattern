package com.btk.factorydesignpattern;

import android.util.Log;

public class Square extends Shape {

    private final String TAG = Square.class.getSimpleName();

    @Override
    public void draw() {
        Log.v(TAG, "===>>> Draw a Square");
    }
}
