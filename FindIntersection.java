package week1.homeworkday2;

public class FindIntersection {

	public static void main(String[] args) {

		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (should match item in both arrays)
		 */

		int[] a1= {3,2,11,4,6,7};
		int[] a2= {1,2,8,4,9,7};
		
		int l1=a1.length;
		int l2=a2.length;
		
		for(int i=0;i<l1;i++)
		{
			for(int j=0;j<l2;j++)
			{
				if(a1[i]==a2[j]) {
					System.out.println("Matching array");
					System.out.println(a1[i]);
					System.out.println(a2[j]);
			}
				
			
		}
		

		}		

}
}