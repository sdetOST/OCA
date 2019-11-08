package questions;

public class Q106 {
	public static void main(String[] args) {
		
//		int numbers[]; 								//If we assign the int numbers[] = new int[2]; like this it will	work
		int numbers[] = new int[2];
		
		numbers[0] = 10;							 // and the answer will be: b)0 0 30 40
		numbers[1] = 20;
		
		numbers = new int[4];
		numbers[2] = 30;
		numbers[3] = 40;
		for (int x : numbers) {
		System.out.print(" " + x);
		}
		}
}
	
/*	
		What is the result?
		a) 10 20 30 40
		b)0 0 30 40
		c)Compilations fails
		d)An exception is thrown at runtime
		ANSWER: C
	
*/