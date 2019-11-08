package questions;
//??????????????????????????
public class Q052 {

	public static void main(String[] args) {
		 String [] strs = new String [2];
		 
//		 strs[0]="A";
//		 strs[1]="B";
		 
		 int idx = 0;
		 for(String s : strs){
			 	strs[idx].concat(" element " + idx);     
			 	idx++;
		 }
		 for(idx = 0; idx < strs.length; idx++){
			 	System.out.println(strs[idx]);
		 }
	}
}

/*
		 What is the result?
		 A) 	Element 0
		 		Element 1
		 B) 	null element 0
		 		Null element 1
		 C) 	Null
		 		Null
		 D) 	A NullPointerException is thrown at runtime.
		 
		 ANSWER D

		*got same
*/
