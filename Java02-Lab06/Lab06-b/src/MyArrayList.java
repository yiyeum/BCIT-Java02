import java.util.Arrays;

/**
 * 
 */

/**
 * @author KateYeEumLee
 *
 */
public class MyArrayList implements MyList {
	private Object[] myList;
	private Object objectType;
	/**
	 * 
	 */
	public MyArrayList() {
		// TODO Auto-generated constructor stub
		myList = new Object[0];
	}
	
	public MyArrayList(Object type){
		myList = new Object[0];
		objectType = type;
	}

	@Override
	public boolean add(Object toAdd) {
		if(toAdd != null){
			if(toAdd.getClass().getName().equals(objectType.getClass().getName())){
				int newLength = myList.length + 1;
				myList = Arrays.copyOf(myList, newLength);
				myList[newLength - 1] = toAdd;
				return true;
			} else{
				System.out.println("ERROR : Please add string for new array.");
			}
		} // if - checking null
		return false;
	}

	@Override
	public Object get(int index) {
		if(index >= 0 && index < myList.length){
			return myList[index];
		}
		return null;
	}

	@Override
	public Object remove(int index) {
		Object[] copiedArray;
		if(index >= 0 && index < myList.length){
			int newLength = myList.length - 1;
			myList[index] = null;
			copiedArray = new Object[newLength];
			int copiedLength = 0;
			for(int i = 0; i < newLength; i ++){
				if(myList[i] != null){
					copiedArray[copiedLength] = myList[i];
					copiedLength ++;
				} // if
			} // for
			myList = copiedArray;
		} // if
		return null;
	}

	@Override
	public int size() {
		return myList.length;
	}

	@Override
	public boolean isEmpty() {
		if(myList.length == 0){
			return true;
		}
		return false;
	}

}
