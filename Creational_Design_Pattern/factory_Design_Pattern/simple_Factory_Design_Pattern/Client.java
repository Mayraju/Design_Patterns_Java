package Creational_Design_Pattern.factory_Design_Pattern.simple_Factory_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        LaptopFactory laptopFactory = new LaptopFactory();

        Laptop myLaptop = laptopFactory.createLaptop("GamingLaptop");
        myLaptop.runTests();

    }
}