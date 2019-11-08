package q025;

public class Employee {
	 String name;
	 boolean contract;
	 double salary;
	 
	 
	 Employee() {
		super();
		this.name = name;
		this.contract = contract;
		this.salary = salary;
	}

	 public String toString(){
	 return name + " : " + contract + " : " + salary;
	 }
	 public static void main(String[] args){
	 Employee e = new Employee();
	 e.name = "Joe";
	 e.contract = true;
	 e.salary = 100;
	 System.out.print(e);
	 }
	 }
