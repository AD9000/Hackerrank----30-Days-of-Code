// Author: Atharv Damle
// Convert a number to binary and count the number of consecutive 1s.
// Full Question: https://www.hackerrank.com/challenges/30-binary-numbers/problem

import java.util.*;
public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        
        int count = 0;
        int max = 0;
        while (n > 1)
        {
            if (n % 2 == 0)
            {
                if (count > max)
                {
                    max = count;
                }
                count = 0;
            }
            else
            {
                count++;
            }
            n = (int)(n/2);
        }
        
        if (n == 1)
        {
            count++;
            if (count > max)
            {
                max = count;
            }
        }
        
        System.out.println(max);
        scanner.close();
    }
}
