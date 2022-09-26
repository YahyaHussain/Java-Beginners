import java.util.Scanner;

public class Recursions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        // int num;
        
        /*
        System.out.print("Enter a number to print list of numbers: ");
        num = sc.nextInt();
        printNumbers(num);
        */

        /*
        System.out.print("Enter a number to find sum of natural numbers: ");
        num = sc.nextInt();
        printSumOfNumbers(1, num, 0);
        */

        /*
        System.out.print("Enter a number to find factorial: ");
        num = sc.nextInt();
        factorial(1, num, 1);
        */

        /*
        System.out.print("Enter the number of digits for fibonacci series: ");
        num = sc.nextInt();
        int fib_0 = 0;
        int fib_1 = 1;
        System.out.print(fib_0 + " " + fib_1 + " ");
        fibonacciSeries(fib_0, fib_1, num - 2);
        */

        /*
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        System.out.print(num + " raised to the power of ");
        int pow = sc.nextInt();
        numToThePower(num, pow, num);
        int ans;
        ans = numToPower(num, pow);
        System.out.println(ans);
        ans = numToPow(num, pow);
        System.out.println(ans);
        */

        sc.close();
        System.out.println();
    }
    /*
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
    */
    /*
    public static void printSumOfNumbers(int i, int num, int sum) {
        if (i == num)   {
            sum += i;
            System.out.println(sum);
            return;
        }
        else    {
            sum += i;
            printSumOfNumbers(i + 1, num, sum);
        }
    }
    */
    /*
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
    */
    /*
    public static void fibonacciSeries(int fib_prev_prev, int fib_prev, int num) {
        if (num <= 0)   {
            return;
        }
        int fib_present = fib_prev_prev + fib_prev;
        System.out.print(fib_present + " ");
        fibonacciSeries(fib_prev, fib_present, num - 1);
    }
    */
    /*
    public static void numToThePower(int num, int pow, int ans)  {
        if (pow == 0)   {
            System.out.println(1);
            return;
        }
        else if (num == 0)   {
            System.out.println(0);
            return;
        }
        else if (pow == 1)  {
            System.out.println(ans);
            return;
        }
        ans *= num;
        numToThePower(num, pow - 1, ans);
    }
    */
    /*
    public static int numToPower(int num, int pow) {
        if (num == 0)   return 0;
        else if (pow == 0)  return 1;
        else return num * numToPower(num, pow - 1);
    }
    */
    /*
    public static int numToPow(int num, int pow) {
        if (pow == 0)   return 1;
        else if (num == 0)  return 0;
        else    {
            if (pow % 2 == 0)   {
                return numToPow(num, pow / 2) * numToPow(num, pow / 2);
            }
            else    {
                return numToPow(num, pow / 2) * numToPow(num, pow / 2) * num;
            }
        }
    }
    */
}