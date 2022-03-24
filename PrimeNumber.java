package week1.day1_20th;

public class PrimeNumber {


public static void main(String[] args) {

	int input = 7 ;               // Declare an int Input and assign a value 13
	
	boolean flag = false;           // Declare a boolean variable flag as false

	for (int i = 2; i < input ; i++) {       // Iterate from 2 to half of the input //1 2 3 4 5 6 7 8 9

			if(input % i == 0)    // Divide the input with each for loop variable and check the remainder
{
				flag = true;                   // Set the flag as true when there is no remainder    
	break;  // break the iterator
	}
				}
			
	if (flag == false)
	{
		System.out.println("prime");
	} 
	else
	System.out.println("NOT prime");

}

}