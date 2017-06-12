import java.util.Map.Entry;

/**
 * Class represents ATM.
 * @author KateYeEumLee
 */

public class ATM {
	private boolean customerVerified;
	private BankCustomer currentCustomer;
	InputReader reader = new InputReader();
	Bank bank = new Bank();
	
	/**
	 * Default Constructor
	 */
	public ATM() {
		// TODO Auto-generated constructor stub
		initialize();
		run();
	}
	
	public static void main(String[] args) {
		new ATM();
	}

	public void run(){
		
		boolean exit = false;
		while(!exit){
		
		System.out.println("Welcome to Bullwinkle's Bank.");
		System.out.println("Choose one of the following options");
		System.out.println("1 - Sign In");
		System.out.println("2 - Deposit");
		System.out.println("3 - Withdraw");
		System.out.println("4 - Display Account Info");
		System.out.println("5 - Exit");
		System.out.print(">");
		int choice = reader.getIntInput();

			switch(choice){
			case 1 : choice = 1;
					 verifyCustomer();
					 break;
			case 2 : choice = 2;
					 transactDeposit();
					 break;
			case 3 : choice = 3;
					 transactWithdraw();
					 break;
			case 4 : choice = 4;
					 displayAccountInformation();
					 break;
			case 5 : choice = 5;
					 System.out.println("Thank you for banking at BullWinkle's Bank.");
					 System.exit(0);
					 System.out.println("Debug : Displaying all accounts in the bank.");
					 displayAccountInformation();
					 
			} // switch
		} // while
		
	} // run
	

	public void initialize(){
		currentCustomer = new BankCustomer("Kate","Lee","SA-1","A001");
		bank.createAccount(currentCustomer);
		
		currentCustomer =  new BankCustomer("Morango","Green","A002","CH-1");
		bank.createAccount(currentCustomer);
		
		currentCustomer = new BankCustomer("Orange","Yellow","A003","GL-1");
		bank.createAccount(currentCustomer);
	}

	public void verifyCustomer(){
		System.out.println("Enter your account number : ");
		System.out.print(">");
		String accountNumber = reader.getStringInput();
		
		System.out.println("Enter your PassCode : ");
		System.out.print(">");
		String passCode = reader.getStringInput();
		
		if(accountNumber != null && accountNumber.trim().length() > 0){
			if(passCode != null && passCode.trim().length() > 0){		
				
				for(Entry<String, BankCustomer> s : Bank.getTheBank().entrySet()){
					if(s.getValue().getAccountNumber().equals(accountNumber)){
						if(s.getValue().getPassCode().equals(passCode)){
							customerVerified = true;
						} // if - pass code
					} // if - accountNumber
				}// for - HashMap
					if(customerVerified == false){
						System.out.println("ERROR : Either account number or passcode is incorrect.");
					}
			} // if - pass code validation
		} // if - accountNumber validation
	}
	
	public void transactDeposit(){
		if(customerVerified = true){
			System.out.println("Enter the amount to deposit : ");
			double amountDeposit = reader.getDoubleInput();
			if(amountDeposit > 0.00){
				bank.deposit(currentCustomer.getAccountNumber(), amountDeposit);
			}
		}
		
	}
	
	public void transactWithdraw(){
		if(customerVerified = true){
			System.out.println("Enter the amount to withdraw : ");
			double amountWithdraw = reader.getDoubleInput();
			if(amountWithdraw > 0.00 && amountWithdraw <= currentCustomer.getBalance()){
				bank.withdraw(currentCustomer.getAccountNumber(), amountWithdraw);
			}
		}
	}
	
	public void displayAccountInformation(){
		if(customerVerified = true){
			System.out.println(currentCustomer.toString());
		}
	}
	
}
