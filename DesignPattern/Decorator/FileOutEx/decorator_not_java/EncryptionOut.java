package decorator_not_java;

public class EncryptionOut extends FileOut {
	@Override
	public void write() {
		System.out.println("EncryptionOut.write()");
	}
}
