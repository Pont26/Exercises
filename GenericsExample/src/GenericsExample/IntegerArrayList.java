package GenericsExample;

import java.util.Arrays;

public class IntegerArrayList {
	private int[] intArray;
	private int size;
	
	public IntegerArrayList() {
		 this.intArray = new int[10];
		 this.size = 0;
	}

	public void add(int value) {
	    if (size == intArray.length) {
	    	int[] temp = Arrays.copyOf(intArray, intArray.length * 2); 
	        this.intArray = temp;
	    }
	    intArray[size++] = value; 
	}
	

		
	
	@Override
	public String toString() {
		  int[] temp = Arrays.copyOf(intArray, size);
		    
		    return "Array: " + Arrays.toString(temp) + ", size: " + size;
	}
}
