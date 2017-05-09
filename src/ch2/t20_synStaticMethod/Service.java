package ch2.t20_synStaticMethod;

public class Service {

	// synchronized方法加到静态方法上是对类加锁
	synchronized public static void printA() {
		try {
			System.out.println(
					"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printA");
			Thread.sleep(3000);
			System.out.println(
					"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printA");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public static void printB() {
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printB");
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printB");
	}

}
