// Author: Atharv Damle
// Program to practice throwing Exceptions.
// full question: https://www.hackerrank.com/challenges/30-more-exceptions/problem

class NegativeException extends Exception
{
    public String getMessage()
    {
        return "n and p should be non-negative";
    }
}

class Calculator
{
  static int power(int n, int p) throws NegativeException
  {
      if (n < 0 || p < 0)
      {
          throw new NegativeException();
      }
    return (int)(Math.pow(n,p));
  }
}
