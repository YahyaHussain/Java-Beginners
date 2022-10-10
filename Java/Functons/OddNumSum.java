package Functons;

import java.util.Scanner;

public class OddNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Sum of odd numbers between 1 and " + num + ": " + oddSum(num));
        
        sc.close();
    }
    public static int oddSum(int num) {
        int sum = 0;
        
        for (int i = 1; i <= num; i++)  {
            if (i % 2 == 0) continue;
            else sum += i;
        }

        return sum;
    }
}