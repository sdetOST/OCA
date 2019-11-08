package OCA_Adam.q009;

public class ElectricAccount {

	private double kWh;
	private double rate = 0.7;
	private double bill;
	
	//	line n1
	
//	public void addKWh(double kWh) {			// A
//		this.kWh += kWh;
//		this.bill = this.kWh * this.rate;
//		}
//	
	public void addKWh(double kWh) {			// B
		if (kWh > 0){
		this.kWh += kWh;
		this.bill = this.kWh * this.rate;
		}
		}
//	
//	private void addKWh(double kWh) {			// C
//		if (kWh > 0){
//		this.kWh += kWh;
//		this.bill = this.kWh * this.rate;
//		}
//		}
//	
//	public void addKWh(double kWh) {			// D
//		if (kWh > 0){
//		this.kWh += kWh;
//		setBill(this.kWh);
//		}
//		}
//		public void setBill(double kWh) {
//		bill = kWh * rate;
//		}
	
	
	}