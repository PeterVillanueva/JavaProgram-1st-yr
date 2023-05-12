package Villanueva_Array_Unit7;

import java.util.Scanner;

public class Villanueva_Practical_Test_Average_Sample {

	  public static Scanner scanner= new Scanner(System.in);
	  public static void main(String args[]){ 
		  int[] myIntArray = getIntegers(10); 
		  printArray(myIntArray);       
		  System.out.println("Average is "+getAverage(myIntArray));
		  }    
	  public static int[] getIntegers(int number){
		  System.out.println("Please Enter "+number+" integer values"); 
		  int intArray[] = new int[number]; 
		  for(int i=0; i<number; i++){
			  intArray[i] = scanner.nextInt();
			  }                  
		  return intArray; 
		  }              
	  public static void printArray(int[] intArray){ 
		  for(int i=0; i<intArray.length; i++){
			  System.out.println(intArray[i]);
			  }
		  }   
	  public static double getAverage(int[] intArray){
		  int sum = 0;
		  for(int i=0; i<intArray.length; i++){ 
			  sum += intArray[i];  
			  }                  
		  return (double) sum / (double) intArray.length; 
		  }        
	  
}


