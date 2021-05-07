package week3.homeworkday2.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDuplicatesRemoval {

	
	public static void main(String args[]) {
		
		
//		Declare a String as PayPal India
		
		String input="PayPal India";

//		Convert it into a character array
		char[] charArray = input.toCharArray();

//		Declare a Set as charSet for Character
	      Set <Character>charSet = new HashSet<Character>();

//		Declare a Set as dupCharSet for duplicate Character
	      Set <Character>dupCharSet = new HashSet<Character>();

//		Iterate character array and add it into charSet
	      for (int i = 0; i < charArray.length; i++) {
	    	  
	    	  char c = charArray[i];
	    	  
	    	  if(c !=' ')
	    	  
	    	  {
		    	  charSet.add(new Character(charArray[i]));  
	    	  }
	    	 
	    	  	    	  
//	   If the character is already in the charSet then, add it to the dupCharSet

	    	  if(charSet.contains(charArray[i]))
	    	  {
	    		  dupCharSet.add(new Character(charArray[i]));
	    	  }	    	  
	      }
//			Check the dupCharSet elements and remove those in the charSet

	      if(dupCharSet.equals(charSet))
	      {
	    	  charSet.remove(dupCharSet);
	      }
	      
//			Iterate using charSet
	      
//			Check the iterator variable isn't equals to an empty space

//			print each character for charSet
	      
	        Iterator charvalue = charSet.iterator();
	        
	        System.out.println("The charset values are: ");
	        while (charvalue.hasNext()) {
	       
		            System.out.println(charvalue.next());
	        	}
	        

	}

}
