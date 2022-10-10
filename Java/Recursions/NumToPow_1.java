package Recursions;

import java.util.Scanner;

public class NumToPow_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print(num + " raised to the power of ");
        int pow = sc.nextInt();
        numToThePower(num, pow, num);

        sc.close();
    }

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
}
