/**
// Author: Atharv Damle
Obligatory Hello World! Program. Print Hello World! to Screen.
One twist: Accept one line and print it to screen too.
*/
import java.io.*;

public class Day_0_HelloWorld {
	public static void main(String[] args) {
    // Create a Scanner object to read input from stdin.
		Scanner in = new Scanner(System.in); 
		
		// Accept a sentence as input
		String inputString = scan.nextLine(); 

		// Close the Scanner object. Not doing this can sometimes lead to errors
		in.close(); 
      
		// Print hello world.
		System.out.println("Hello, World.");
    
    // print the string that was accepted as input.
    System.out.println(inputString);
	}
}

