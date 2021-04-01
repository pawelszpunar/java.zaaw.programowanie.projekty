package com.sda.zdjavapol68.example.zad13;

import com.sda.zdjavapol68.example.zad12.Car;
import com.sda.zdjavapol68.example.zad12.EngineType;
import com.sda.zdjavapol68.example.zad12.Manufacturer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Manufacturer bmw = new Manufacturer("BMW", 1912, "Germany");
        Manufacturer audi = new Manufacturer("Audi", 1930, "Germany");

        Manufacturer skoda = new Manufacturer("Skoda", 1930, "Germany");
        Manufacturer mercedes = new Manufacturer("Mercedes", 1930, "Germany");

        Car car1 = new Car("Moj pierwszy samochod", "A2", 10.0, 1999, Collections.singletonList(audi), EngineType.S4);
        Car car2 = new Car("Moj pierwszy samochod", "A2", 10.0, 1999, List.of(audi, bmw), EngineType.S4);
        Car car3 = new Car("Moj drugi samochod", "A2", 10.0, 1999, List.of(audi, bmw, skoda), EngineType.V12);


        Car car4 = new Car("Moj drugi samochod", "A2", 10.0, 1999, List.of(audi, bmw, skoda), EngineType.S3);

        System.out.println(Set.of(car1, car2));

        List<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);

        CarService carService = new CarService(carsList);

        System.out.println("-------------");
        System.out.println(carService.carWithAtLeast3Producers());

        System.out.println("-------------");
        System.out.println(carService.checkIfCarExist(car4));

        System.out.println("-------------");
        System.out.println(carService.carsProducedByProducer(skoda));



    }
}
