// Author: Atharv Damle
// To find the best algorithm (in time complexity) to check whether a number is prime or not.
// Full Question: https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
        // Further optimization: use BufferedReader for input!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int div = 2;
            boolean check = true;
            int a = sc.nextInt();
            if (a == 1)
            {
                
                check = false;
            }
            
            // Using the general algorithm. (Congrats on finding it!!)
            // However when j = sqrt(a), a/div is minimum. div will not be
            // greater than sqrt(a) anyway. So by storing it in a variable
            // You dont calculate it everytime
            
            //
            
            for (int j = 2; j <= a/div; j++)
            {
                if (a % j == 0)
                {
                    check = false;
                    break;
                }
                else if (j > div)
                {
                    div = j;
                }
            }
            
            /*
            // Most efficient: sqrt(a)
            int s = (int)Math.sqrt(a);
            for (int j = 2; j <= s; j++)
            {
                if (a % j == 0)
                {
                    check = false;
                    break;
                }
            }
            */
            if (check)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not prime");
            }
        }
        
    }
}




