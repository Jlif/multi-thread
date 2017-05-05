package ch1.t06;

public class MyThread extends Thread {
	public MyThread() {
		System.out.println("构造方法的打印：" + Thread.currentThread().getName());
	}

	public void run() {
		System.out.println("run方法的打印：" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
//		myThread.run();
	}
}
