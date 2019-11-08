package chapter04;

public class q16 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("012345");
		String s = "abcdef";
		
		System.out.println(sb);
		
		
		sb.append(6);
		sb.append(7);
		sb.append('-');
		sb.append(true);			System.out.println(sb);
		sb.deleteCharAt(7);		System.out.println(sb);
		sb.append(s, 1, 3);		System.out.println(sb);
		
		
		sb.insert(7, false);				System.out.println(sb);
		sb.reverse();					System.out.println(sb);
		sb.reverse();					System.out.println(sb);
		sb = sb.replace(7, 25, "X");			System.out.println(sb);
//		sb = sb.substring(1, 3);			System.out.println(sb);					//!!!!!!
		
		
		
		
//		StringBuffer sf = new StringBuffer("012345");
//		
//		System.out.println(sf);
//		
//		sf.substring(3, 5);
//		
//		System.out.println(sf);
		
		
		
		
}
}