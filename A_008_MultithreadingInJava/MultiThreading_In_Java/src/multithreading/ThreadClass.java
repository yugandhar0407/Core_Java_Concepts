package multithreading;

class Employee extends Thread {

	public Employee(String name) {
		super(name);
	}

	public void run() {
		System.out
				.println("Hello Employee " + Thread.currentThread().getName() + " >> " + Thread.currentThread().getId());
	}

}

class Manager extends Thread {
	public Manager(String name) {
		super(name);
	}

	public void run() {
		System.out
				.println("Hello Employee " + Thread.currentThread().getName() + " >> " + Thread.currentThread().getId());
	}
}

public class ThreadClass {

	public static void main(String[] args) {

		Employee e1 = new Employee("Thread 1");
		e1.start();
		System.out.println(Thread.activeCount());
		Manager m1 = new Manager("Thread 2");
		m1.start();

	}

}
