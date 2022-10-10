package Functons;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci Series upto " + num + " digits: ");
        fibonacciSeries(num);

        sc.close();
    }
    public static void fibonacciSeries(int num)    {
        int[] fib = new int[num];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < num; i++)  {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 0; i < num; i++)   {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }
}