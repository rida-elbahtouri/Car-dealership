package com.company;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addCars(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public ArrayList<Vehicle> getCars(double cash){
        ArrayList<Vehicle> newcars = new ArrayList<>();
        for (int i = 0; i < vehicles.size(); i++){
            if(vehicles.get(i).getPrice() <= cash){
                newcars.add(vehicles.get(i));
            }

        }
        return newcars;
    }
}
