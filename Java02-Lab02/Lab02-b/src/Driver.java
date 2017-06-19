/**
 * @author KateYeEumLee
 * @version 2.2
 */
public class Driver {
	private EmailInfo info;
	/**
	 * 
	 */
	public Driver() {
		// TODO Auto-generated constructor stub
		info = new EmailInfo();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Driver().run();

	}
	
	public void run(){
		
		//add friends to the address book.
		info.addFriend("Rose", "rose@email.com");
		info.addFriend("Daisy", "daisy@email.com");
		info.addFriend("Flower", "rose@email.com");
		info.addFriend("Herb", "herb@email.com");
		
		//list all of friends in address book.
		System.out.println("List all of friends in address book : ");
		info.listAll();
		System.out.println(" ");
		
		//get the address of friend name, Herb.
		System.out.println("Get the address of friend, Herb : ");
		System.out.println(info.getAddress("heRb"));
		System.out.println(" ");

		//find the friends matching the address.
		System.out.println("Find the friends matching the email address, rose@email.com : ");
		info.findFriends("rose@email.com");
		System.out.println(" ");
		
		//remove friends + list all again
		System.out.println("Remove friend, Daisy , and display all of address book again : ");
		info.removeFriend("daisY");
		
		info.listAll();
		System.out.println(" ");
		
		
	}
	
}
