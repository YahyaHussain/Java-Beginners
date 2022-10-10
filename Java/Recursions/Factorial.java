package Recursions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();
        factorial(1, num, 1);

        sc.close();
    }

    public static void factorial(int i, int num, int fact) {
        if (i == num)   {
            fact *= i;
            System.out.println(fact);
            return;
        }
        else    {
            fact *= i;
            factorial(i + 1, num, fact);
        }
    }
}
