/**
 * @author KateYeEumLee
 * @version 3.1
 */
public class Stove extends Appliance {
	private int numberOfHeatingElements;
	/**
	 * 
	 */
	public Stove() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * Overloaded Constructor
	 * @param brand The brand of appliance
	 * @param serialNumber The serial number of appliance.
	 * @param height The height of interior.
	 * @param depth The depth of interior.
	 * @param width The width of interior.
	 * @param numberOfHeatinfElements The number of heating elements of stove.
	 */
	public Stove(String brand, String serialNumber, double height, double depth, double width, int numberOfHeatingElements) {
		super(brand, serialNumber, height, depth, width);
		setNumberOfHeatingElements(numberOfHeatingElements);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method to get the number of heating elements.
	 * @return the numberOfHeatingElements as integer.
	 */
	public int getNumberOfHeatingElements() {
		return numberOfHeatingElements;
	}

	/**
	 * Method to set the number of heating elements.
	 * @param numberOfHeatingElements the numberOfHeatingElements to set
	 */
	public void setNumberOfHeatingElements(int numberOfHeatingElements) {
		if(numberOfHeatingElements > 0){
			this.numberOfHeatingElements = numberOfHeatingElements;
		}
	}

	
}
