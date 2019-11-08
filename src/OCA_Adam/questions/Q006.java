package questions;

public class Q006 {

	public static void main(String[] args) {

	}
}

abstract class Planet {
	protected void resolve() { 		// Line n1
	}
	abstract void rotate(); 			// Line n2
}

class Earth extends Planet { 			// Line n3
	 void resolve() {
	}
	 protected void rotate() { 							// Line n4
	}
}
/*
 Which two modification, made independently,
enable the code to compile?
	 	 	 A. Make the method at line n1 public
	 	 	 B. Make the method at line n2 public
	 	 	 C. Make the method at line n3 public	 	 

	 	 	 D. Make the method at line n3 protected	 	 

	 	 	 E. Make the method at line n4 public
ANSWER: C, D
 */
