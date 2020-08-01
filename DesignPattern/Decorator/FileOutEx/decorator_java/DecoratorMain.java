package decorator_java;

public class DecoratorMain {
	public static void main(String[] args) {
		FileOut delegate = new FileOutImpl();

		FileOut bufferedOut = new BufferedOut(delegate);
		bufferedOut.write();

		FileOut encOut = new EncryptionOut(delegate);
		encOut.write();

		FileOut zipOut = new ZipOut(delegate);
		zipOut.write();
	}
}
