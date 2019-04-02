// Author: Atharv Damle
// To find emails in an input...using regEx (Regular Expressions)
// Full Question: https://www.hackerrank.com/challenges/30-regex-patterns/problem

import java.io.*;
import java.math.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.nextLine();

        LinkedList<String> names = new LinkedList<String>();
        
        // Load pattern: The pattern is the regex used.
        Pattern p = Pattern.compile(".*@gmail\\.com$");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            // Match pattern
            Matcher m = p.matcher(emailID);
            if (m.find())
            {
                names.add(firstName);
            }
        }

        // Sort the names for displaying purposes. Use the Collections Library...
        Collections.sort(names);
        while(!names.isEmpty())
        {
            System.out.println(names.remove());
        }

        scanner.close();
    }
}
