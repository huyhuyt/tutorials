package org.kevin;

public class MotorBikeFactory extends FactoryVehicle{
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new MotorBike();
    }
}
