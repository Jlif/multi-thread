package ch1.t23_yield;

public class MyThread extends Thread {
	public void run() {
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for (int i = 0; i < 50000000; i++) {
//			Thread.yield();
			count = count + (i + 1);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("用时：" + (endTime - beginTime) + " 毫秒！");
	}

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}
