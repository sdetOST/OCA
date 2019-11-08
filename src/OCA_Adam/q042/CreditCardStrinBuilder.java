package q042;

public class CreditCardStrinBuilder {

	
	public static String maskCC(String creditCard){
		String x = "XXXX-XXXX-XXXX-"; //line1
		
//		StringBuilder sb = new StringBuilder(creditCard); 
//		String sb1 = sb.substring(15, 19);//returns string
//		System.out.println(sb.substring(15, 19));
//		//return x+ sb.substring(15, 19);
//		return x+sb1;
		
		//return x + creditCard.substring(15, 19);
		
//		StringBuilder sb = new StringBuilder(x); 
//		sb.append(creditCard, 15, 19);
//		return sb.toString();
		
		StringBuilder sb = new StringBuilder(creditCard);
		StringBuilder s = sb.insert(0, x);
		return s.toString();

		
		
		}
	
		public static void main(String [] args){
			
			System.out.println(maskCC("1234-5678-9101-1121"));
		} 
}