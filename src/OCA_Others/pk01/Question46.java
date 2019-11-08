package pk01;

public class Question46 {
	int a1;
	
	public static int  doProduct(int a) {
	return a*a;
		
	}
//	public static void doProductt(Question46 item) {
//	item.a1  = item.a1*item.a1;
//	
//	}

	public static void doString(StringBuilder s) {
		s.append(""+s);
	}
	public static void main(String[]args) {
		Question46 item = new Question46();
		item.a1=11;
		StringBuilder sb = new StringBuilder("Hello");
		int i=10;
	
		doString(sb);
		doProduct(i);
		doProduct(item.a1);
		System.out.println(i+""+sb+""+item.a1);
	
	}

}