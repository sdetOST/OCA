package Variables;

class Variables02 {
	int count;																	//opt1: should be static
	
	public  static void display() {										// it is static, no problem
		count++;																// line1
		System.out.println("aaaaa  "+count);					//line2
	}
	public static void main(String[] args) {
//		Variables02 x = new Variables02();
//		x.display();
//		x.display();
		
		Variables02.display();
		Variables02.display();
	}
}
