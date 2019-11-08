package Variables;

class Variables02 {
	static int count;																	
	
	public  static void display() {									
		count++;																// line1
		System.out.println("aaaaa  "+count);					//line2
	}
	public static void main(String[] args) {

		Variables02.display();
		Variables02.display();
	}
}
