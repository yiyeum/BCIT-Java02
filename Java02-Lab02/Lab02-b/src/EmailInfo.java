import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author KateYeEumLee
 * @version 2.2
 */
public class EmailInfo {
	private HashMap<String,String> addressBook;
	
	/**
	 * Default Constructor
	 */
	public EmailInfo() {
		// TODO Auto-generated constructor stub
		addressBook = new HashMap<String,String>();
	}
	
	/**
	 * Method to format the name.
	 * @param name The name in String.
	 * @return The name in String.
	 */
	public String formatName(String name){
		String first = "";
		String rest = "";
		if(name != null && name.trim().length() > 0 ){
			first = name.substring(0, 1).toUpperCase();
			
			if(name.length() > 1){
				rest = name.substring(1).toLowerCase();
			} // if
			
		} // if
		
		return first + rest;
	}

	
	/**
	 * Method to add friend to the address book.
	 * @param name The name of friend adding to address book.
	 * @param email The email of friend adding to address book.
	 */
	public void addFriend(String name, String email){
		if(name != null && name.trim().length() > 0){
			String formattedName = formatName(name);
			if(email != null && email.trim().length() > 0){
				addressBook.put(formattedName, email);
			}
		}
	}
	
	/**
	 * Method to remove friend from the address book.
	 * @param name The name of friend removing from the address book.
	 */
	public void removeFriend(String name){
		if(name != null && name.trim().length() > 0){
			String formattedName = formatName(name);
			addressBook.remove(formattedName);
		}
	}
	
	/**
	 * Method to get address of specified name from address book.
	 * @param name The name in String.
	 * @return returns the email address of specified name.
	 */
	public String getAddress(String name){
		if(name != null && name.trim().length() > 0){
			String formattedName = formatName(name);
			return addressBook.get(formattedName);
		}
		return null;
	}
	
	/**
	 * Method to find friends of specified email address from address book.
	 * @param email The email in String.
	 */
	public void findFriends(String email){
		if(email != null && email.trim().length() > 1){
			for(Entry<String, String> s : addressBook.entrySet()){
				if(s.getValue() == email){
					System.out.println(s.getKey() + " ");
				} // if
			} // for
		} // if
	}
	
	/**
	 * Method to display all friends and email from address book.
	 */
	public void listAll(){
		for(Entry<String, String> s : addressBook.entrySet()){
			System.out.println(s.getKey() + " : " + s.getValue());
		} // for
	}
	
}
