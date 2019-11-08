package q072;

//?????????????
public class Test1 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (RuntimeException re) {
			System.out.print("A");
		}
	}

	public static void method1() {
		try {
			throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
		} catch (MyException ne) {
			System.out.print("B");
		}
	}
}

/*

Now Answer will be 
A or B 

*/