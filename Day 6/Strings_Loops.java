/**
Author: Atharv Damle
Full Problem Statement: https://www.hackerrank.com/challenges/30-review-loop/problem
tl;dr: Separate odd and even characters of entered word and print them separately
*/

import java.io.*;
import java.util.*;

public class Strings_Loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < n; j++)
        {
            String s = sc.nextLine();
            String e = "";
            String o = "";
            for (int i = 0; i < s.length(); i++)
            {
                char ch = s.charAt(i);
                if (i % 2 == 0)
                {
                    e = e + ch;
                }
                else
                {
                    o = o + ch;
                }
            }
            System.out.println(e + ' ' + o);
        }
    }
}

