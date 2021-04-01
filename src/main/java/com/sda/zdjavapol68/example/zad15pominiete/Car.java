package com.sda.zdjavapol68.example.zad15pominiete;

public class Car {
    public EnumCar enumCar;

    public Car(EnumCar enumCar) {
        this.enumCar = enumCar;
    }

    public EnumCar getEnumCar() {
        return enumCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "enumCar=" + enumCar +
                '}';
    }

    public boolean isFasterThan(Car car) {
        if(this.enumCar.compareTo(car.enumCar) > 0) {
            return true;
        }
        return false;
    }
}
