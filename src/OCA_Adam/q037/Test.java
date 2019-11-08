package q037;

public class Test {
	static int count = 0;   	// 4+0    1		2		3		4		
	int i = 0;							// 4+5+ 6+	7+	8+	9+

	public void changeCount() {
		while (i < 5) {
			i++;
			count++;
		}
	}

	public static void main(String[] args) {
		Test check1 = new Test();
		Test check2 = new Test();
		check1.changeCount();
		check2.changeCount();
		System.out.print(check1.count + " : " + check2.count);
	}
}