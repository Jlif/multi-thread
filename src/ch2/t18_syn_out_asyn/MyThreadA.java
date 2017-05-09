package ch2.t18_syn_out_asyn;

public class MyThreadA extends Thread {

	private MyList list;

	public MyThreadA(MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			list.add("threadA" + (i + 1));
		}
	}

}
