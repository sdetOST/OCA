package emreayPala;

public class StringBuilderBufferr {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdefg");
		System.out.println(sb);
		
		sb.delete(2, 5); 											// starts from index 2 but at the end its taking 5-1=4/(end-1)
		sb.delete(0, sb.length());
		System.out.println(sb);
	}

}
