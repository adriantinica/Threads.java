import main.PizzaMakingProcess;

public class CookingMThApp{
    public static void main(String[] args) {
        PizzaMakingProcess pmp = new PizzaMakingProcess();
        CookThread cook1 = new CookThread(pmp);
        CookThread cook2 = new CookThread(pmp);

        cook1.start();
        cook2.start();
    }
}