/**
 * @author KateYeEumLee
 * @version 1.2
 */
public class Club {
	private Member m[];
	
	/**
	 * Default Constructor
	 */
	public Club() {
		// TODO Auto-generated constructor stub
		m = new Member[3];
	}

	public void join(Member member){
		if(member != null){
			for(int index = 0; index < m.length; index++){
				if(m[index] == null){
					m[index] = member;
					break;
				}
			}
		}
	}
	
	public int numberOfMembers(){
		int membersCounter = 0;
		
		for(Member theMember : m){
			if(theMember != null){
				membersCounter = m.length;
			}
		}
		return membersCounter;
	}
	
	public void showMembers(){
		for(Member theMember : m){
			if(theMember != null){
				System.out.println(theMember.toString());
			}
		}
	}
	
	public void showMembersByYear(int year){
		if(year > 0){
			for(Member theMember : m){
				if(theMember != null){
					if(theMember.getYear() == year){
						System.out.println(theMember.toString());
					}
				}
			}
		}
	}
	
	public void removeMembersByYear(int year){
		if(year > 0){
			for(int index = 0; index < m.length; index++){
				if(m[index].getYear() == year){
					m[index] = null;
				}
			}
		}
	}
}
