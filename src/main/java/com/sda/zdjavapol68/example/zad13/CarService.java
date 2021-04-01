package com.sda.zdjavapol68.example.zad13;

import com.sda.zdjavapol68.example.zad12.Car;
import com.sda.zdjavapol68.example.zad12.EngineType;
import com.sda.zdjavapol68.example.zad12.Manufacturer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarService {
    public final List<Car> cars;

    public CarService(List<Car> cars) {
        this.cars = new ArrayList<>(cars);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void deleteCar(Car car) {
        cars.remove(car);

    }

    public List<Car> getAll() {
        return new ArrayList<>(cars);
    }

    public List<Car> productionBefore1999() {
        List<Car> list = new ArrayList<>();
        for (Car car : cars) {
            if(car.getProductionDate() <= 1999) {
                list.add(car);
            }
        }
        return list;
    }

    public List<Car> productionBefore1999Stream() {
        return cars.stream().filter(i -> i.getEngineType() == EngineType.V12).collect(Collectors.toList());
    }


    public List<Car> carsWithEngineV12() {
        List<Car> list = new ArrayList<>();
        for (Car car : cars) {
            if(car.getEngineType().equals(EngineType.V12)) {
                list.add(car);
            }
        }
        return list;
    }

    //najdroższy

    public Car dearestCar() {
        //return cars.stream().max((car1,car2) -> Double.compare(car1.getPrice(),car2.getPrice())).orElse(null);
        return cars.stream().max(Comparator.comparingDouble(Car::getPrice)).orElse(null);
    }

    //najtańszy

    public Car cheapestCar() {
        return cars.stream().min(Comparator.comparingDouble(Car::getPrice)).orElse(null);
    }




    //posortowanie

    public List<Car> getSorted(SortOrder sortOrder) {
        return cars.stream()
                .sorted((o1, o2) -> {
                    if(sortOrder == SortOrder.ASC) {
                        return o1.getName().compareToIgnoreCase(o2.getName());
                    } else {
                        return -o1.getName().compareToIgnoreCase(o2.getName());
                    }
                })
                .collect(Collectors.toList());
    }

    public List<Car> carWithAtLeast3Producers() {
        return cars.stream().filter(i -> i.getManufacturersList().size() >= 3).collect(Collectors.toList());
    }

    public boolean checkIfCarExist(Car car) {
        return cars.contains(car);
        //return cars.stream().anyMatch(i -> i.equals(car));
    }

    public List<Car> carsProducedByProducer(Manufacturer manufacturer) {
        return cars.stream().filter(i -> i.getManufacturersList().contains(manufacturer)).collect(Collectors.toList());
    }








}
