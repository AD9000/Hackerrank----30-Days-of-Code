/**
Author: Atharv Damle
Full Problem Statement: https://www.hackerrank.com/challenges/30-arrays/problem
tl;dr: Store input in an array. Print array in reverse.
*/

import java.util.*;

public class Arrays {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            arr[i] = arrItem;
        }

        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
