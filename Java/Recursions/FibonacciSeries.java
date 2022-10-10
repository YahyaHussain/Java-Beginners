package Recursions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the number of digits for fibonacci series: ");
        int num = sc.nextInt();
        int fib_0 = 0;
        int fib_1 = 1;
        System.out.print(fib_0 + " " + fib_1 + " ");
        fibonacciSeries(fib_0, fib_1, num - 2);

        sc.close();
    }

    public static void fibonacciSeries(int fib_prev_prev, int fib_prev, int num) {
        if (num <= 0)   {
            return;
        }
        int fib_present = fib_prev_prev + fib_prev;
        System.out.print(fib_present + " ");
        fibonacciSeries(fib_prev, fib_present, num - 1);
    }
}
