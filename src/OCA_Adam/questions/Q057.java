package questions;

public class Q057 {

	public static void main(String[] args) {
		int num [][] = new int [1][3];
		 for( int i = 0; i < num.length; i++){
		 for(int j = 0; j < num[i].length; j++){
		 num[i][j] = 10;
		 }
		 }
	}
}
		 
/*
		 which option represents the state of the num array
		 after succesfully completion of the outer loop?

		 a) 	num[0][0]=10
		 		num[0][1]=10
		 		num[0][2]=10
		 b)	num[0][0]=10
		 		num[1][0]=10
		 		num[2][0]=10

		 c)	num[0][0]=10
		 		num[0][1]=0
		 		num[0][2]=0
		 d)	num[0][0]=10
		 		num[0][1]=10
		 		num[0][2]=10
		 		num[0][3]=10
		 		num[1][0]=0
		 		num[1][1]=0
		 		num[1][2]=0
		 		num[1][3]=0
		
		 A)	OPTION A
		B)		OPTION B
		C)		OPTION C
		D)	OPTION D
		
		ANSWER: A
		*got same 
*/
