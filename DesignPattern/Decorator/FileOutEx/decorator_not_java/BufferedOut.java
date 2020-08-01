package decorator_not_java;

import decorator_not_java.FileOut;

public class BufferedOut extends FileOut {
	public void write() {
		System.out.println("BufferedOut.write()");
	}
}
