package org.kevin;

public class Main {
    public static void main(String[] args) {

        CarFactory car = new CarFactory();
        MotorVehicle car1 = car.createMotorVehicle();
        MotorVehicle car2 = car.createMotorVehicle();
        MotorVehicle car3 = car.createMotorVehicle();
        car1.build();

        MotorCycleFactory bike = new MotorCycleFactory();
        MotorVehicle bike1 = bike.createMotorVehicle();
        MotorVehicle bike2 = bike.createMotorVehicle();
        bike1.build();

        Car car4 = new Car();
        car4.build();
        Car car5 = new Car();
        car5.build();

        XeFactory xe = new XeFactory();
        Car car6 = xe.createCar();
        car6.build();
        MotorCycle bike3 = xe.createMotorCycle();
        bike3.build();

    }
}