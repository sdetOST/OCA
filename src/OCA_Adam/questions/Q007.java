package questions;

public class Q007 {

	public static void main(String[] args) {
		
		Car c1 = new Car("Auto");
	 	Car c2 = new Car("4W", 150, "Manual");
	 	System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
	 	 System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
	}
}
class Vehicle {
	 String type = "4W";
	 int maxSpeed = 100;
	 Vehicle(){}
	 Vehicle(String type, int maxSpeed) {
	 	 this.type = type;
	 	 this.maxSpeed = maxSpeed;
	 }
}
class Car extends Vehicle { 
	 String trans;
	 Car(String trans) { 									// Line n1 //(compilation error)
		 
	 	 this.trans = trans;
	 }
	 Car(String type, int maxSpeed, String trans) {
	 	 super(type, maxSpeed);
//	 	 this(trans); 										// Line n2 //(compilation error)
	 	 this.trans = trans;
	 }
}
/*
What is the result?
		A. 4W 100 Auto
			4W 150 Manual
		B. Null 0 Auto
			4W 150 Manual
		C. Compilation fails only at line n1	 
		D. Compilation fails only at line n2
		E. Compilation fails at both line n1 and line n2
ANSWER: E

*/