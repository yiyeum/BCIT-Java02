import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Class represents Bank.
 * @author KateYeEumLee
 */

public class Bank {
	public static HashMap<String,BankCustomer> theBank;
	
	/**
	 * Constructor 
	 */
	public Bank() {
		// TODO Auto-generated constructor stub
		theBank = new HashMap<String,BankCustomer>();
	}

	/**
	 * Method to remove the account from HashMap.
	 * @param accountNumber in String.
	 */
	public void closeAccount(String accountNumber){
		if(accountNumber != null && accountNumber.trim().length() > 0){
			for(Entry<String, BankCustomer> s : theBank.entrySet()){
				if(s.getKey() == accountNumber){
					theBank.remove(s);
				}
			}// for each
		}// if
	}
	
	/**
	 * Method to create an account.
	 * @param newCustomer
	 */
	public void createAccount(BankCustomer newCustomer){
		if(newCustomer != null){
			theBank.put(newCustomer.getAccountNumber(), newCustomer);
		}
	}
	
	/**
	 * Method to deposit the amount(double) to the account matching account number.
	 * @param accountNumber in String.
	 * @param amount in double.
	 */
	public void deposit(String accountNumber, double amount){
		if(accountNumber != null && accountNumber.trim().length() > 0 && amount > 0.00){
			for(Entry<String, BankCustomer> s : theBank.entrySet()){
				if(s.getKey() == accountNumber){
					s.getValue().addToBalance(amount);
				}
			}
		}
	}
	
	/**
	 * Method to withdraw the amount(double) from the account matching account number.
	 * @param accountNumber in String.
	 * @param amount in double.
	 */
	public void withdraw(String accountNumber, double amount){
		if(accountNumber != null && accountNumber.trim().length() > 0 && amount > 0.00){
			for(Entry<String, BankCustomer> s : theBank.entrySet()){
				if(s.getKey() == accountNumber){
					if(amount <= s.getValue().getBalance()){
						s.getValue().substractFromBalance(amount);
					}
				}
			}
		}
	}
	
	/**
	 * Method to display cusomer's information.
	 * @param customer (BankCustomer)
	 */
	public static void displayCustomerInformation(BankCustomer customer){
		if(customer != null){
			for(Entry<String, BankCustomer> s : theBank.entrySet()){
				if(s.getValue() == customer){
					System.out.println(s.toString());
				}
			}
		}
	}

	/**
	 * Method to get the HashMap theBank.
	 * @return the theBank HashMap.
	 */
	public static HashMap<String, BankCustomer> getTheBank() {
		return theBank;
	}
	
	
}

