/**
 * @author KateYeEumLee
 * @version 5.1
 */
public class CommissionEmployee extends Employee {
	private double commissionRate;
	private double monthlySalesTotal;
	
	/**
	 * Default Constructor
	 */
	public CommissionEmployee() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * Overloaded Constructor
	 * @param name The name of employee.
	 * @param commissionRate The commission rate of employee.
	 * @param monthlySalesTotal The sales total monthly.
	 */
	public CommissionEmployee(String name, double commissionRate, double monthlySalesTotal) {
		super(name);
		setCommissionRate(commissionRate);
		setMonthlySalesTotal(monthlySalesTotal);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Method to get the commission rate.
	 * @return the commissionRate as double.
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * Method to set the commission rate.
	 * @param commissionRate the commissionRate to set
	 */
	public void setCommissionRate(double commissionRate) {
		if(commissionRate > 0.0){
			this.commissionRate = commissionRate;
		}
	}

	/**
	 * Method to get the monthly sales total.
	 * @return the monthlySalesTotal as double.
	 */
	public double getMonthlySalesTotal() {
		return monthlySalesTotal;
	}

	/**
	 * Method to set the monthly sales total.
	 * @param monthlySalesTotal the monthlySalesTotal to set
	 */
	public void setMonthlySalesTotal(double monthlySalesTotal) {
		if(monthlySalesTotal > 0.00){
			this.monthlySalesTotal = monthlySalesTotal;
		}
	}

	/* (non-Javadoc)
	 * @see Employee#calculateMonthlyEarnings()
	 */
	@Override
	public double calculateMonthlyEarnings() {
		// TODO Auto-generated method stub
		return commissionRate * monthlySalesTotal;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommissionEmployee [commissionRate=" + commissionRate + ", monthlySalesTotal=" + monthlySalesTotal
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
