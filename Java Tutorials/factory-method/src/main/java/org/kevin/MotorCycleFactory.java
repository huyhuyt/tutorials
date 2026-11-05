package org.kevin;

public class MotorCycleFactory extends MotorVehicleFactory{
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new MotorCycle();
    }
}
