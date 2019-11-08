package chap01;

public class Test 
{
	int i,j;
	public Test(int i,int j)
	{
		initialize(i,j);
	}
	public void initialize(int i,int j)
	{
		this.i = i*i;
		this.j=j*j;
	}		
	public static void main(String[] args) 
	{
		int i =3, j= 5;
		Test t = new Test(i,j);
		System.out.println(i+"..."+j);
	}
} 