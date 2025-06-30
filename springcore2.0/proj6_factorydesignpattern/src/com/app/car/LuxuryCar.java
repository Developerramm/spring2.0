package com.app.car;

public class LuxuryCar implements Car {

    private LuxuryEngine engine;

    public LuxuryCar(LuxuryEngine engine) {
        this.engine = engine;
    }

    @Override
    public void startCar() {
        engine.startEngine();
        System.out.println("Luxury car is started");
    }

    @Override
    public void startMusicSystem() {
        System.out.println("Luxury music system is started");
    }

    @Override
    public void moveCar() {
        System.out.println("your Luxury car is moving");
    }

}
