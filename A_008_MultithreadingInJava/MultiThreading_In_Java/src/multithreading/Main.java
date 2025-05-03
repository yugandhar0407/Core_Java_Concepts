package multithreading;

class Mythread extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);

			try {
				sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class Main {

	public static void main(String[] args) {

		Mythread thread = new Mythread();
		Mythread thread2 = new Mythread();
		Mythread thread3 = new Mythread();

		thread.start();
		thread2.start();
		thread3.start();

	}

}
