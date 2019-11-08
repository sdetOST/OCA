package questions;

public class Q079 {

	public static void main(String[] args) {
		int n[][] = { { 1, 3 }, { 2, 4 } };
		
		for (int i = n.length -1; i >= 0; i--) {
			for (int y : n[i]) {
				System.out.print(y);
			}
		}
	}
}

/*
 * What is the result? 
 * A. 1324 
 * B. 2413 					//modified by us 
 * C. 3142 
 * C. 4231
 * 
 */
