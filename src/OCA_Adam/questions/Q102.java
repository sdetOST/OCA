package questions;

public class Q102 {

		int count;
//		static int count;								// should be static
		
		public static void displayMsg(){
		count++;		//line n1
		System.out.println("Welcome " + "Visit Count : " + count); // line n2
		}
		public static void main(String [] args){
			Q102.displayMsg ();		//line n3
			Q102.displayMsg ();		//line n4
		}
		}