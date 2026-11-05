package org.kevin;

public class CarFactory extends FactoryVehicle{
    @Override
    protected static MotorVehicle createMotorVehicle() {
        return new Car();
    }
}
