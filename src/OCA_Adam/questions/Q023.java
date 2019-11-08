package questions;

public class Q023 {

	public static void main(String[] args) {
		 int x = 100;
		 int a = x++;   // 100
		 int b = ++x; //  102
		 int c = x++; // 102
//		 int d = (a < b) ? (a < c) ? a : (b < c) ? b : c;
		 int d = (a < b) ? (a < c) ? a : (b < c) ? b : c :9999999 ;
		 System.out.println(d);
	}

}
//   		 int d = (a < b) ?  {     (a < c) ?    a : (b < c) ?   b : c     }          :                      9999999    ; 
//												----------------------------								
//											     (a < c) ?          a									 : 					(b < c) ?   b   :   c            ; 
//----------------------------								