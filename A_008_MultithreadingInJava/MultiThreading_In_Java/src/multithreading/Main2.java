package multithreading;

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable r1 = () -> {
			for(int i=0; i<5; i++) {
				//System.out.println("Hello");
			}
		};
		
//		Runnable r2 = () -> {
//			for(int i=0; i<5; i++) {
//				System.out.println("Hi");
//			}
//		};
		
		Thread t1 = new Thread(r1, "T1");
		//Thread t2 = new Thread(r2, "T2");
		
		
		System.out.println(t1.getState());
		
		t1.start();
		
		System.out.println(t1.getState());
		
		t1.sleep(1000);
		 
		System.out.println(t1.getState());
		
		
	
	}

}
