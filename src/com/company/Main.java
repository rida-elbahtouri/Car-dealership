package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Customer newcust = new Customer();
        Dealership OurCars = new Dealership();
        Car car1 = new Car();
        car1.setModelName("tesla s");
        car1.setPrice(25000);

        Car car2 = new Car();
        car2.setModelName("Reno");
        car2.setPrice(18000);

        Car car3 = new Car();
        car3.setModelName("Dacia");
        car3.setPrice(17000);

        Car car4 = new Car();
        car4.setModelName("Lambergienie");
        car4.setPrice(180000);

        Car car5 = new Car();
        car5.setModelName("Reno");
        car5.setPrice(18000);
        OurCars.addCars(car1);
        OurCars.addCars(car2);
        OurCars.addCars(car3);
        OurCars.addCars(car4);
        OurCars.addCars(car5);
        Scanner customer = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your name");
        newcust.setName(customer.nextLine());  // Read user input
        System.out.println("You name is: " + newcust.getName());  // Output user input
        System.out.println("Enter your Cash");
        newcust.setCash(customer.nextDouble());
        System.out.println("your cash is: " + newcust.getCash() + "$");
        System.out.println("Do you want to see our cars ?");

        Scanner answers = new Scanner(System.in);
        String answer = answers.nextLine();
        System.out.println(answer);
        if(answer.equalsIgnoreCase("YES")){
           // OurCars.getCars(newcust.getCash());
             for (int i = 0 ; i <  OurCars.getCars(newcust.getCash()).size(); i++){
                 System.out.println(OurCars.getCars(newcust.getCash()).get(i).getModelName());
             }
        }

    }
}
