package week1.day1_20th;

import java.util.Iterator;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				/*
			 * Goal: Find the Factorial of a given number
			 * 
			 * input: 5
			 * output: 5*4*3*2*1 = 120
			 * 
			 * Shortcuts:
			 * 1) Print : type: syso, followed by: ctrl + space + enter
			 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
			 *   
			 * What are my learnings from this code?
			 * 1)
			 * 2)
			 * 3) 
			 * 
			 */	
	long input =5l;
				// Declare your input as 5
				
	int fact= 1;			
				// Declare an integer variable fact as 1
				
for (int i = 1; i <= 5 ; i++) {    // Iterate from 1 to your input (tip: using loop concept)
	

	fact= fact*i;         // Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)

	System.out.println("Each Step factorial  " +fact);
}          		//End of loop
				
System.out.println( "\n"+ " Print factorial   "+fact);				// Print factorial (fact)
			

			}
}



