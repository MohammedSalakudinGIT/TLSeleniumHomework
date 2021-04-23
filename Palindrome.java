package week1.homeworkday2;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String normal="Indian";
		String reverse="";
		int l=normal.length();
		
		for(int i=l-1;i>=0;i--)
		{
			char ch=normal.charAt(i);
			reverse=reverse+ch;
		}
			
			if(normal.equals(reverse))
			{
				System.out.println(normal  +   " is a palindrome");
			}
			else
			{
				System.out.println(normal  +    " is not a palindrome");

			}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
