package GenericsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.UnaryOperator;

public class Main {
	public static void main(String[] args) {
		//case 1
		System.out.println("Case 1");
		IntegerArrayList intArray=new IntegerArrayList();
		intArray.add(1);
		intArray.add(2);
		intArray.add(3);
		System.out.println(intArray);
		
		StringArrayList stringArray=new StringArrayList();
		stringArray.add("Ju Ju");
		stringArray.add("Pone Pone");
		stringArray.add("Suze");
		System.out.println(stringArray);
		
		DoubleArrayList doubleArray=new DoubleArrayList();
		doubleArray.add(1.2);
		doubleArray.add(2.3);
		doubleArray.add(3.1);
		System.out.println(doubleArray);
		
		EmployeeArrayList employeeArray=new EmployeeArrayList();
		employeeArray.add("Ju Ju", "Yangon");
		employeeArray.add("Pone Pone", "Taunggyi");
		employeeArray.add("Suze" , "Thailand");
		System.out.println(employeeArray);
		
		//case 2
		System.out.println("Case 2");
		ObjectArrayList objectArray=new ObjectArrayList();
		objectArray.add(1);
		objectArray.add("Ju Ju");
		objectArray.add(1.2);
		Employee emp1= new Employee("Ju Ju", "Yangon");
		objectArray.add(emp1);
		
		System.out.println(objectArray);
		String testing = (String) objectArray.get(1);
		System.out.println(testing);
		
		//case 3
		System.out.println("Case 3");
		GenericsArrayList<Integer> intArray1=new GenericsArrayList();
		intArray1.add(1);
		intArray1.add(2);
		intArray1.add(3);
		
		GenericsArrayList<String> stringArray2=new GenericsArrayList();
		stringArray2.add("Ju Ju");
		stringArray2.add("Pone Pone");
		stringArray2.add("Suze");
		
		GenericsArrayList<Double> doubleArray3=new GenericsArrayList();
		doubleArray3.add(1.2);
		doubleArray3.add(2.3);
		doubleArray3.add(3.1);
		
		GenericsArrayList<Employee> employeeArray4=new GenericsArrayList();
		 employeeArray4.add(emp1);

		System.out.println(intArray1);
		System.out.println(stringArray2);
		System.out.println(doubleArray3);
		System.out.println(employeeArray4);
		
		//case 4
		ArrayList<Employee> arrayList=new ArrayList();
		Employee emp2=new Employee("Pone Pone","Taunggyi");
		arrayList.add(emp2);
		arrayList.add(0, emp1);
		System.out.println(arrayList);
		
		//add all 
		System.out.println("Testing");
		ArrayList<Integer> intList=new ArrayList();
		intList.add(1);
		intList.add(2);
		intList.add(3);
	
		
		ArrayList<Integer> intList2=new ArrayList();
		intList2.add(4);
		intList2.add(5);
		
	    System.out.println("First List: " + intList);
        System.out.println("Second List: " + intList2);

        // Add all 
        intList.addAll(intList2);
        System.out.println("After adding all elements from the second list to the first list: " + intList);
        
        //Add All with index
        intList.addAll(0, intList2);
        System.out.println("Using index add all: " + intList);
        
        //addFirst LinkedList
        intList.addFirst(6);
        System.out.println("Add Frist: "+ intList);
        
        //addLast
        intList.addLast(10);
        System.out.println("Add Last: "+ intList);
        
        //clear
       // intList.clear();
       // System.out.println("LIst 2 clear: "+ intList);
        
        //clone
        ArrayList<Integer> clonedList = (ArrayList) intList2.clone();
        clonedList.add(7);
        // Print both the original and cloned lists
        System.out.println("Original intList2: " + intList2);
        System.out.println("Cloned list with added element: " + clonedList);
        
        // Check if the first list contains a specific element
        boolean contains3 = intList2.contains(3);
        System.out.println("Does the second list contain 3? " + contains3);
        
        //containAll
        boolean containAll =  intList.containsAll(clonedList);
        System.out.println("Does the first list contain cloneList:  " + containAll);
        
        //intList.ensureCapacity(7);
        
       //equal
       boolean equal =  intList.equals(clonedList);
       System.out.println("Does intList equal to cloned List: "+ equal);
       
      // the first list using forEach
      // System.out.println("Elements in the first list using forEach:");
      // intList.forEach(element -> System.out.println(element));
       
       //get
       int element = intList.get(1);//index 
       System.out.println("Element at index 1: " + element);
       
   
       //getClass
      //intList.getClass();
       
       //getFirst
      int firstValue =   intList.getFirst();
      System.out.println("The first value of intList: "+ firstValue);
      
      //getLast
      int lastValue = intList.getLast();
      System.out.println("The last value of intList: "+ lastValue);
      
      // Get the hash code of the intList
    //  int hashCodeValue = intList.hashCode();
     // System.out.println("The hash code of intList is: " + hashCodeValue);
     
      //indexOF
     int index = intList.indexOf(5);
     System.out.println("value 5 is in the index: "+ index);
     
     //isEmpty
     boolean isEmpty= intList.isEmpty();
     System.out.println("is IntList is Empty?: "+ isEmpty);
     
    // intList.iterator();
     
    //add duplicate in intList
     intList.add(1);//index 9 
   
     int lastIndex = intList.lastIndexOf(1); 
     // Print the last index
     System.out.println("The last index of 1 is: " + lastIndex);
     
    //Remove
    int value = intList.remove(9);
    System.out.println("Original list: "+ intList);
    System.out.println("remove index 9 number: "+ value);
    System.out.println("After remove index 9: "+ intList);
    
    // Remove all elements from intList that are in intList
    intList.removeAll(intList2);
    System.out.println("After removing all elements from intList that are in intList2: " + intList);
    
    //Remove first value
   int removeFrist =  intList.removeFirst();
   System.out.println("After removing first value from int list: " + intList);
   
   //list
   int list = intList.size();
    System.out.println("array size: "+ list);
     
    //sorting
    Collections.sort(intList);
    System.out.println("sorting: "+ intList);
   
    //trim to size
     intList.trimToSize();
    System.out.println("trim to size: "+ intList);    
    
    // Retain only elements that are in both intList and intList2
      //intList.retainAll(intList2);
      //System.out.println("After retaining only elements that are in both lists: " + intList);
      
      intList.forEach(e -> {
          e = e * 10;  // Multiply each element by 10
          System.out.println(e + " ");  // Print the modified element
      });     

      
      //Purpose: It tells you what type of object intList is.
      System.out.println( intList.getClass()); //The type of intList is: class java.util.ArrayList
      
    
        
        intList.removeIf(num -> num == 1);
        System.out.println("REmove nuber that are equal with 1: " + intList);
        
        intList.replaceAll(num -> num * 2);
        System.out.println("replace: "+ intList);
        
       
        
        // intList.set(lastIndex, null);
        
        //intList.reversed();
        System.out.println("Original list: " + intList);
        intList.set(2, 100);
        System.out.println("List after setting new value at index 2: " + intList);
        intList.sort(Collections.reverseOrder());
        System.out.println("sorted listed reverse Order: "+ intList);
        intList.sort(null);
        System.out.println("sorted listed natuaral Order: "+ intList);

        //intList.subList(index, lastIndex);
        intList.add(8);
        System.out.println("Original list: " + intList);
        System.out.println(intList.subList(0, 3));
        
        
        // intList.toArray(); convert a list into an array
        Object[] array = intList.toArray();
        System.out.println("Array elements:");
        for (Object obj : array) {
            System.out.println(obj);
        }
        
        //intList.toArray(intFuction<T[]>generator);
        // Converts a list to an array of a specific type.
        // Use ::new to convert the list to an array
        Integer[] array2 = intList.toArray(Integer[]::new);
        for (Integer num : array2) {
            System.out.println(num);
        }
        
     // Convert ArrayList to an Integer array
        Integer[] arr = intList.toArray(new Integer[0]);
        for (Integer num : arr) {
            System.out.println(num);
        }
        
        //intList.toString();
        // Get the string representation of the list
        String listString = intList.toString();
        System.out.println("List contents: " + listString);
        
     // Using Iterator
        Iterator<Integer> it = intList.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator: " + it.next());
        }

        // Using ListIterator
        ListIterator<Integer> it2 = intList.listIterator();
        while (it2.hasNext()) {
            System.out.println("ListIterator: " + it2.next());
        }
        while (it2.hasPrevious()) {
            System.out.println("ListIterator backward: " + it2.previous());
        }
        

        //intList.hashCode();
        System.out.println("hash code: " + intList.hashCode());
    
        
         //intList.parallelStream(): Converts the list into a parallel stream.
        //When working with large data sets, parallel streams can improve performance by utilizing multiple CPU cores.
        //parallelStream() is ideal for speeding up operations on large collections
        intList.parallelStream().forEach(num -> System.out.println(num));
        
        // Create a 
        Spliterator<Integer> spliterator = intList.spliterator();
        spliterator.forEachRemaining(num -> System.out.println("spilterator: " +num));
        
        //stream
        // similar to an iterator but with additional features.
        intList.stream().forEach(num -> System.out.println(num));
        
        ListIterator<Integer> listIterator = intList.listIterator(2);

        // Print elements forward from the starting index
        System.out.println("Forward traversal:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Print elements backward from the current position
        System.out.println("\nBackward traversal:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

         
      //  intList.notify();
        // intList.notifyAll();
  
       // intList.wait();
        //intList.wait(list);

       

        
       
   
       
		
		
		
		
		
		
		
	}

}
