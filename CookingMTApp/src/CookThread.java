import main.PizzaMakingProcess;

public class CookThread extends Thread{
    private PizzaMakingProcess pmp;

    public CookThread(PizzaMakingProcess pmp) {
        this.pmp = pmp;
    }

    @Override
    public void run() {
       while (true){
            synchronized(pmp){
            System.out.println(pmp.getStatus());
            pmp.next();
            }
       }
    }

    

    

}