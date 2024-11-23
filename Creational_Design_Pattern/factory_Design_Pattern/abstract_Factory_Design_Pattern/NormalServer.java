package Creational_Design_Pattern.factory_Design_Pattern.abstract_Factory_Design_Pattern;

public class NormalServer implements Server {
    @Override
    public void runPingTest() {
        System.out.println("Running ping test on a NormalServer..");
    }

}
