package ch4.t09_fair_noFair_test;

public class RunFair {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service(true);

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("★线程" + Thread.currentThread().getName() + "运行了");
				service.serviceMethod();
			}
		};

		Thread[] threadArray = new Thread[20];
		for (int i = 0; i < 20; i++) {
			threadArray[i] = new Thread(runnable);
		}
		for (int i = 0; i < 20; i++) {
			threadArray[i].start();
		}

	}
}
