package week1.homeworkday2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		// Declare String Input as Follow String test = "changeme"
		/*
		 * a) Convert the String to character array
		 * 
		 * b) Traverse through each character (using loop)
		 * 
		 * c)find the odd index within the loop (use mod operator)
		 * 
		 * d)within the loop, change the character to uppercase, if the index is odd
		 * else don't change
		 */

		String test = "changeme";
		char[] charArray = test.toCharArray();
		int l=charArray.length;
		
		for (int i = 0; i < l; i++) {
			
			if(i%2==0)
			{
				System.out.println(charArray[i]);
			}
			else
			{
				Character.isUpperCase(charArray[i]);
				System.out.println(charArray[i]);

			}
			
		}

	}

}
