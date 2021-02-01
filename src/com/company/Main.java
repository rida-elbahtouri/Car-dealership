package com.company;

import java.util.ArrayList;
import java.util.Scanner;
// I need to add a hundler for user input
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
                ArrayList<Car> PCars =  OurCars.getCars(newcust.getCash());
                if(PCars.size() > 0){
                    for (int i = 0 ; i <  OurCars.getCars(newcust.getCash()).size(); i++){
                        System.out.println(i +" - "+PCars.get(i).getModelName()+" the Price is : "+ PCars.get(i).getPrice()+ " $");
                    }
                    System.out.println("enter the number of the car you want to buy");
                    newcust.bycar(PCars.get(answers.nextInt()));
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
