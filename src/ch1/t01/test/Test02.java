package ch1.t01.test;

import ch1.t01.mythread.MyThread02;

public class Test02 {
	public static void main(String[] args) {
		try {
			MyThread02 myThread = new MyThread02();
			myThread.setName("MyThread02");
			// 若此处改为 thread.run() 则为同步执行
			myThread.start();
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
