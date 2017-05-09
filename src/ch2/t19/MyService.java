package ch2.t19;

public class MyService {

	public MyOneList addServiceMethod(MyOneList list, String data) {
		try {
			synchronized (list) {// 注释此条后则不能同步
				if (list.getSize() < 1) {
					Thread.sleep(2000);
					list.add(data);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return list;
	}

}
