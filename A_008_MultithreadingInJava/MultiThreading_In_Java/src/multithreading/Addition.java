package multithreading;

class Addition1 extends Thread{
	private int number;

	public Addition1(int number) {
		super();
		this.number = number;
	}
	
	public void run() {
		addMe();
	}

	private void addMe() {
		
		for(int i = 0;i <= 5; i++) {
			try {
				sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The Value is: "+ i + " and the Number is: "+number);
		}
		
	}
}
public class Addition {

	public static void main(String[] args) throws InterruptedException {
		
		Addition1 add = new Addition1(3 + 3);
		Addition1 add1 = new Addition1(2 * 2);
		
		long startTime = System.currentTimeMillis();
		add.start();
		
		System.out.println();
		add1.start();
		Thread.sleep(4500);
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total Time: "+ (endTime - startTime));

	}

}
