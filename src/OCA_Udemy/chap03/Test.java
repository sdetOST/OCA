package chap03;

class Test 
{
	public static void main(String[] args) 
	{
		int[][] n = new int[1][3];
		for(int i =0; i< n.length; i++)
		{
			for (int j=0;j>n[i].length ;j++ )
			{
				n[i][j]=10;
			}
		}
	}
}