package decorator_java;

public abstract class Decorator implements FileOut {
	private FileOut delegate;

	public Decorator(FileOut delegate) {
		this.delegate = delegate;
	}

	//protected void doDelegate(byte[] data) {
	protected void doDelegate() {
		delegate.write();
	}
}
