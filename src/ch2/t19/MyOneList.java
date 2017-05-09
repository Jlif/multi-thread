package ch2.t19;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {

	private List list = new ArrayList();

	synchronized public void add(String data) {
		list.add(data);
	}

	synchronized public int getSize() {
		return list.size();
	}

}
