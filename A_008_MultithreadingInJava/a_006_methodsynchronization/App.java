package methodsynchronization;

class Brackets {
	synchronized public  void generate() {
		for (int i = 1; i <= 10; i++) {
			if (i <= 5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println();
	}
}

public class App {

	public static void main(String[] args) {
		Brackets bracket = new Brackets();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 5; i++) {
					bracket.generate();
				}

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 5; i++) {
					bracket.generate();
				}

			}
		}).start();

	}

}
