package Creational_Design_Pattern.factory_Design_Pattern.abstract_Factory_Design_Pattern;

public class USComputerFactory implements ComputerFactory {
    public Laptop createLaptop() {
        return new NormalLaptop();
    }

    public Server createServer() {
        return new NormalServer();
    }

}
