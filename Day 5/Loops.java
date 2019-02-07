/**
Author: Atharv Damle
Full problem statement: https://www.hackerrank.com/challenges/30-loops/problem
tl;dr: Print multiplication table of 'n' (Read 'n' from stdin)
*/

import java.util.*;
public class Loops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n + " x " + i + " = " + n*i);
        }

        scanner.close();
    }
}
