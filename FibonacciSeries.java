package week1.day1_20th;

public class FibonacciSeries {


/*
 * Goal: To find Fibonacci Series for a given range
 * 
 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
 * 
 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
 * enter
 * 
 * What are my learnings from this code? 1) 2) 3)
 * 
 */

public static void main(String[] args) {

	int range=8,firstNum =0,secNum=1,sum;// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

	System.out.println("Print the first number"+firstNum);// Print first number
	
	
	for (int i = 1; i < 8; i++) {		// Iterate from 1 to the range
		sum = firstNum + secNum;    // add first and second number assign to sum

		firstNum =secNum;  // Assign second number to the first number

       secNum=sum;          // Assign sum to the second number
	
	System.out.println("Print sum" +firstNum);    // print sum
	}
}	
}

