package internet;
import device.MessengerApp;
import java.util.HashSet;
import java.util.Set;
import utils.Logger;

public class ServerApp extends Thread {

    private String domain;
    private Set<MessengerApp> clients;

    

    

    public ServerApp(String domain) {
        this.domain = domain;
        clients = new HashSet<>();

    }

    public  void register(MessengerApp client){
        clients.add(client);
        Logger.log(client.getName()+ " CONNECTED >>> online :" + clients.size());
    }



    @Override
    public void run() {
        Logger.log("Server " + domain +" started");

        Logger.log("Server " + domain +" stopped");
    }



    public String getDomain() {
        return domain;
    }
    
}
