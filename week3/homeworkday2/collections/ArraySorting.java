package week3.homeworkday2.collections;

import java.util.Arrays;

public class ArraySorting {

	
	public static void main(String args[]) {
				
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};

//		get the length of the array
		int al=input.length;

//		sort the array	
		Arrays.sort(input);
		
//		Iterate it in the reverse order
		for (int i = al-1; i>=0; i--) {
			
//			print the array
			
		  System.out.println(input[i]);


		}

	}

}
