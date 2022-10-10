/*
Write a program that prints the numbers from 1 to 100.
For multiples of ‘3’ print “Fizz” instead of the number,
For the multiples of ‘5’ print “Buzz”,
For multiples of both '5' and '3' print "FizzBuzz".
*/
package SolvedProblems;

import java.util.Scanner;

public class FizzBuzz    {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        
        System.out.println("FizzBuzz");
        for (int i = 1; i <= 100; i++)  {
            if (i % 15 == 0)    System.out.println("FizzBuzz");
            else if (i % 3 == 0)    System.out.println("Fizz");
            else if (i % 5 == 0)    System.out.println("Buzz");
            else    System.out.println(i);
        }
    
        sc.close();
    }
}
