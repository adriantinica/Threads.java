public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Printer printer1 = new Printer("Cannon");
        Printer printer2 = new Printer("HP");

        printer1.start();
        printer2.start();


        


    }
}

class Printer extends Thread{

    private String name;
    

    public Printer(String name) {
        this.name = name;
    }

    public void print (){
         System.out.println(name + "is running");
    }


    public void run(){
        while (true) {
            
            print();
        }
    }


    
    
}
