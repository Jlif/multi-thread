package ch1.t18;

public class MyThread extends Thread {

	public void run() {
		while (true) {
			if (this.isInterrupted()) {
				System.out.println("停止了！");
				return;
			}
			System.out.println("Timer = " + System.currentTimeMillis());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		Thread.sleep(500);
		t.interrupt();
	}
}
