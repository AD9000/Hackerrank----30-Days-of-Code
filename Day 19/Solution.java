// Author: Atharv Damle
// To learn about interfaces and their implementation
// Full Question: https://www.hackerrank.com/challenges/30-interfaces/problem


// Interface in java is inherited by using the 'implements' keyword
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                sum += i;
            }
        }
        return sum;
    }
}
