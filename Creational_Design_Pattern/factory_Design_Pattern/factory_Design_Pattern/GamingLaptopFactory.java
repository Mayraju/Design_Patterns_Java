package Creational_Design_Pattern.factory_Design_Pattern.factory_Design_Pattern;

public class GamingLaptopFactory implements LaptopFactory {

    public Laptop createLaptop() {
        return new GamingLaptop();
    }

}
