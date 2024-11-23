package Creational_Design_Pattern.factory_Design_Pattern.factory_Design_Pattern;

public class NormalLaptopFactory implements LaptopFactory {
    public Laptop createLaptop() {
        return new NormalLaptop();
    }

}
