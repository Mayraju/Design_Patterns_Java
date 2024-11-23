package Creational_Design_Pattern.factory_Design_Pattern.factory_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        LaptopFactory laptopFactory = new GamingLaptopFactory();
        Laptop myLaptop = laptopFactory.createLaptop();
        myLaptop.runTests();
    }

}
