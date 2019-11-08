package ErdemDenizli;

import java.util.ArrayList;

public class Chap02_june06 {
	
//	01_switch		----------------------------------------------
	
//	public static void main(String[] args) {
//
//		boolean key = true;				//	 String key = "true";
//
//		switch (key) {
//		case true:							//	 case "true":
//			System.out.println("True");
//			break;
//		default:
//			System.out.println("False");
//
//		}
//
//		System.out.println("Done");
//
//	}
	
/*
	what should
	be done
	to make this
	code compile?
*/
//	02_PostIncrement1	*************************************************
	
//	public static void main(String[] args) {
//
//		int variable = 9;
//
//		if (variable++ < 10) {									//variable = 9 because it is post incremented, it will update itself when it reaches another variable
//			System.out.println(variable + " hello!");			//variable is now 10
//		} else {
//			System.out.println(variable + " goodbye!");
//		}
//
//	}	
	

//	03_PostIncrement2	*************************************************


//	public static void main(String[] args) {
//
//		int num1 = 1;
//		int num2 = 0;
//
//		if (num1++ > ++num2) {								// 1>1
//			System.out.println("hello ");
//		} else {
//			System.out.println("welcome ");
//		}
//
//		System.out.println(num1 + ", " + num2);					// 2, 1
//
//	}

//		welcome  
//		2,1

//	04_ContinueKeyword	*************************************************


//	public static void main(String[] args) {
//
//		int array2[] = { 1, 2, 3, 4, 5 };
//
//		int var = 4;
//
//		int count = 0;
//
//		for (int i : array2) {									// 1, 2, 3, 4, 5
//			if (i != var)  {										// 1 != 4, 2 != 4, 3 != 4, 4 = 4, 5 != 4
//				continue;
//				count++;										// not reachad at any step
//			}
//		}
//
//		System.out.println(count + "exists");
//
//	}
	// in an if statement, if you have any statements after continue, those are
	// unreachable
	// however, it would work fine if we didn't have the curly braces, since count
	// would be
	// out of if statement


//	05_StringEquality    *************************************************


//	public static void main(String[] args) {
//
//		String a = "String";														// this is in SCP
//
//		String[] array = { "S", "t", "r", "i", "n", "g" };
//
//		String str2 = "";
//
//		for (String str1 : array) {
//			str2 = str2 + str1;
//		}
//		// str2 = "String";//this is in heap memory
//
//		boolean result1 = (a == str2);											// there is no object equality
//		boolean result2 = (a.equals(str2));
//
//		System.out.println(result1 + " " + result2);
//
//	}



//	06_OperatorPrecedence		 *************************************************


//	public static void main(String[] args) {
//
//		System.out.println("Output is " + 0 + 1);						// Output is 01
//		System.out.println("Output is " + (0 + 1));						// 1
//		System.out.println("Output is " + (0) + (1));					// 01
//		// operator precedence
//		// parentheses come before the plus sign
//
//	}



//	07_Switch2	*************************************************


//	public static void main(String[] args) {
//
// 		insert code here
//		Byte a = 1;
//		short a = 1;
//		int a = 1;
//		Integer a = new Integer (1);
//		Integer a =1;
//		char a ='1';


//		switch (a) {
//
//		case 1:
//			System.out.println("Hello");
//			break;
//		case 2:
//			System.out.println("World");
//			break;
//		case '1':
//			System.out.println("Hello World");
//			break;
//		}
//	}
	
// 08_String ---------------------------------------------------------
	
//	public static void main(String[] args) {
//		ArrayList<Integer> points = new ArrayList<>();
//		  
//		points.add(1); 
//		points.add(2); 
//		points.add(null); 
//		points.add(3);
//		points.add(4); 
//		points.add(null); 						System.out.println(points);
//		points.remove(1); 					System.out.println(points);
//		points.remove(null); 					System.out.println(points);
//		points.set(1, 11);						System.out.println(points);
//		points.add(2, 22);						System.out.println(points);
//		points.remove(null); 					System.out.println(points);
//		points.removeIf(e->e%2==0);		System.out.println(points);
//	}

// 09_while---------------------------------------------------------
	
//	public static void main(String[] args) {
//		int x = 10;
//		while(x>0) {
//		
//			do {
//				x -=2;
//			
//			}while(x>0);			
//				x--;
//				
//				System.out.println(x);;
//			
//		}
//	}
	
	
}




