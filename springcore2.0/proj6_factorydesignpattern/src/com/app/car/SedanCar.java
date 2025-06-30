package com.app.car;

public class SedanCar implements Car {

    private SedanEngine engine;

    public SedanCar(SedanEngine engine) {
        this.engine = engine;
    }

    @Override
    public void startCar() {
        engine.startEngine();
        System.out.println("Sedan car is started");
    }

    @Override
    public void startMusicSystem() {
        System.out.println("Sedan music system is started");
    }

    @Override
    public void moveCar() {
        System.out.println("your Sedan car is moving");
    }

}
