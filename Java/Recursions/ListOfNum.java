package Recursions;

import java.util.Scanner;

public class ListOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a number to print list of numbers: ");
        int num = sc.nextInt();
        printNumbers(num);

        sc.close();
    }

    public static void printNumbers(int num)    {
        if (num <= 0)   {
            return;
        }
        else    {
            System.out.print(num + " ");
            printNumbers(num - 1);
            if (num == 1)   System.out.println();
            System.out.print(num + " ");
        }
    }
}
