package multithreading;

import java.util.Random;

class MyCounter1 implements Runnable{

	private int threadNo; 
	
	
	
	public MyCounter1(int threadNo) {
		super();
		this.threadNo = threadNo;
	}



	@Override
	public void run() {
		Random random = new Random();
		for(int i = 0; i<=10; i++) {
			try {
				Thread.sleep(random.nextInt(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("The Value of i: "+ i + " and the thread no is: "+threadNo);
		}
		
	}
	
}
public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new MyCounter1(1));
		Thread t2 = new Thread(new MyCounter1(2));
		
		t1.start();
		t2.start();
		
	}

}
