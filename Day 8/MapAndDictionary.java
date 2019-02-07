// Author: Atharv Damle
// Use Maps as a dictionary.
// Full Question: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

import java.util.*;
import java.io.*;

class MapAndDictionary
{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <String, Integer> dict1 = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            dict1.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (!dict1.containsKey(s))
            {
                System.out.println("Not found");
            }
            else
            {
                System.out.println(s + "=" + dict1.get(s));
            }
        }
        in.close();
    }
}

