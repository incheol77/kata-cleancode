package decorator_not_java;

public class DecoratorNotMain {
	public static void main(String[] args) {
		FileOut out1 = new BufferedOut();
		out1.write();

		FileOut out2 = new ZipOut();
		out2.write();

		FileOut out3 = new EncryptionOut();
		out3.write();
	}
}
