package chapter04;

public class Thomas
{
	public static void main(String[] args)
	{
		String[] names={"Thomas","Bunny","Chinny"};
		String[] pwds=new String[3];
		int i =0;
		try
		{
			for (String n: names)
			{
				pwds[i]=n.substring(2,6);
				i++;
			}
		}
		catch (Exception e)
		{
			System.out.println("Invalid Name");
		}
		for(String p: pwds)
		{
			System.out.println(p);
		}
	}
}