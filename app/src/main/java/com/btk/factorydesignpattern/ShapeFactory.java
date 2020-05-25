package com.btk.factorydesignpattern;

public class ShapeFactory {

    public ShapeFactory() {
    }

    public static Shape getShape(String shape) {

        Shape createshape = new Circle();
       switch (shape) {
           case "circle":
               createshape=  new Circle();
               break;
           case "square":
               createshape = new Square();
               break;
           case "rectangle":
               createshape = new Rectangle();
               break;
       }
       return createshape;
    }
}
