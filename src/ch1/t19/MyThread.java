package ch1.t19;

//suspend-resume
public class MyThread extends Thread {

	private long i = 0;

	public long getI() {
		return i;
	}

	public void setI(long i) {
		this.i = i;
	}

	@Override
	public void run() {
		while (true) {
			i++;
		}
	}

	public static void main(String[] args) {

		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			// A
			thread.suspend();
			System.out.println("A= " + System.currentTimeMillis() + " i=" + thread.getI());
			Thread.sleep(1000);
			System.out.println("A= " + System.currentTimeMillis() + " i=" + thread.getI());
			// B
			thread.resume();
			Thread.sleep(1000);

			// C
			thread.suspend();
			System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());
			Thread.sleep(1000);
			System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
