package com.company;

import java.util.ArrayList;
import java.util.Scanner;
// I need to add a hundler for user input
public class BaseDealer {

    public static void main(String[] args) {
        Customer newcust = new Customer();
        Dealership OurCars = new Dealership();
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setModelName("tesla s");
        vehicle1.setPrice(25000);

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setModelName("Reno");
        vehicle2.setPrice(18000);

        Vehicle vehicle3 = new Vehicle();
        vehicle3.setModelName("Dacia");
        vehicle3.setPrice(17000);

        Vehicle vehicle4 = new Vehicle();
        vehicle4.setModelName("Lambergienie");
        vehicle4.setPrice(180000);

        Vehicle vehicle5 = new Vehicle();
        vehicle5.setModelName("Reno");
        vehicle5.setPrice(18000);
        OurCars.addCars(vehicle1);
        OurCars.addCars(vehicle2);
        OurCars.addCars(vehicle3);
        OurCars.addCars(vehicle4);
        OurCars.addCars(vehicle5);
        Scanner customer = new Scanner(System.in);
        System.out.println("Enter your name");
        newcust.setName(customer.nextLine());
        System.out.println("You name is: " + newcust.getName());
        System.out.println("Enter your Cash");
        newcust.setCash(customer.nextDouble());
        System.out.println("your cash is: " + newcust.getCash() + "$");


        Scanner answers = new Scanner(System.in);
        System.out.println("Do you want to see our cars ? write yes or no");
        String answer = answers.nextLine();

        if(answer.equalsIgnoreCase("YES")){
            boolean prsent = true;
            while(prsent){
                ArrayList<Vehicle> PVehicles =  OurCars.getCars(newcust.getCash());
                if(PVehicles.size() > 0){
                    for (int i = 0 ; i <  OurCars.getCars(newcust.getCash()).size(); i++){
                        System.out.println(i +" - "+ PVehicles.get(i).getModelName()+" the Price is : "+ PVehicles.get(i).getPrice()+ " $");
                    }
                    System.out.println("enter the number of the car you want to buy");
                    newcust.bycar(PVehicles.get(answers.nextInt()));
                    System.out.println("Your remain cash is : "+newcust.getCash());
                    System.out.println("Do you want to see other cars?");
                    Scanner buyagain = new Scanner(System.in);
                    answer = buyagain.nextLine();
                    if(answer.equalsIgnoreCase("YES")){
                        prsent = true;
                    }else {
                        System.out.println("Thank you for comming here and we hope we see you again!!");
                        prsent = false;
                    }
                }else {
                    System.out.println("it seems there is no cars you can buy with you current balance");
                    System.out.println("please come back again next time , we may have other new cars");
                    prsent = false;
                }
            }
        }
    }
}
