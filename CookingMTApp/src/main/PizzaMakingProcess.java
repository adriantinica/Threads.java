package main;


public class PizzaMakingProcess {

    private String status;

    public synchronized String getStatus() {
        if(status.equals("Ready")){
            return 0 + " )" +status + "\n---------------\n";
        }else if(status.equals("Heating")){
           return 1 + " )" +status ;
        }else if(status.equals("Dividing")){
            return 2 + " )" +status ;
        }else if(status.equals("Rolling")){
            return 3 + " )" +status ;
        }else if(status.equals("Toping")){
            return 4 + " )" +status ;
        }else if(status.equals("Baking")){
            return 5 + " )" +status ;
        }
        return " ";
        
    }

    public PizzaMakingProcess(){
        status = "Ready";
    }



    public synchronized void next(){
        
        if(status.equals("Ready")){
            status = "Heating";
        }else if(status.equals("Heating")){
            status = "Dividing";
        }else if(status.equals("Dividing")){
            status = "Rolling";
        }else if(status.equals("Rolling")){
            status = "Toping";
        }else if(status.equals("Toping")){
            status = "Baking";
        }else if(status.equals("Baking")){
            status = "Ready";
        }
      
    }
    
}
