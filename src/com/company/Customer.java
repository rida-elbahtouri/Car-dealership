package com.company;

public class Customer {
    private String name;
    private double Cash;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public double getCash() {
        return Cash;
    }
    public void setCash(double cash){
        this.Cash =cash;
    }


    protected void testCar(Car car) {
        double price90 = car.getPrice() - car.getPrice() * 1/10;
        if( price90 <= this.Cash){
            System.out.println("you can test the car");
        }else {
            System.out.println("sorry you should have at least 90% of the car price " + price90 +  "$ to test it");
        }
    }

    public void bycar(Car car){
        if ( car.getPrice()<=this.Cash ){
            setCash(this.Cash - car.getPrice());
            System.out.println("congrat for buying "+ car.getModelName() + " it an amazying car!");
        }else {
            System.out.println("you need more money!");
        }
    }

}
