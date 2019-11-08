package Q054;

public class Test{
public static void main(String [] args){
//	 	 System.out.println("hello"+new StringBuilder("java se 8"));
//	 	 System.out.println("hello"+new MyString ("java se 8"));
//	 	System.out.println("hello"+new MyString ("java se 8").msg);		//op1
	
	System.out.println(MyString.msg);
	 	
//	 	System.out.println("hello"+MyString.msg);				/ /option2
	 
}
}
/*
What is the result?
a)		hello java se 8
 		hello java se 8
b)		hello java.lang stringbuilder@<hashcode>
		hello p1.mystring @<hashcode2>
c) 	hello java se 8
		hello p1.mystring @<hashcode2>
d)		compilation fails at the test class
OPTIONS
A)		OPTION A
B)		OPTION B
C)		option c
D)	option d

ANSWER: C
*got same

*/