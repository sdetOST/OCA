package Q058;

public class Person {
		String name;
		int age = 25;

		public Person(String name ) {
			 	 this (); 	 												 // line n1
			 	 setName(name);
		}
		public Person (String name,int age) {
			 	 Person(name); 	 	 								// line 2
			 	 setAge(age);
		}
		public String getName() {
			 	 return name;
		}
		public void setName(String name) {
			 	 this.name = name;
		}
		public int getAge() {
			 	 return age;
		}
		public void setAge(int age) {
			 	 this.age = age;
		}
		//setter and getter methods go here
		public String show() {
			 	 return name+ " "+age+" "+number;

		}
		public static void main(String[] args) {
			 	 Person p1 = new Person("JESSE");
			 	 Person p2 = new Person("Walter",53);
			 	 System.out.println(p1.show());
			 	 System.out.println(p2.show());
		}
		}
	
	/*
		What is the result?
		A. Jesse 25
			Walter 52
		B. Compilation fails at line n1
		C. Compilation fails at line n2
		D. Compilation fails at both line n1 and line n2
		
		ANSWER:  D   both n1,n2 compilation error
		*got same
*/
