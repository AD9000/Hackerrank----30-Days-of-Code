/**
// Author: Atharv Damle
For full problem statement : https://www.hackerrank.com/challenges/30-data-types/problem
tl;dr: Accept and print variables
*/
import java.io.*;
import java.util.*;
public class DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        double x = 0;
        int y = 0;
        String z = "";
        
        // Accept an integer
        y = scan.nextInt();
        
        // Accept a real number
        x = scan.nextDouble();
        
        // IMPORTANT: Since the nextInt() and nextDouble() do not accept the '\n' character marking the end of a line, 
        // the first nextLine() does not accept the next line, but only till the end of current line when the user
        // pressed the enter key. Thus, two are used.
	// the skip("") function could also be used. Enter characters to be skipped in the double quotes.
        z = scan.nextLine();
        z = scan.nextLine();
        
        
        // Print the sum of both integer variables on a new line.
        System.out.println(i + y);
        // Print the sum of the double variables on a new line.
        System.out.println(d + x);
        
        // The '+' operator when used with strings, joins the two strings.
        System.out.println(s + z);

        scan.close();
    }
}
