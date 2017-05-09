package ch2.t20_synStaticMethod;

public class ThreadB extends Thread {
	@Override
	public void run() {
		Service.printB();
	}
}
