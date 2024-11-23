package Creational_Design_Pattern.factory_Design_Pattern.abstract_Factory_Design_Pattern;

public class GamingServer implements Server {
    @Override
    public void runPingTest() {
        System.out.println("Running ping test on a GamingServer...");
    }

}
