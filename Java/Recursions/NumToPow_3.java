package Recursions;

import java.util.Scanner;

public class NumToPow_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print(num + " raised to the power of ");
        int pow = sc.nextInt();
        int ans;
        ans = numToPow(num, pow);
        System.out.println(ans);

        sc.close();
    }

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
}
