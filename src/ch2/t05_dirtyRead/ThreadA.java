package ch2.t05_dirtyRead;

public class ThreadA extends Thread {

	private PublicVar publicVar;

	public ThreadA(PublicVar publicVar) {
		super();
		this.publicVar = publicVar;
	}

	@Override
	public void run() {
		super.run();
		publicVar.setValue("B", "BB");
	}

	public static void main(String[] args) {
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA thread = new ThreadA(publicVarRef);
			thread.start();

			Thread.sleep(300);// 打印结果受此值大小影响

			publicVarRef.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
