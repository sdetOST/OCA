package q077;
import q077.Employee;
public class Test1 {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee manager = new Manager();
		Employee director = new Director();
		
		employee.salary = 50_000;
		director.salary = 80_000;
		employee.budget = 200_000;
		manager.budget = 1_000_000;
		manager.stockOption = 500;
		director.stockOptions = 1_000;
}
}
/*
 * Which two optoins fail to compile when placed at line n1 of
the main method?
A. employee.salary = 50_000;
B. director.salary = 80_000;
C. employee.budget = 200_000;
D. manager.budget = 1_000_000;
E. manager.stockOption = 500;
F. director.stockOptions = 1_000;
ANSWER: C, E
*got same
**/
