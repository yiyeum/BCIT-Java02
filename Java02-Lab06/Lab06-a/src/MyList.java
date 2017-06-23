/**
 * 
 */

/**
 * @author KateYeEumLee
 * @version 6.1
 */
public interface MyList {
	
	/**
	 * Method to add new object to the array
	 * @param toAdd
	 */
	boolean add(Object toAdd);
	
	/**
	 * Method to get the specified array by index.
	 * @param index as integer.
	 */
	Object get(int index);
	
	/**
	 * Method to remove the specified array by index.
	 * @param index as integer.
	 */
	Object remove(int index);
	
	/**
	 * Method to return the size of array.
	 */
	int size();
	
	/**
	 * Method to check if the array is empty.
	 */
	boolean isEmpty();
}
