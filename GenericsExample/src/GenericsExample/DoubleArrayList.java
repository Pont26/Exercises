package GenericsExample;

import java.util.Arrays;

public class DoubleArrayList {
	private double[] doubleArray;
	private int size;
	
	public DoubleArrayList() {
		this.doubleArray = new double[10];
		this.size = 0;
	}
	
	public void add(double value) {
		if(size == doubleArray.length) {
			double[] temp= Arrays.copyOf(doubleArray,doubleArray.length*2 );
			this.doubleArray = temp;
			
		}
		doubleArray[size++] = value;
		
	}
	
	@Override
	public String toString() {
		double[] temp = Arrays.copyOf(doubleArray, size);
	   return "Array: "+ Arrays.toString(temp) + "size: "+ size;
	}

}
