/**
 * 
 */

/**
 * @author KateYeEumLee
 *
 */
public class Driver {
	private MyArrayList theList;
	/**
	 * 
	 */
	public Driver() {
		// TODO Auto-generated constructor stub
		theList = new MyArrayList();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Driver().run();
	}

	public void run(){
		theList.add(40);
		theList.add(50);
		
		System.out.println(theList.get(0));
		System.out.println(theList.get(1));
		System.out.println("");
		
		theList.remove(1);
		System.out.println(theList.get(0));
		System.out.println(theList.get(1));
	}
}
