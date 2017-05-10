package ch3.t04_p_c_allWait_fix;

//消费者
public class C {

	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}

	public void getValue() {
		try {
			synchronized (lock) {
				while (ValueObject.value.equals("")) {
					System.out.println("消费者 " + Thread.currentThread().getName() + " WAITING了☆");
					lock.wait();
				}
				System.out.println("消费者 " + Thread.currentThread().getName() + " RUNNABLE了");
				ValueObject.value = "";
				lock.notifyAll();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}