package q083;

class Test {
	int x = 10;
	static int y = 20;
	public static void main(String[] args) {
		Test t1 = new Test();
//		Test t2 = new Test();								//opt 1   --->   Ansver  : 100..400..300..400
		Test t2 = t1;											//opt 2   --->   Ansver  : 300..400..300..400
		
		t1.x = 100;												//		opt1		__________________		static	y=200/->400
		t1.y = 200;												//	       t1			|	x=100/->300	|
		t2.x = 300;												//						|_________________|
		t2.y = 400;												//        t2
		
		System.out.println(t1.x+".."+ t1.y +".." +t2.x+".."+t2.y);
	}

}
