package ch2.t15;

public class Task {

	// 是否添加 synchronized 将决定是同步还是异步调用此方法
	public void otherMethod() {
		System.out.println("------------------------------------run--otherMethod");
	}

	public void doLongTimeTask() {
		synchronized (this) {
			for (int i = 0; i < 1000; i++) {
				System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
			}
		}

	}
}
