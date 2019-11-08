package q083;

class Test2 {
	int x ;
	int y ;
	
	public void doStuff (int x , int y) {
		this.x = x;
		y = this.y;
	}
	public void print() {
		System.out.print(x+" : "+ y +" : " );
	}
	public static void main(String[] args) {
//		int x=1;															// opt1
//		int y=1;															// opt1
		Test2 t1 = new Test2();
		t1.x = 100;											
		t1.y = 200;												
		
		Test2 t2 = new Test2();
		t2.doStuff(t1.x ,  t1.y);
		t1.print(); 											
		t2.print();	
		
//		System.out.print(x+" : "+ y +" : " );			// opt1
		
	}
	

}
/*
	A.			100 : 200 : 100 : 0 :
	B.			100 : 0 : 100 : 0 :
	C.			100 : 200 : 100 : 200 :
	D.			100 : 0 : 200 : 0 :
	
	Answer :  A
*/
