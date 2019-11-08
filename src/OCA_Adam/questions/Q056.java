package questions;
//???????????????????
public class Q056 {
		public static void main(int [] args){
		System.out.println("int main"+ args[0]);
		}
		public static void main(Object [] args){
		System.out.println("object main"+ args[0]);
		}
		public static void main(String [] args){
		System.out.println("String main"+ args[0]);
		}
}
/*		
		and commands
			javac.MainTest.java
			java MainTest 1 2 3
		
		what is a result?
		a	 line7
		b	 int main 1
		c 	object main 1
		d 	string main 1
		e	 compilation error
		f 	an exception is thrown at runtime.
		
		ANSWER: D
*/
