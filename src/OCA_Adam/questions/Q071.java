package questions;

public class Q071 {
	public static void main(String[] args) {
	 	 Boolean[] bool = new Boolean[2];
	 	 bool[0] = new Boolean(Boolean.parseBoolean("true"));
	 	 bool[1] = new Boolean(null);
	 	 System.out.println(bool[0] + " " + bool[1]);
	}

}
/*	
What is the result?
A. True False
B. True null
C. Compilation fails
D. A nullPointerException is throw at runtime
ANSWER: A
*/
