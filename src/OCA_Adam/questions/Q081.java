package questions;

public class Q081 {

	public static void main(String[] args) {
//		int num = 10;
//		int div = 0;
//		int ans =1 ;							
		try {
//			ans = num / div;
//			ans = 2;
				int num = 10;
				int div = 0;
				int ans = num / div;
	 	 }catch (ArithmeticException ae) {
	 		 	ans = 3 ;																// line n1
	 	 }catch (Exception e) {
	 	 	 System.out.println("Invalid calculation");
	 	 }
	 	 System.out.println("Answer = " + ans); 				//line n2
	 }
}

/*
 * What is the result? 
 * A. Answer = 0 
 * B. Invalid calculation 
 * C. Compilation fails only at line n1. 
 * D. Compilation fails only at line n2.
 * E. Compilation fails only at line n1 and line2. 
 *  
 *  ANSWER: E
 * 
 */
