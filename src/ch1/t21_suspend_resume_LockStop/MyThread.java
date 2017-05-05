package ch1.t21_suspend_resume_LockStop;

//由于println()是同步的，故suspend之后锁未释放，故main方法迟迟不能打印
public class MyThread extends Thread {
	private long i = 0;

	@Override
	public void run() {
		while (true) {
			i++;
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(100);
			thread.suspend();
			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
