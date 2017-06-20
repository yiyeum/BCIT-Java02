/**
 * @author KateYeEumLee
 * @version 3.1
 */
public class Refrigerator extends Appliance {
	private double maximumColdnessDegrees;
	
	/**
	 * Default Constructor
	 */
	public Refrigerator() {
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
	 */
	public Refrigerator(String brand, String serialNumber, double height, double depth, double width, double maximumColdnessDegrees) {
		super(brand, serialNumber, height, depth, width);
		setMaximumColdnessDegrees(maximumColdnessDegrees);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method to get the maximum coldness degrees.
	 * @return the maximumColdnessDegrees as double.
	 */
	public double getMaximumColdnessDegrees() {
		return maximumColdnessDegrees;
	}

	/**
	 * Method to set the maximum coldness degrees.
	 * @param maximumColdnessDegrees the maximumColdnessDegrees to set
	 */
	public void setMaximumColdnessDegrees(double maximumColdnessDegrees) {
		if(maximumColdnessDegrees > 0.0){
			this.maximumColdnessDegrees = maximumColdnessDegrees;
		}
	}
	
	/**
	 * Method to calculate the capacity of refrigerator.
	 * @return capacity as double.
	 */
	public double calculateCapacity(){
		return getWidth() * getDepth() * getHeight();
	}


	
}
