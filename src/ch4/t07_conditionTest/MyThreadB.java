package ch4.t07_conditionTest;

public class MyThreadB extends Thread {

	private MyService myService;

	public MyThreadB(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			myService.get();
		}
	}

}
