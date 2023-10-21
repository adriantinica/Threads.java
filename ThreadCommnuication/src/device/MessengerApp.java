package device;

import internet.ServerApp;
import utils.Logger;

public class MessengerApp implements Runnable {

    private String name;
    private ServerApp server;

    

    

    //connection to server
    public MessengerApp (String name,ServerApp server){
       this.name = name;
       this.server = server;
    }

    //connect to server
    public void connect(){
        server.register(this);//
        Logger.log(name+  " connecting to server"+ server.getDomain());
    }

    //disconnect from server
    public void disconnect(){
        Logger.log(name+  " disconnecting from server" + server.getDomain());
    }

    @Override
    public void run() {
        connect();
        disconnect();
    }

    public String getName() {
        return name;
    }

    
    
}
