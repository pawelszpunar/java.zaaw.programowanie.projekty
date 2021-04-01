package com.sda.zdjavapol68.example.zad32;

import java.io.Serializable;

public class Car implements Serializable {

    //private static final long serialVersionUID = 4456L;

    private final String name;
    private final String model;
    private final double price;
    private final int productionYear;

    public Car(String name, String model, double price, int productionYear) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getModel() {
        return model;
    }

//    public void setModel(String model) {
//        this.model = model;
//    }

    public double getPrice() {
        return price;
    }

//    public void setPrice(double price) {
//        this.price = price;
//    }
}
