package org.example.Commands;

import org.example.Vehicles.Vehicle;

public class CommandAccelerar implements Command{
    private final Vehicle vehicle;
    public CommandAccelerar(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.accelerar();
    }
}
