package Functons;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++)   {
            System.out.print(i + " is ");
            if (isNumPrime(i))  {
                System.out.println("prime");
            }
            else    {
                System.out.println("not a prime");
            }
        }
        
        sc.close();
    }

    public static boolean isNumPrime(int num) {
        if (num <= 1)   return false;
        else    {
            for (int i = 2; i <= Math.sqrt(num); i++)   {
                if (num % i == 0)   return false;
            }
            return true;
        }
    }
}