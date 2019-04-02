// Author: Atharv Damle
// An extension on if statements.
// Full Question: https://www.hackerrank.com/challenges/30-nested-logic/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Return date: day, month, year
        int rd = sc.nextInt();
        int rm = sc.nextInt();
        int ry = sc.nextInt();
        
        // Due date: day, month, year
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        
        int fine = 0;
        
        if (y == ry)
        {
            if (m == rm)
            {
                if (d < rd)
                {
                    fine = 15 * (rd - d);
                }
            }
            else if (m < rm)
            {
                fine = 500 * (rm - m);
            }
        }
        else if (y < ry)
        {
            fine = 10000;
        }
        
        System.out.println(fine);
        sc.close();
    }
}
