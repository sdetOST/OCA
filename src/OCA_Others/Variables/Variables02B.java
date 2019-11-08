package Variables;

class Variables02 {
	int count;																	/
	
	public  void display() {										
		count++;																// line1
		System.out.println("aaaaa  "+count);					//line2
	}
	public static void main(String[] args) {
		Variables02 x = new Variables02();
		x.display();
		x.display();

	}
}
