import java.util.Scanner;

public class Basics2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println();

        //int num;

        /*
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int fact = factorial(num);
        if (fact >= 0)  System.out.println(num + " factorail: " + fact);
        */

        /*
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if (isPrime(num))   System.out.println(num + " is a prime number.");
        else    System.out.println(num + " is not a prime number.");
        */

        /*
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        System.out.println("Sum of odd numbers between 1 and " + num + ": " + oddSum(num));
        */

        /*
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        System.out.println("Fibonacci Series upto " + num + " digits: ");
        fibonacciSeries(num);
        */

        /*
        System.out.println("Enter two number: ");
        num = sc.nextInt();
        int num2 = sc.nextInt();
        num2 = GCD(num, num2);
        System.out.println("GCD is : " + num2);
        */

        sc.close();

        System.out.println();
        float seconds = System.currentTimeMillis() / 1000;
        System.out.println("Total execution time: " + seconds);
        System.out.println();
    }

    /*
    public static int factorial(int num) {
        if (num < 0)    {
            System.out.println("Invalid number!");
            return -1;
        }
        else if (num == 0 || num == 1)   return 1;
        else return (num * factorial(num - 1));
    }
    */

    /*
    public static boolean isPrime(int num) {
        if (num <= 1)   return false;

        for (int i = 2; i <= Math.sqrt(num); i++)    {
                if (num % i == 0)   return false;
        }

        return true;
    }
    */

    /*
    private static int oddSum(int num) {
        int sum = 0;
        
        for (int i = 1; i <= num; i++)  {
            if (i % 2 == 0) continue;
            else sum += i;
        }

        return sum;
    }
    */

    /*
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
    */

    /*
    public static int GCD(int num1, int num2) {

        while (num1 != num2) {
            if (num1 > num2) num1 = num1 - num2;
            else    num2 = num2 - num1;
        }
        
        return num2;
    }
    */
}
