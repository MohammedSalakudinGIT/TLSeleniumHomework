package week3.homeworkday2.collections;

import java.util.HashMap;

public class MapCharactercount {
	
	public static void main(String args[]) {

		String input="welcome to Selenium automation";
		
		//Declaring map
		
		HashMap <Character,Integer>charCount=new HashMap<Character,Integer>();
		
        //Converting string to char array
		
		char[] inputarray=input.toCharArray();
		
        //checking each char of inputarray using foreach
		
		for(char c:inputarray)
		{
            //If char 'c' is present in charCount map's key, it's count will be increased by 1
			if(charCount.containsKey(c))
			{
				charCount.put(c, charCount.get(c)+1);
			}
			else
			{
				//If char 'c' is not present in charCount, putting 'c' into charCount with 1 as it's value
				charCount.put(c, 1);
			}
		}
		
        System.out.println(charCount);

	}

}
