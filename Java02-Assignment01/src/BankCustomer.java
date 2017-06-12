/**
 * Class represents Bank Customer.
 * @author KateYeEumLee
 */

public class BankCustomer {
	private String firstName;
	private String lastName;
	private String accountNumber;
	private String passCode;
	private double balance;
	
	/**
	 * Default Constructor
	 */
	public BankCustomer() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * Overloaded Constructor
	 * @param firstName
	 * @param lastName
	 * @param accountNumber
	 * @param passCode
	 */
	public BankCustomer(String firstName, String lastName, String accountNumber, String passCode) {
	
		setFirstName(firstName);
		setLastName(lastName);
		setAccountNumber(accountNumber);
		setPassCode(passCode);
	}

	/**
	 * Method to add amount to the balance.
	 * @param amount The amount to be added to the balance.
	 */
	public void addToBalance(double amount){
		if(amount > 0.00){
			balance += amount;
		}
	}

	/**
	 * Method to subtract amount from the balance.
	 * @param amount in double.
	 */
	public void substractFromBalance(double amount){
		if(amount > 0.00){
			balance -= amount;
		}
	}
	
	/**
	 * Method to get the first name.
	 * @return the firstName in String.
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * Method to set the first name.
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if(firstName != null && firstName.trim().length() > 0){
			this.firstName = firstName;
		}
	}


	/**
	 * Method to get the last name.
	 * @return the lastName in String.
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * Method to set the last name.
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if(lastName != null && lastName.trim().length() > 0){
			this.lastName = lastName;
		}
	}


	/**
	 * Method to get the account number.
	 * @return the accountNumber in String.
	 */
	public String getAccountNumber() {
		return accountNumber;
	}


	/**
	 * Method to set the account number.
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		if(accountNumber != null && accountNumber.trim().length() > 0){
			this.accountNumber = accountNumber;
		}
	}


	/**
	 * Method to get the passcode.
	 * @return the passCode in String.
	 */
	public String getPassCode() {
		return passCode;
	}


	/**
	 * Method to set the passcode.
	 * @param passCode the passCode to set
	 */
	public void setPassCode(String passCode) {
		if(passCode != null && passCode.trim().length() > 0){
			this.passCode = passCode;
		}
	}

	/**
	 * Method to get the balance.
	 * @return balance in double.
	 */
	public double getBalance(){
		return balance;
	}
	
	/**
	 * Method to set the balance.
	 * @param balance in double.
	 */
	public void setBalance(double balance){
		if(balance >= 0.00){
			this.balance = balance;
		}
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankCustomer [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber
				+ ", passCode=" + passCode + ", balance=" + balance + "]";
	}
	
	
}
	
