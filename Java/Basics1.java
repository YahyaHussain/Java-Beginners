import java.util.Scanner;

public class Basics1    {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        //System.out.println("Hello World!");

        //for (int i = 0; i <= 10; i++)   System.out.println(i + " - " + isPrime(i));

        /*
        System.out.print("Enter radius of a circle: ");
        int radius = sc.nextInt();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + ((22 / 7) * radius * radius));
        */

        /*
        System.out.print("Enter a number: ");
        float tabNum = sc.nextFloat();
        for (int i = 1; i <= 10; i++)   {
            System.out.println(tabNum + " * " + i + " = " + (tabNum * i));
        }
        */

        /*
        System.out.print("Enter the month no: ");
        int month = sc.nextInt();
        switch (month)  {
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("September");
            break;
            case 10:    System.out.println("October");
            break;
            case 11:    System.out.println("November");
            break;
            case 12:    System.out.println("December");
            break;
            default:    System.out.println("Invalid month.");
        }
        */

        /*
        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print("Enter the operator: ");
        char operator = sc.next().charAt(0);
        switch (operator)   {
            case '+':   System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            break;
            case '-':   System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            break;
            case '*':   System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            break;
            case '/':   System.out.println(n1 + " / " + n2 + " = " + (n1 / n2);
            break;
            case '%':   System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
            break;
            default:    System.out.println("Invalid operator.");
        }
        */

        /*
        System.out.println("FizzBuzz");
        for (int i = 1; i <= 100; i++)  {
            if (i % 15 == 0)    System.out.println("FizzBuzz");
            else if (i % 3 == 0)    System.out.println("Fizz");
            else if (i % 5 == 0)    System.out.println("Buzz");
            else    System.out.println(i);
        }
        */

        sc.close();

        System.out.println();
    }
/*
    public static boolean isPrime(int num) {
        if (num <= 1)   return false;
        else    {
            for (int i = 2; i <= Math.sqrt(num); i++)   {
                if (num % i == 0)   return false;
            }
            return true;
        }
    }
*/
}
