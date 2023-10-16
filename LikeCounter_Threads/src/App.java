public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LikeCounter firstCounter = new LikeCounter("Andrew",10);
        LikeCounter secondCounter = new LikeCounter("John", 5);

        firstCounter.start();
        secondCounter.start();

        Thread.sleep(2000);

        System.out.println("Total Likes: "+ Database.totalLikes);




    }
}
    class Database{
          
      static int totalLikes = 0;


    }

    class LikeCounter extends Thread{

        private String fullName;
        private int n;

        
        
        public LikeCounter(String fullName, int n) {
            this.fullName = fullName;
            this.n = n;
        }

        public void like(){
            System.out.println("This like is for [ " + fullName +" ]");
            Database.totalLikes++;
        }

        public void run(){
            while (--n >=0) {
                like();
            }
        }


    }




