package ch1.t10;

public class MyThread2 extends Thread {
	public void run() {
		try {
			System.out.println("run threadName " + Thread.currentThread().getName() + " begin");
			Thread.sleep(2000);
			System.out.println("run threadName " + Thread.currentThread().getName() + " end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyThread2 myThread = new MyThread2();
		System.out.println("begin = " + System.currentTimeMillis());
		myThread.start();
		System.out.println("end = " + System.currentTimeMillis());
	}
}
