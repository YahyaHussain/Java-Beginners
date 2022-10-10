package Recursions;

import java.util.Scanner;

public class NumtToPow_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print(num + " raised to the power of ");
        int pow = sc.nextInt();
        int ans;
        ans = numToPower(num, pow);
        System.out.println(ans);

        sc.close();
    }

    public static int numToPower(int num, int pow) {
        if (num == 0)   return 0;
        else if (pow == 0)  return 1;
        else return num * numToPower(num, pow - 1);
    }
}
