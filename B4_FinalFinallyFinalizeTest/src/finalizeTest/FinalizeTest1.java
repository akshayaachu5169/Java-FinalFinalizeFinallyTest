package finalizeTest;

public class FinalizeTest1 {
//@Override
//protected void finalize() throws Throwable {
//	// TODO Auto-generated method stub
//	super.finalize();
//	System.out.println("garbage collected");
//}
	public void finalize() {
		System.out.println("garbage collecter called me to delete");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FinalizeTest1 a = new FinalizeTest1();
		 FinalizeTest1 b = new FinalizeTest1();
		 FinalizeTest1 c = new FinalizeTest1();
		 
		 a=null;
		 b=null;
		 c=null;
//		 System.out.println(a);
//		 System.out.println(b);
//		 System.out.println(c);
		 System.gc();//garbage collector
		 System.out.println("program completed");
		 
	}

}
