package ch2.t13;

public class Task {
	public void doLongTimeTask() {
		for (int i = 0; i < 100; i++) {
			System.out.println("nosync threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
		}
		System.out.println("");
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				System.out.println("sync threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
			}
		}
	}
}
