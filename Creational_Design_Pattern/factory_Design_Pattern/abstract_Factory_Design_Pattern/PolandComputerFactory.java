package Creational_Design_Pattern.factory_Design_Pattern.abstract_Factory_Design_Pattern;

public class PolandComputerFactory implements ComputerFactory {
    public Laptop createLaptop() {
        return new GamingLaptop();
    }

    public Server createServer() {
        return new GamingServer();
    }

}
