package anynomousthread;

public class AnynomousEx1 {

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					System.out.println("Yugandhar");
				}
				System.out.println("Thread was completed");

			}

		}).start();

	}

}
