package ch2.t26;

public class PrintString {

	private boolean isContinuePrint = true;

	public boolean isContinuePrint() {
		return isContinuePrint;
	}

	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}

	public void printStringMethod() {
		try {
			while (isContinuePrint == true) {
				System.out.println("run printStringMethod threadName=" + Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();
		System.out.println("我要停止它！stopThread=" + Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}
}
