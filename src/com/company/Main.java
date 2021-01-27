package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer rida = new Customer();
        rida.setName("rida");
        rida.setCash(17000.5);

        Car tesla = new Car();
        tesla.setModelName("tesla S");
        tesla.setPrice(20000);
        rida.testCar(tesla);
        rida.bycar(tesla);
    }
}
