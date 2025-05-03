package synchronization;

class Brackets {
	synchronized public void generate() {
		for (int i = 0; i <= 10; i++) {
			if (i <= 5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println();
	}
}

public class App1 {

	public static void main(String[] args) {

		Brackets br = new Brackets();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 2; i++) {
					br.generate();
				}

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 2; i++) {
					br.generate();
				}

			}
		}).start();


	}

}
