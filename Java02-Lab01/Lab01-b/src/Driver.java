/**
 * @author KateYeEumLee
 * @version 1.2
 */
public class Driver {

	/**
	 * 
	 */
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Driver().run();
	}

	public void run(){
		Member member1 = new Member("Morango", "Green", 2, 2017);
		Member member2 = new Member("Banana", "Yellow", 6, 2015);
		Member member3 = new Member("Melon", "Green", 3, 2016);
		Club myClub = new Club();
		
		myClub.join(member1);
		myClub.join(member2);
		myClub.join(member3);
		
		System.out.println("Display the number of members : ");
		System.out.println(myClub.numberOfMembers());
		System.out.println(" ");

		System.out.println("Display the detail of members : ");
		myClub.showMembers();
		System.out.println(" ");

		System.out.println("Display the member of year 2015 : ");
		myClub.showMembersByYear(2015);
		System.out.println(" ");

		System.out.println("Remove the member of year 2016 + Display the all members : ");
		myClub.removeMembersByYear(2016);
		myClub.showMembers();
		
	}
}
