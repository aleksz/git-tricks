package ee.ignite;

public class MySuperClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("non conflicting");
	}
	
	private void nonConflicting() {
		System.out.println("conflict");
	}
}
