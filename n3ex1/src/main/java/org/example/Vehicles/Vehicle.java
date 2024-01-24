package org.example.Vehicles;

public class Vehicle {

    public void arrencar(){
        System.out.println("Arrencant el " + this.getClass().getSimpleName().toLowerCase());
    }
    public void accelerar(){
        System.out.println("Accelerant el " + this.getClass().getSimpleName().toLowerCase());
    }
    public void frenar(){
        System.out.println("Frenant el " + this.getClass().getSimpleName().toLowerCase());
    }
}
