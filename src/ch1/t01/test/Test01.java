package ch1.t01.test;

import ch1.t01.mythread.MyThread01;

public class Test01 {
	public static void main(String[] args) {
		MyThread01 myThread = new MyThread01();
		myThread.start();
		System.out.println("运行结束！ ");
	}
}
