package ch2.t18_syn_out_asyn;

public class Run {

	public static void main(String[] args) {
		MyList mylist = new MyList();

		MyThreadA a = new MyThreadA(mylist);
		a.setName("A");
		a.start();

		MyThreadB b = new MyThreadB(mylist);
		b.setName("B");
		b.start();
	}

}
