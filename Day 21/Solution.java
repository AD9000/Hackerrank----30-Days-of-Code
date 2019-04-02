// Author: Atharv Damle
// To implement a function which accepts an array of any (generic) data type and prints it to stdout.
// Full Question: https://www.hackerrank.com/challenges/30-generics/problem


    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    <T> void printArray(T[] a)
    {
        for (T element : a)
        {
            System.out.println(element);
        }
    }

