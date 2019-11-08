package pk01;

public class Whizl {

	public static void main(String[] args) {
		
		AA y = new AA();
		
		y.setAA(12);

		
		System.out.println(y.getAA());
				
	}

}
class AA{
	
	private static int a;

	public int getAA() {
		return a;
	}

	public void setAA(int a) {
		this.a = a;
	}
	
	public static void main(String[] args) {
		AA x = new AA();
	
		System.out.println(x.getAA());
		
				
	}
	
}