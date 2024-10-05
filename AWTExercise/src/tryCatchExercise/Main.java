package tryCatchExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import tryCatchExercise.CheckNumber.OddError;

public class Main {
 public static void main(String[] args) throws NumberFormatException, IOException, OddError{
	 CheckNumber check=new CheckNumber();
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	
    System.out.println("Enter number: ");
     int num = Integer.parseInt(reader.readLine());
     check.checkNumber(num);
	
    
 }
}
