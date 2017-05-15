package ch4.t08_conditionTestManyToMany;

import ch2.t21_stringAndSyn.Service;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();

		MyThreadA[] a = new MyThreadA[10];
		MyThreadB[] b = new MyThreadB[10];

		for (int i = 0; i < 10; i++) {
			a[i] = new MyThreadA(service);
			b[i] = new MyThreadB(service);
			a[i].start();
			b[i].start();
		}
	}
}
