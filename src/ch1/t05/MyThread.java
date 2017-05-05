package ch1.t05;

public class MyThread extends Thread {

	private int i = 20;

	@Override
	//println() 方法虽然同步，但是 i-- 的操作发生在进入println() 之前
	synchronized public void run() {
		System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		MyThread run = new MyThread();

		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);
		Thread t4 = new Thread(run);
		Thread t5 = new Thread(run);
		Thread t6 = new Thread(run);
		Thread t7 = new Thread(run);
		Thread t8 = new Thread(run);
		Thread t9 = new Thread(run);
		Thread t10 = new Thread(run);
		Thread t11 = new Thread(run);
		Thread t12 = new Thread(run);
		Thread t13 = new Thread(run);
		Thread t14 = new Thread(run);
		Thread t15 = new Thread(run);
		Thread t16 = new Thread(run);
		Thread t17 = new Thread(run);
		Thread t18 = new Thread(run);
		Thread t19 = new Thread(run);
		Thread t20 = new Thread(run);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		t16.start();
		t17.start();
		t18.start();
		t19.start();
		t20.start();
	}

}
