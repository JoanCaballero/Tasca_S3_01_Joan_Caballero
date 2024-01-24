package org.example.Commands;

import org.example.Vehicles.Vehicle;

public class CommandArrencar implements Command {
    private final Vehicle vehicle;
    public CommandArrencar(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.arrencar();
    }
}
