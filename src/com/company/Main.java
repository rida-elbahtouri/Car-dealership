package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Customer newcust = new Customer();
        Scanner customer = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your name");

        newcust.setName(customer.nextLine());  // Read user input
        System.out.println("You name is: " + newcust.getName());  // Output user input

        System.out.println("Enter your Cash");

        newcust.setCash(customer.nextDouble());
        System.out.println("your cash is: " + newcust.getCash() + "$");


        //rida.setName("rida");
        //rida.setCash(17000.5);

        //Car tesla = new Car();
        //tesla.setModelName("tesla S");
        //tesla.setPrice(20000);
        //rida.testCar(tesla);
        //rida.bycar(tesla);
    }
}
