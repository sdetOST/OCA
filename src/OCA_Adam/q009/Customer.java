package OCA_Adam.q009;

public class Customer {
	
	ElectricAccount acct = new ElectricAccount();
	public void useelectricity(double kWh) {
	acct.addKWh(kWh);
	
	}
	
	
}
