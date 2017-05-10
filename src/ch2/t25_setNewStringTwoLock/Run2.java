package ch2.t25_setNewStringTwoLock;

public class Run2 {

	public static void main(String[] args) throws InterruptedException {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.setName("A");

		ThreadB b = new ThreadB(service);
		b.setName("B");

		a.start();
		// 去掉睡眠五十毫秒
		b.start();
	}
}
