package chap03;

public class Test2 {
	
	public static void main(String[] args) 
	{
		String[][] s={{"A","B","C"},{"D","E"}};
		for(int i =0; i<s.length;i++)
		{
			for(int j =0; j<s[i].length;j++)
			{
				System.out.print(s[i][j]+" ");
				if(s[i][j].equals("B"))
				{
					break;
				}
			}
			continue;						//  ??? NO NEED
		}
	}
}