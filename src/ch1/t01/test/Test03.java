package ch1.t01.test;

import ch1.t01.mythread.MyThread03;

//线程启动顺序与start()顺序无关
public class Test03 {
	public static void main(String[] args) {
		MyThread03 mt1 = new MyThread03(1);
		MyThread03 mt2 = new MyThread03(2);
		MyThread03 mt3 = new MyThread03(3);
		MyThread03 mt4 = new MyThread03(4);
		MyThread03 mt5 = new MyThread03(5);
		MyThread03 mt6 = new MyThread03(6);
		MyThread03 mt7 = new MyThread03(7);
		MyThread03 mt8 = new MyThread03(8);
		MyThread03 mt9 = new MyThread03(9);
		MyThread03 mt10 = new MyThread03(10);
		MyThread03 mt11 = new MyThread03(11);
		MyThread03 mt12 = new MyThread03(12);
		MyThread03 mt13 = new MyThread03(13);
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
		mt5.start();
		mt6.start();
		mt7.start();
		mt8.start();
		mt9.start();
		mt10.start();
		mt11.start();
		mt12.start();
		mt13.start();
	}
}
