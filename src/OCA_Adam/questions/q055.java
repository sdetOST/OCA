package questions;
public class q055 {
// int char
	public static void main(String[] args) {		// 3
			int ivar=100;											// 4
			float fvar=100.100f;								//5
			double dvar=123;									//6
			ivar=fvar	;												//7
			fvar=ivar	;												//8
			dvar=fvar;												//9
			fvar=dvar;												//10
			dvar=ivar;												//11
			ivar=dvar;									
	}

}
	
	/*
	 
	  which three lines fail to compile?
			a line7
			b line8
			c line9
			d line10
			e line11
			f line12

			 ANSWER: A, D, F
			.................................
			
			*/
