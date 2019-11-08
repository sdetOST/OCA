package questions;

public class Q114 {
	public static void main(String[] args) {
		int data[] = { 2010, 2013, 2014, 2015, 2014 };
		int key = 2014;
		int count = 0;
		for (int e : data) {
			if (e != key) {
//				continue;
				count++; 					// originally  unreachable code
//				continue;					// option 1        result : 3Found
//				break;						// option 2        result : 1Found
			}
		}
		System.out.print(count + "Found");
	}
}

/*
 * What is the result? 
 * A.Compilation fails. 
 * B.0 Found 
 * C.1 Found 
 * D.3 Found
 * 
 * Answer is A
 * 
 */
