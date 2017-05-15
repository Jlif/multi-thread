package ch4.t03_useConditionWaitNotifyError;

public class ThreadA extends Thread {

	private MyService service;

	public ThreadA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.await();
	}

	public static void main(String[] args) {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.start();

	}
}
