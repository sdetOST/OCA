package OCA_Adam.aaa;

public class A {
	public static void main(String[] args) 
	{
		int[]  data={10,20,30,40,50,30};
		int k= 30;
		int count=0;
		for(int x : data)
		{
			if( x!= k)
			{
				continue;
//				count++;
			}
		}
		System.out.println(count);
	}
	

}
