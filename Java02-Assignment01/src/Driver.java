
public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		BankCustomer customer = new BankCustomer("Kate","Lee","A00966565","KT-123");
		
		bank.createAccount(customer);
		Bank.displayCustomerInformation(customer);
		bank.deposit("A00966565", 30);
		Bank.displayCustomerInformation(customer);
		bank.withdraw("A00966565", 20);
		Bank.displayCustomerInformation(customer);

	}

}
