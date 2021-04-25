package week1.homeworkday2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Build a logic to reverse the even position words (output: I ma a erawtfos
		// tester)

		/*
		  Pseudo Code:
		  
		  Declare the input as Follow String test = "I am a software tester"; a) split
		  the words and have it in an array b) Traverse through each word (using loop)
		  c) find the odd index within the loop (use mod operator)
		  
		  d)split the words and have it in an array
		  
		  e)print the even position words in reverse order using another loop (nested
		  loop) f) Convert words to character array if the position is even else print
		  the word as it is(concatenate space at the end).
		  */
		  
		 

		String input = "I am a software tester";

		String[] split = input.split(" ");

		int l = split.length;
		
		String output="";
		
		String reverse="";
		
		for (int i = 0; i <l; i++) {

			if (i % 2 == 0) {
				
				char[] charArray = (split[i]).toCharArray();
				
				int l1=charArray.length;

				for (int j = l1 - 1; j >= 0; j--) {
				
				 reverse=reverse+charArray[j];	

				}
				
				output=output+reverse;
			}

			else {
				System.out.println(output+ ""  +split[i]);

			}
		}

		
			
		}
	

}
