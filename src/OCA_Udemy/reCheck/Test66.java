package reCheck;

class Student
{
	String name;
	public Student(String name)
	{
		this.name=name;
	}
}
public class Test66 
{
	public static void main(String[] args) 
	{
		Student[] students = new Student[3];
		students[1]= new Student("Durga");
		students[2]= new Student("Ravi");
		for(Student s : students)
		{
			System.out.println(s.name);
		}
	
	}
}