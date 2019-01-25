/**
Author: Atharv damle
Full Problem statement: https://www.hackerrank.com/challenges/30-operators/problem
tl;dr: Accept the base cost of a meal. Print total after adding in the tip and tax.
*/

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Operators {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        System.out.println(Math.round((meal_cost + meal_cost*((tip_percent + tax_percent)/100.0))));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Accept input.
        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();
        
        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
