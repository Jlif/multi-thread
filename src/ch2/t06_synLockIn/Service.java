package ch2.t06_synLockIn;

//可重入锁，当一个线程获取了锁，它就能访问实例里的所有对象与方法
//即使它们都是加锁的
public class Service {
	synchronized public void service1() {
		System.out.println("service1");
		service2();
	}

	synchronized public void service2() {
		System.out.println("service2");
		service3();
	}

	synchronized public void service3() {
		System.out.println("service3");
	}
}
