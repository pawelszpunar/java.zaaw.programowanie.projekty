package com.sda.zdjavapol68.example.zad12;

import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private double price;
    private int productionDate;
    private List<Manufacturer> manufacturersList;
    private EngineType engineType;

    public Car(String name, String model, double price, int productionDate, List<Manufacturer> manufacturersList, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionDate = productionDate;
        this.manufacturersList = manufacturersList;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public List<Manufacturer> getManufacturersList() {
        return manufacturersList;
    }

    public void setManufacturersList(List<Manufacturer> manufacturersList) {
        this.manufacturersList = manufacturersList;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && productionDate == car.productionDate && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturersList, car.manufacturersList) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, productionDate, manufacturersList, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", productionDate=" + productionDate +
                ", manufacturersList=" + manufacturersList +
                ", engineType=" + engineType +
                '}';
    }
}
