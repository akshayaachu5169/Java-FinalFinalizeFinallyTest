package finallyTest;

public class FinallyTest2 {
public static void main(String[] args) {
	System.out.println("login DB");
	System.out.println("program initiated");
	try {
		int i = 1 / 0;
		System.out.println(i);
	} catch(ArithmeticException e){
		System.out.println("Alert:entered invalid number- " + e.getMessage());
	}
		finally {
	
		System.out.println("program stopped");
		System.out.println("logout DB");

	}
}
}
