package BasicsOfJava;

import java.util.Scanner;

public class NumTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a number: ");
        float tabNum = sc.nextFloat();
        for (int i = 1; i <= 10; i++)   {
            System.out.println(tabNum + " * " + i + " = " + (tabNum * i));
        }
        
        sc.close();
    }
}