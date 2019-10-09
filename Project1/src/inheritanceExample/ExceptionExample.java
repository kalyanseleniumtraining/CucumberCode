package inheritanceExample;

public class ExceptionExample {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} finally {
			System.out.println
			("This is the last line of the prog");
		}
	}

}
