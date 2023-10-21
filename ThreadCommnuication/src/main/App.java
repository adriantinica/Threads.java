package main;



import device.MessengerApp;
import internet.ServerApp;

public class App {
    public static void main(String[] args) throws Exception {

        ServerApp serverApp = new ServerApp("messenger.com");

        MessengerApp androidApp = new MessengerApp("Marry",serverApp);
        MessengerApp macosApp = new MessengerApp("John",serverApp);


        serverApp.start();
        new Thread(androidApp).start();
        new Thread(macosApp).start();
    }
}
