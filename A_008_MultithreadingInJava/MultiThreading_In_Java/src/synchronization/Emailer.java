package synchronization;

public class Emailer extends Thread {
	
	public void run() {
		System.out.println("Email Sent");
	}

	public static void main(String[] args) {
		
		System.out.println("Start");
		Emailer email = new Emailer();
		email.start();
		System.out.println("End");
	}

}
