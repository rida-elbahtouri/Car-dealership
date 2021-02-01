package com.company;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> cars = new ArrayList<>();

    public void addCars(Car car){
        cars.add(car);
    }
    public ArrayList<Car> getCars(double cash){
        ArrayList<Car> newcars = new ArrayList<>();
        for (int i=0; i < cars.size(); i++){
            if(cars.get(i).getPrice() <= cash){
                newcars.add(cars.get(i));
            }

        }
        return newcars;
    }
}
