// Author: Atharv Damle
// To see how different scopes affect programs. Scope is the code block in which a defined variable can be accessed.
// Here the elements array is private. Since it is a global varible too, it can only be accessed inside the class.
// Full Question: https://www.hackerrank.com/challenges/30-scope/problem

Difference (int a[])
{
    elements = new int[a.length];
    for (int i = 0; i < a.length; i++)
    {
        elements[i] = a[i];
    }
}

void computeDifference()
{
    for (int i = 0; i < elements.length - 1; i++)
    {
        int find = elements[i];
        for (int j = i+1; j < elements.length; j++)
        {
            int diff = Math.abs(elements[j] - find);
            if (maximumDifference < diff)
            {
                maximumDifference = diff;
            }   
        }
    }
}
