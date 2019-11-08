package q019;

public class Test {
	 void readCard(int cardNo) throws Exception {
	 	 System.out.println("Reading card");
	 }
	 void checkCard(int cardNo) throws RunTimeException { //line n1
	 	 System.out.println("Checking card");
	 }
	 public static void main(String[] args) throws Exception  {
	 Test ex = new Test();
	 int cardNo = 12344;
	 ex.checkCard(cardNo);	 	 //line n2
	 ex.readCard(cardNo);		 //line n3
	 }
}
