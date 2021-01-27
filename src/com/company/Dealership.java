package com.company;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> cars = new ArrayList<Car>();

    public void addCars(Car car){
        cars.add(car);
    }
    public ArrayList getCars(double cash){
        ArrayList<Car> newcars = new ArrayList<Car>();
        for (int i=0; i <= cars.size(); i++){
            newcars.add(cars.get(i));
        }

        return newcars;
    }
}
