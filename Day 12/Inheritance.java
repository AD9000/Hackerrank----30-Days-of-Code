// Author: Atharv Damle
// Extend a class and calculate grades.
// Full Question: https://www.hackerrank.com/challenges/30-inheritance/problem

class Student extends Person{
	private int[] testScores;

    /*	
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    Student(String firstName, String lastName, int id, int testScores[])
    {
        super(firstName, lastName, id);
        this.testScores = new int[testScores.length];
        for (int i = 0; i < testScores.length; i++)
        {
            this.testScores[i] = testScores[i];
        }
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    char calculate()
    {
        int sum = 0;
        for (int i = 0; i < testScores.length; i++)
        {
            sum += testScores[i];
        }
        
        double avg = sum/testScores.length;
        if (avg >= 90)
        {
            return 'O';
        }
        else if (avg >= 80)
        {
            return 'E';
        }
        else if (avg >= 70)
        {
            return 'A';
        }
        else if (avg >= 55)
        {
            return 'P';
        }
        else if (avg >= 40)
        {
            return 'D';
        }
        else
        {
            return 'T';
        }
    }
}
