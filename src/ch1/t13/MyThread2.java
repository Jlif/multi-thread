package ch1.t13;

public class MyThread2 extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 10000; i++) {
			if (this.interrupted()) {
				System.out.println("已经是停止状态了!我要退出了!");
				break;
			}
			System.out.println("i=" + (i + 1));
		}
		System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");
	}

	public static void main(String[] args) {
		try {
			MyThread2 thread = new MyThread2();
			thread.start();
			Thread.sleep(50);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
