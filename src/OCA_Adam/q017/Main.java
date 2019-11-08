package q017;

public class Main {

	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount((int)(Math.random() * 100));
//		 acct.amount = 0;										//line 1
//		acct.changeAmount(-acct.amount);
//		acct.changeAmount(-acct.getAmount());
		

		
		 System.out.println(acct.getAmount());
		
		}
}