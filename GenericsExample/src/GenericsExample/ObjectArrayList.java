package GenericsExample;

import java.util.Arrays;

public class ObjectArrayList {
	private Object[] array;
	private int size;
	
	public ObjectArrayList() {
		this.array = new Object[10];
		this.size=0;
	}
	
	public void add(Object value) {
		if(size == array.length) {
			Object[] temp = Arrays.copyOf(array, array.length * 2);
			this.array = temp;
			
		}
		array[size++] = value;
	}
	
     public Object get(int index) {
    	 return array[index];
     }
	
	@Override
	public String toString() {
		Object[] temp = Arrays.copyOf(array, size);
		
		return "Array: " + Arrays.toString(temp) + " size: "+ size;
		
	}

}
