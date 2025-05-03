package multithreading;

class MyCounter extends Thread{
	private int threadNo;

	public MyCounter(int threadNo) {
		super();
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		Countme();
	}

	private void Countme() {
		
		for(int i = 1; i <= 9; i++) {
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("The Value of i is: "+ i + " and the Thread No: "+threadNo);
		}
		
	}
}

public class App {

	public static void main(String[] args) throws InterruptedException {
		
		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		
		
		long startTime = System.currentTimeMillis();
		counter1.start();
		System.out.println();
		counter2.start();
		Thread.sleep(5000);
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time: "+(endTime - startTime));

	}

}
