/**
 * @author KateYeEumLee
 * @version 3.1
 */
public class Driver {
	private Refrigerator refrige;
	private Stove stove;
	private ApplianceStore store;
	
	/**
	 * Constructor 
	 */
	public Driver() {
		// TODO Auto-generated constructor stub
		refrige = new Refrigerator("Samsung","RG-100",30,50,80,20);
		stove = new Stove("LG","ST-100",20,40,50,7);
		store = new ApplianceStore();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Driver().run();

	}

	public void run(){
		
		//Test methods in ApplianceStore class.
		//add refrige and stove to the appliance store(arrayList)
		store.addAppliances(refrige);
		store.addAppliances(stove);
		
		System.out.println("The number of appliances in the store :");
		System.out.println(store.countOfAppliances());
		System.out.println("");
		
		System.out.println("Display the detail of appliances : ");
		store.displayAppliance();
		System.out.println("");
		
		//Test method in Refrigerator.
		System.out.println("The capacity of refrigerator :");
		System.out.println(refrige.calculateCapacity());
		System.out.println("");
		
		
	}
	
}
