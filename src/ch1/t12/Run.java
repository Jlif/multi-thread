package ch1.t12;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(5);
			thread.interrupt();
			// Thread.currentThread().interrupt();
			System.out.println("是否停止1？=" + Thread.interrupted());
			System.out.println("是否停止2？=" + Thread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
