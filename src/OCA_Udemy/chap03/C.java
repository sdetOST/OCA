package chap03;

class A{
	public void test()
	{
		System.out.print("A");
	}
}
class B extends A{
	public void test() 
	{
		System.out.print("B");
	}
}
public class C extends A{
	public void test()
	{
		System.out.print("C");
	}
	public static void main(String[] args)
	{
//		A a1 = new A();
//		A a2 = new B(); 
//		A a3 = new C();
//		a1.test(); 
//		a2.test();
//		a3.test();
		
//		A a1 = new A();
//		B a2 = new B();
//		C a3 = new C();
//		a1.test();
//		a2.test();
//		a3.test();
		
//		A a1 = new C();
//		A a2 = new C();
//		A a3 = new C();
//		a1.test();
//		a2.test();
//		a3.test();
		
		A a1 = new C();
//		B a2 = new C();
		C a3 = new C();
		a1.test();
//		a2.test();
		a3.test();
		
		
		
		
		
	}		
}