package finallyTest;

public class FinallyTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("login DB");
		System.out.println("program initiated");
		try {
			int i = 1 / 0;
			System.out.println(i);
		} finally {
			System.out.println("program stopped");
			System.out.println("logout DB");

		}
	}
}
