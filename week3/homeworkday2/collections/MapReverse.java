package week3.homeworkday2.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MapReverse {
	
	public static void main(String args[]) {
		
		
		/*Emp_id|Emp_name
		100	Hari
		101 Naveen
		102	Sam
		104	Balaji*/
		
		//Declaring map
		        
		HashMap <String,String>empDetails=new HashMap<String,String>();
		
		empDetails.put("100", "Hari");
		empDetails.put("101", "Naveen");
		empDetails.put("102", "Sam");
		empDetails.put("103", "Balaji");
		
		System.out.println("Before Reversing of Map");
		
        // getting keySet() into Set
        Set<String> set = empDetails.keySet();
        
        // get Iterator from key set
        Iterator<String> itr = set.iterator();

        // iterating as per Insertion Order
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println("Key : " + key + "\t\t"
                               + "Value : " + empDetails.get(key));
        }
		
		System.out.println("After Reversing of Map");
		
		 // convert to ArrayList of key set
        List<String> allKeys= new ArrayList<String>(empDetails.keySet());
  
        // reverse order of keys
        Collections.reverse(allKeys);
        
        // Using foreach iterating empDetails using reverse order of keys
        for (String empkey : allKeys) {
            System.out.println("Key : " + empkey + "\t\t"
                               + "Value : "
                               + empDetails.get(empkey));
        }

	}

}
