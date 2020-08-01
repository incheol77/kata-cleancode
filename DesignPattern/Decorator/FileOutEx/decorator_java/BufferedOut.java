package decorator_java;

public class BufferedOut extends Decorator {
	public BufferedOut(FileOut delegate) {
		super(delegate);
	}

	public void write() {
		System.out.print("bufferedOut.");
		doDelegate();
	}
}
