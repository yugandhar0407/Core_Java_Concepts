package synchronization;

public class App {

	public static int counter = 0;
	
	public static void main(String[] args)  throws InterruptedException {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i <= 1000; i++) {
					App.counter++;
				}
				System.out.println("The loops in thread 1 is over");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0; i<=1000; i++) {
					App.counter++;
				}
				System.out.println("The loops in thread 2 is over");
				
			}
		});
		
		
		t1.start();
		t2.start();
		Thread.sleep(1000);
		System.out.println("The value of counter is: "+App.counter);
		

	}

}
