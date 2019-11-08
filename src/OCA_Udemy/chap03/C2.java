package chap03;

class A2 {
	String a = "a";

	public static void test() {
		System.out.print("A");
	}
}

class B2 extends A2 {
	String a = "b";

	public static void test() {
		System.out.print("B");
	}
}

public class C2 extends B2 {
	String a = "c";

	public static void test() {
		System.out.print("C");
	}

	public static void main(String[] args) {

//	A2 a1 = new A2();
//	A2 a2 = new B1(); 
//	A2 a3 = new C2();
//	a1.test();		System.out.println(a1.a);
//	a2.test();		System.out.println(a2.a);
//	a3.test();		System.out.println(a3.a);
//
//	A2 a1 = new A2();
//	B1 a2 = new B1();
//	C2 a3 = new C2();
//	a1.test();		System.out.println(a1.a);
//	a2.test();		System.out.println(a2.a);
//	a3.test();		System.out.println(a3.a);
//
//	A2 a1 = new C2();
//	A2 a2 = new C2();
//	A2 a3 = new C2();
//	a1.test();		System.out.println(a1.a);
//	a2.test();		System.out.println(a2.a);
//	a3.test();		System.out.println(a3.a);
//
//	A2 a1 = new C2();
//	B1 a2 = new C2();
//	C2 a3 =new C2();
//	a1.test();		System.out.println(a1.a);
//	a2.test();		System.out.println(a2.a);
//	a3.test();		System.out.println(a3.a);
//
//	A2 a1 = new A2();
//	A2 a2 = new B1();
//	A2 a3 = new C2();
//	a1.test();		System.out.println(a1.c);
//	a2.test();		System.out.println(a2.c);
//	a3.test();		System.out.println(a3.c);
//
//	A2 a1 = new A2();
//	B1 a2 = new B1();
//	C2 a3 = new C2();
//	a1.test();		System.out.println(a1.c);
//	a2.test();		System.out.println(a2.c);
//	a3.test();		System.out.println(a3.c);

//	A2 a1 = new C2();
//	A2 a2 = new C2();
//	A2 a3 = new C2();
//	a1.test();		System.out.println(a1.c);
//	a2.test();		System.out.println(a2.c);
//	a3.test();		System.out.println(a3.c);

//	A2 a1 = new C2();
//	B1 a2 = new C2();
//	C1 a3 = new C2();
//	a1.test();		System.out.println(a1.c);
//	a2.test();		System.out.println(a2.c);
//	a3.test();		System.out.println(a3.c);

	}
}