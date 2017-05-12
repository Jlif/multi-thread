package ch3.t06_pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {
	public void readMethod(PipedReader in) {
		try {
			System.out.println("read:");
			char[] byteArray = new char[20];
			int readLength = in.read(byteArray);
			while (readLength != -1) {
				String newData = new String(byteArray, 0, readLength);
				System.out.print(newData);
				readLength = in.read(byteArray);
			}
			System.out.println();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
