package decorator_java;

public class EncryptionOut extends Decorator {
	public EncryptionOut(FileOut delegate) {
		super(delegate);
	}

	public void write() {
		System.out.print("EncryptionOut.");
		doDelegate();
	}
}
