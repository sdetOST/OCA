package ErdemDenizli;

import java.sql.Array;

//public class AhmetDokur_june09 {

// Oca Questions that I remember

// 1st question-----------------------------------------------------

//	public static void main(String[] args) {
//
//		StringBuilder sb = new StringBuilder(5);
//		String s = "";
//		if (sb.equals(s)) {
//			System.out.println("Match 1");
//		} else if (sb.toString().equals(s.toString())) {
//			System.out.println("Match 2");
//		} else {
//			System.out.println("No Match");
//		}
//	}

// 	what is the output?
//	Match 2

// 2nd question-----------------------------------------------------
//	Which option enables the code to compile?
//	
//	interface Readable {
//		public void readBook();									// no need to implement this on concrete class  
//																	// since it is implemented on abstract class extents by EBook
//		public void setBookMark();								// EBook should implement that one
//	}
//
//	abstract class Book implements Readable {
//		public void readBook() {
//		} 											// line n2
//
//	class EBook extends Book {
//			public void readBook() { 			// line n4
//
//			}
//
////			@Override												//answer
////			public void setBookMark() {
////					
////			}
//		}
//	}
// 	3rd question-----------------------------------------------------	
//	
//	public static void main(String[] args) {
//
//		String ta = "A ";						System.out.println(ta);
//		ta = ta.concat("B ");					System.out.println(ta);
//		String tb = "C ";						System.out.println(ta);
//		ta = ta.concat(tb);					System.out.println(ta);
///*!*/	ta.replace('C', 'D');					System.out.println(ta);			//!!!!!!!   NO ASSIGNMENT
//		ta = ta.concat(tb);					System.out.println(ta);
//		System.out.println(ta);				
//	}
//	What is the result?
//	A B C C 	
//		
// 	4th question-----------------------------------------------------	
//		
//	public static void main(String[] args) {
//		int a[] = {1, 2, 3, 4, 5}; 
//		
//		for // (XXX) {
//			System.out.print(a[e]); }
//			
//		
//		//Which option can replace XXX to enable the code to print 135?
//	
//	
//	5th question-----------------------------------------------------		
//		
//	public static void main(String[] args) {	
//
//	Given the code fragment:
//		
//		String shirts[][] = new String[2][2]; 	
//		shirts[0][0] = "red";
//		shirts[0][1] = "blue";
//		shirts[1][0] = "small";
//		shirts[1][1] = "medium";
//	}	
//	
//	Which code fragment prints red: blue: small: medium?
//		
//	6th question----C extends B, B extends A-----------------------------------------------				
//		
//	 7th question	------------------------------------------------------------------------------
//
//		public static void main(String[] args) {	
//		
//		/* insert code here */  int [] array = new int [2];   // answer
//		array[0] = 10;
//		array[1] = 20;
//		System.out.println(array[0]+ ":" + array[1]);
//		}
//		
//Which code fragment, when inserted at line 3, enables the code to print 10:20?
//		
//		
//	 8th question	------------------------------------------------------------------------------	
//
//		public static void main(String[] args) {	
//	
//		String[] arr = {"A", "B","C","D"};
//		for (int i = 0; i < arr.length; i++){
//			System.out.print(arr[i] + " "); 
//			if (arr[i].equals("C")) {
//				continue; 
//			}
//		}
//		System.out.println("Work done"); 
//	}
//		 
//	What is the result?
//   A B C D Work done
//
//	 9th question	------------------------------------------------------------------------------		
//
//		public static void main(String[] args) {
//
//		int ii = 0;
//		int jj = 7;
//		for (ii = 0; ii < jj - 1; ii = ii + 2) {
//			System.out.print(ii + " ");
//		}
//	}
//		 
//		 
//       what is the result   
//		0 2 4  
//
//	 10th question	------------------------------------------------------------------------------		
//
//		public static void main(String[] args) {
//
//		StringBuilder sb1 = new StringBuilder("Duke");
//		String str1 = sb1.toString();
//		/* insert code here */
//		String str2 = str1; 								// true
////		String str2 = str1.substring(0);				// true
////		String str2 = "Duke";							// false
////		String str2 = new String("Duke");			// false
//
//		System.out.print(str1 == str2);
//	}
//		
//	Which code fragment, when inserted at line 9, enables the code to print true?
//		
//		
//		
//		
//	 11th question	------------------------------------------------------------------------------		
//
//		public static void main(String[] args) {
//
//		if (args[0].equals("Hello") ? false : true) {
//			System.out.print("Success");
//		} else {
//			System.out.print("Failure");
//		}
//	}

//		
//		// what is the output?
//		
//		
//		
//		
//	 12th question	------------------------------------------------------------------------------		
//
//		public static void main(String[] args) {
//		
//			String [] planets = {"Mercury", "Venus", "Earth", "Mars"};
//			System.out.println(planets.length); 
//			System.out.println(planets[1].length());
//			System.out.println(planets[2]);
//		}

//			What is the output?
//			4
//			5
//			Earth
//		
//		 
//	 13th question	------------------------------------------------------------------------------		
//
//		
//			
//	// package p1; 
//			 class Acc{
//				int p;
//				private int q; 
//				protected int r; 
//				public int s;
//				} 
//			
//	// Test.java:
//	// package p1; 
//	// import p1.Acc;
//	
//			public class Test extends Acc{
//				
//				public static void main (String [] args){ 
//					Acc obj = new Test();
//				} 
//				
//				//Which statement is true?
//		        // answer > only s is accessible by obj.
//		
//		
//		
//		
//			// 16th question
//			// >> which two options below print the array in reverse order?
//				
//				
//				
//				
//			// 17th question
//				public class Emloyee {
//					public int salary; 
//				}
//				public class Manager extends Employee {
//					public int budget; 
//				}
//				public class Director extends Manager {
//					public int stockOptions; 
//				}
//					//And given the following main method:
//					public static void main(String[] args) {
//						Employee employee = new Employee(); 
//						Employee manager = new Manager(); 
//						Employee director = new Director();
//					//line n1
//			}
//					//Which two options fail to compile when placed at line n1 of the main method?
//				
//				
//		
//		
//	}

}
