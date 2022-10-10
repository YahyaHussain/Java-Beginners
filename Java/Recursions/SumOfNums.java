package Recursions;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printSumOfNumbers(1, num, 0);

        sc.close();
    }

    public static void printSumOfNumbers(int i, int num, int sum) {
        if (i == num)   {
            sum += i;
            System.out.println("Sum of " + num + " natural numbers: " + sum);
            return;
        }
        else    {
            sum += i;
            printSumOfNumbers(i + 1, num, sum);
        }
    }
}