package GenericsExample;

import java.util.Arrays;

public class GenericsArrayList<t> {
	private t[] array;
	private int size;
	
	public GenericsArrayList() {
		this.array =  (t[]) new Object[10];
		this.size=0;
	}
	
	public void add(t value) {
		if(size == array.length) {
			t[] temp = Arrays.copyOf(array, array.length * 2);
			this.array = temp;
			
		}
		array[size++] = value;
	}
	
     public t get(int index) {
    	 return array[index];
     }
	
	@Override
	public String toString() {
		t[] temp = Arrays.copyOf(array, size);
		
		return "Array: " + Arrays.toString(temp) + " size: "+ size;
		
	}
}
