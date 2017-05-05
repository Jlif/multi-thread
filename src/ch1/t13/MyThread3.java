package ch1.t13;

public class MyThread3 extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 500; i++) {
				if (this.interrupted()) {
					System.out.println("已经是停止状态了!我要退出了!");
					throw new InterruptedException();
				}
				System.out.println("i=" + (i + 1));
			}
			System.out.println("我在for下面");
		} catch (InterruptedException e) {
			System.out.println("进MyThread.java类run方法中的catch了！");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			MyThread3 thread = new MyThread3();
			thread.start();
			Thread.sleep(5);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
