// Author: Atharv Damle
// Convert a string to an int and handle an error if it occurs.
// Full Question: https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem

import java.util.*;
public class ExceptionsStrInt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try
        {
            System.out.println(Integer.parseInt(S));
        }
        catch (Exception e)
        {
            System.out.println("Bad String");
        }
    }
}

