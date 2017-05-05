package ch1.t10;

public class MyThread extends Thread {
	public void run() {
		try {
			System.out.println("run threadName " + this.currentThread().getName() + " begin");
			Thread.sleep(2000);
			System.out.println("run threadName " + this.currentThread().getName() + " end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		System.out.println("begin = " + System.currentTimeMillis());
		myThread.run();
		System.out.println("end = " + System.currentTimeMillis());
	}
}
