package GenericsExample;

import java.util.Arrays;

public class EmployeeArrayList {
   private Employee[] empArray;
   private int size;
   private String name;
   private String address;
   
   public EmployeeArrayList() {
	   this.empArray = new Employee[10];
	   this.size = 0;
   }
   
   public void add(String name, String address) {
	
       if (size == empArray.length) {
    	   Employee[] temp = Arrays.copyOf(empArray, empArray.length * 2);
    	   this.empArray = temp;
         
       }
       empArray[size++] = new Employee(name, address);   
   }
   
   public String toString() {
	   Employee[] temp = Arrays.copyOf(empArray, size);
	   return "Array: " + Arrays.toString(temp) + "size: "+ size;
   }
   

}
