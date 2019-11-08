package questions;

public class Q075 {

	public static void main(String[] args) {
		int nums1[] = new int [3];
		int nums2[] = {1, 2, 3, 4, 5};
//		nums1 = nums2;
		
		nums2 = nums1;               //   second option  the answer will be 0;0;0
		
		for(int x : nums2){
			 	 System.out.print(x + ":");
				}
		}
}

	
/*
		What is the result?
		A. 1:2:3:4:5:
		B. 1:2:3:
		C. Compilation fails.
		D. An ArrayOutOfBoundsException is thrown at runtime
		ANSWER: A
*/
