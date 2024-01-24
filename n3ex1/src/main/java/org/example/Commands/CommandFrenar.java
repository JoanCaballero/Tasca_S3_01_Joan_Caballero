package org.example.Commands;

import org.example.Vehicles.Vehicle;

public class CommandFrenar implements Command{
    private final Vehicle vehicle;
    public CommandFrenar(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.frenar();
    }
}