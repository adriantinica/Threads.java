public class App{
	
		

	public static void main(String[] args) {
		new App().doCounter();
	}
	
	private int count = 0;
	
	private synchronized void increment() {
		count++;
	}
	
	private void doCounter() {
	    // 2)
		Thread t1 = new Thread(new Runnable() { //So, when you create an anonymous class implementing Runnable,
			//you're essentially providing the implementation for the run() method right there in the code. 
			
			@Override
			public void run() {
	            // 3)
				for(int i = 0; i < 1_000_000; i++) {
					increment();
				}
	            System.out.println("t1: " + count);
				
			}
		});
	
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				
				for (int i =0; i< 1000000; i++) {
					increment();
				}
				System.out.println("t2: " + count);
				
			}
		
				
			});
	
		// 4)
		t2.start();
		t1.start();
		

	}
	}
		
	
