package ch1.t08;

public class MyThread extends Thread {
	public void run() {
		System.out.println("run = " + this.isAlive());
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread mythread = new MyThread();
		System.out.println("begin == " + mythread.isAlive());
		mythread.start();
//		Thread.sleep(1);
		System.out.println("end == " + mythread.isAlive());
	}
}
