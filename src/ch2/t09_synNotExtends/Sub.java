package ch2.t09_synNotExtends;

public class Sub extends Main {

	@Override
	// 同步不具有继承性
	public void serviceMethod() {
		try {
			System.out.println("int sub 下一步sleep begin threadName=" + Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(2000);
			System.out.println("int sub 下一步sleep   end threadName=" + Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			super.serviceMethod();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
