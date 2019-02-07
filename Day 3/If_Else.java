/**
Author: Atharv Damle
Full Problem Statement: https://www.hackerrank.com/challenges/30-conditional-statements/problem
*/

import java.io.*;
import java.util.*;

public class If_Else {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
               
        if (N % 2 != 0 || N % 2 == 0 && N > 5 && N < 21)
        {
            System.out.println("Weird");
        }
        else
        {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
