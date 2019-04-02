// Author: Atharv Damle
// To use bitwise operators...Sometimes bitwise operators can lead to amazing solutions!
// Full Question: https://www.hackerrank.com/challenges/30-bitwise-and/problem

import java.io.*;
import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int tItr = 0; tItr < t; tItr++) {
            int and = 0;
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            for (int i = 1; i <= n; i++)
            {
                for (int j = i+1; j <= n; j++)
                {
                    // ----Bitwise and----
                    int temp = i & j;
                    if (temp > and && temp < k)
                    {
                        and = temp;
                    }
                }
            }
            System.out.println(and);
        }
        scanner.close();
    }
}
