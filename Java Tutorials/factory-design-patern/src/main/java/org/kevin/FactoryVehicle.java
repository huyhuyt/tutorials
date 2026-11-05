package org.kevin;

public abstract class FactoryVehicle {
    public MotorVehicle create(){
        MotorVehicle vehicle = createMotorVehicle();
        vehicle.build();
        return vehicle;
    }
    protected abstract MotorVehicle createMotorVehicle();
}
