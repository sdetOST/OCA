package Oca01;
public class kafautu01 {
	
	public static void main(String[] args) {
		String[][] s={{"A","B","C"},{"D","E"}};
		for(int i =0; i<s.length;i++)	{
			for(int j =0; j<s[i].length;j++)	{
				if(s[i][j].equals("B"))  
					break;
				System.out.print(s[i][j]+" ");
			}
			continue;
		}
		System.out.println();		
		for(int i =0; i<s.length;i++)	{
			for(int j =0; j<s[i].length;j++)	{
				System.out.print(s[i][j]+" ");
				if(s[i][j].equals("A")) 
					break;
			}
			continue;
		}
		
//		for(int i =0; i<s.length;i++)
//		{
//			for(int j =0; j<s[i].length;j++)
//			{
//				System.out.print(s[i][j]+" ");
//				if(s[i][j].equals("B"))
//				{
//					break;
//				}
//			}
//			continue;
//
//	}
	}
}


	
