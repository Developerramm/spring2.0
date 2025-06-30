package com.app.test;

import com.app.car.Car;
import com.app.factory.CarFactory;

public class FactoryDpTest {

    public static void main(String[] args) {

        System.out.println("Bharat mata ki jai");

        Car car = null;

        car = CarFactory.getCarInstance("sedan");

        car.startCar();
    }

}
