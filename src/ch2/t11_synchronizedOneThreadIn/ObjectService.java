package ch2.t11_synchronizedOneThreadIn;

public class ObjectService {
	public void serviceMethod() {
		try {
			synchronized (this) {
				System.out.println(Thread.currentThread().getName() + " begin time=" + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + " end   time=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
