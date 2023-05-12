package Villanueva_Array_Unit7;

import java.util.Scanner;

public class Villanueva_Practical_Test_Sort_Sample {

	public static Scanner scanner= new Scanner(System.in);
	public static void main(String args[]){ 
		int[] myIntArray = getIntegers(10);
		sortArray(myIntArray);
		printArray(myIntArray);
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
		System.out.println("Ascending Order: "); 
		for(int i=0; i<intArray.length; i++){ 
			System.out.println(intArray[i]); 
			}     
		}         
	public static void sortArray(int[] intArray){ 
		boolean flag = true;   
		while(flag){  
			flag= false; 
			for(int i=0; i< intArray.length-1; i++){
				if(intArray[i] >= intArray[i+1]){ 
					int temp = intArray[i];  
					intArray[i] = intArray[i+1]; 
					intArray[i+1] = temp;    
					flag = true;         
					
				}    
				
			}          
			
		}      
	}
}
	 
	
