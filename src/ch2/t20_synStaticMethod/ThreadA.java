package ch2.t20_synStaticMethod;

public class ThreadA extends Thread {
	@Override
	public void run() {
		Service.printA();
	}

}
