package decorator_java;

public class DecoratorMain {
	public static void main(String[] args) {
		FileOut delegate = new FileOutImpl();

		FileOut fileOut = new BufferedOut(new EncryptionOut(new ZipOut(delegate)));
		fileOut.write();
	}
}
