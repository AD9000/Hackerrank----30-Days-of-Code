// Author: Atharv Damle
// Create and use objects.
// Full Question: https://www.hackerrank.com/challenges/30-class-vs-instance/problem

import java.io.*;
import java.util.*;

public class Person {
    private int age;	
  
	public Person(int initialAge) 
        if (initialAge < 0)
        {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else
        {
            age = initialAge;
        }
	}

	public void amIOld() {
		// determining if this person's age is old and print the correct statement:
		// ? is a ternary operator which has the same effect as if - else.
		System.out.println((age >= 18)? "You are old." : (age < 13) ? "You are young." :"You are a teenager.");
	}

	public void yearPasses() {
  		// Increment this person's age.
        age++;
	}

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {
        int age = sc.nextInt();

        // Create object (instance) of the class
        Person p = new Person(age);
        p.amIOld();
        for (int j = 0; j < 3; j++) {
          p.yearPasses();
        }
        p.amIOld();
        System.out.println();
      }
    sc.close();
  }
}
