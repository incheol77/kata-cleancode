package decorator_java;

public class ZipOut extends Decorator {
	public ZipOut(FileOut delegate) {
		super(delegate);
	}

	public void write() {
		System.out.print("ZipOut.");
		doDelegate();
	}
}
