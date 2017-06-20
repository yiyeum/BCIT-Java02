import java.util.ArrayList;

/**
 * @author KateYeEumLee
 * @version 3.1
 */
public class ApplianceStore {
	private ArrayList<Appliance> appliances;
	
	/**
	 * Constructor
	 */
	public ApplianceStore() {
		// TODO Auto-generated constructor stub
		appliances = new ArrayList<Appliance>();
	}

	public void addAppliances(Appliance newAppliance){
		if(newAppliance != null){
			appliances.add(newAppliance);
		}
	}
	
	public int countOfAppliances(){
		return appliances.size();
	}
	
	public void displayAppliance(){
		for(Appliance app : appliances){
			System.out.println("Brand name : " + app.getBrand() + ", Serial Number : " + app.getSerialNumber());
		}
	}
}
