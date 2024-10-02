package GenericsExample;

import java.util.Arrays;

public class StringArrayList {
	private String[] stringArray;
	private int size;
	
	public StringArrayList() {
		this.stringArray = new String[10];
		this.size = size;
	}
	
	public void add(String value) {
		if(size == stringArray.length) {
			String[] temp = Arrays.copyOf(stringArray, stringArray.length * 2);
			this.stringArray = temp;
			
		}
		stringArray[size++]=value;
	}
	
	@Override
	public String toString() {
	
				String[] temp = Arrays.copyOf(stringArray, size);
         return  "Array: " + Arrays.toString(temp) + ", size: " + size;
		
	}

}
