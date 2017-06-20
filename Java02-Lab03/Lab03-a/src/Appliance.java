/**
 * @author KateYeEumLee
 * @version 3.1
 */
public class Appliance {
	private String brand;
	private String serialNumber;
	private double height;
	private double depth;
	private double width;
	
	/**
	 * Default constructor
	 */
	public Appliance() {
		// TODO Auto-generated constructor stub
		setBrand(brand);
		setSerialNumber(serialNumber);
		setHeight(height);
		setDepth(depth);
		setWidth(width);
	}

	
	/**
	 * Overloaded Constructor
	 * @param brand The brand of appliance
	 * @param serialNumber The serial number of appliance.
	 * @param height The height of interior.
	 * @param depth The depth of interior.
	 * @param width The width of interior.
	 */
	public Appliance(String brand, String serialNumber, double height, double depth, double width) {
		this.brand = brand;
		this.serialNumber = serialNumber;
		this.height = height;
		this.depth = depth;
		this.width = width;
	}


	/**
	 * Method to get the brand of appliance.
	 * @return the brand as String.
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Method to set the brand of appliance.
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		if(brand != null && brand.trim().length() > 0){
			this.brand = brand;
		}
	}

	/**
	 * Method to get the serial number of appliance.
	 * @return the serialNumber as String.
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Method to set the serial number of appliance.
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		if(serialNumber != null && serialNumber.trim().length() > 0){
			this.serialNumber = serialNumber;
		}
	}

	/**
	 * Method to get the height of interior.
	 * @return the height as double.
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Method to set the height of interior.
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		if(height > 0.0){
			this.height = height;
		}
	}

	/**
	 * Method to get the depth of interior.
	 * @return the depth as double.
	 */
	public double getDepth() {
		return depth;
	}

	/**
	 * Method to set the depth of interior.
	 * @param depth the depth to set
	 */
	public void setDepth(double depth) {
		if(depth > 0.0){
			this.depth = depth;
		}
	}

	/**
	 * Method to get the width of interior.
	 * @return the width as double.
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Method to set the width of interior.
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		if(width > 0.0){
			this.width = width;
		}
	}

	
}
