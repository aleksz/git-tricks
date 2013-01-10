package ee.ignite;

public class MySuperClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("non conflicting");
		System.out.println("!!!!!!!!!!");
		System.out.println("??????????");
	}

	private void nonConflicting() {
		System.out.println("merged conflict");
		System.out.println("change based on remote commit");
		//
		//
		//
	}
}
