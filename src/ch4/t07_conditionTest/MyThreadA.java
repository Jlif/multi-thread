package ch4.t07_conditionTest;

public class MyThreadA extends Thread {

	private MyService myService;

	public MyThreadA(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			myService.set();
		}
	}

}
