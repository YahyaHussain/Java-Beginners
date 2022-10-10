package Functons;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int fact = factorial(num);
        if (fact >= 0)  System.out.println(num + " factorail: " + fact);

        sc.close();
    }
    
    public static int factorial(int num) {
        if (num < 0)    {
            System.out.println("Invalid number!");
            return -1;
        }
        else if (num == 0 || num == 1)   return 1;
        else return (num * factorial(num - 1));
    }
}