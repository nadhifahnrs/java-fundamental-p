package lat7_3;

public class Commission extends Hourly{
	private double TotalSales;
	private double commissionRate;
	
	public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double ecommissionRate )
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		commissionRate =  ecommissionRate;
	}
	
	public void addSales(double totalSales) {
		TotalSales = totalSales;
	}
	
	public double pay() {
		double payment = super.pay() + TotalSales*commissionRate;
		
		TotalSales = 0;
		
		return payment;		
	}
	
	public String toString() {
		String result = super.toString();
		
		result += "\nTotal Sales : " + TotalSales;
		
		return result;
	}
}
