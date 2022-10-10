package Functons;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("Enter two number: ");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        num2 = GCD(num, num2);
        System.out.println("GCD is : " + num2);

        sc.close();
    }
    public static int GCD(int num1, int num2) {

        while (num1 != num2) {
            if (num1 > num2) num1 = num1 - num2;
            else    num2 = num2 - num1;
        }
        
        return num2;
    }
}
