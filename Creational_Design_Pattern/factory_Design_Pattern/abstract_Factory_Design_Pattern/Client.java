package Creational_Design_Pattern.factory_Design_Pattern.abstract_Factory_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new PolandComputerFactory();

        Server myServer = computerFactory.createServer();
        myServer.runPingTest();
    }

}
