package reCheck;

public class Test43
{
	public static void main(String[] args) 
	{
		try
		{
			int n=10;
			int d=0;
			int ans=n/d;
		}
		catch (ArithmeticException e)
		{
			int ans=0;//Line-1
		}
		catch(Exception e)
		{
			System.out.println("Invalid Calculation");
		}
		System.out.println("Answer="+ans);//Line-2
	}
}