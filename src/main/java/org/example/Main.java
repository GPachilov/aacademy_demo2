package org.example;

import org.example.model.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car = new Car();
        Car car2 = new Car();
        car.setBrand("Honda");

        Car car3 = Car.builder().engineVolume("2.2").brand("").model("").build();


    }
}