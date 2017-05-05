package ch2.t02;

//类的实例变量，也即属性并不是私有的，所以容易出现线程安全问题，可以在
//方法前面加上 synchronized 关键字
public class HasSelfPrivateNum {

	private int num = 0;

	synchronized public void addI(String username) {
		try {
			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over!");
				Thread.sleep(1000);
			} else {
				num = 200;
				System.out.println("b set over!");
			}
			System.out.println(username + " num=" + num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
