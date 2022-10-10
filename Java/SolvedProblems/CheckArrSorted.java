/*
Check if an array is sorted (Strictly increasing):
    I/P: 1,2,3,4,5
    O/P: True

    I/P: 1,2,3,4,4
    O/P: False
*/
package SolvedProblems;

import java.util.Scanner;

public class CheckArrSorted {
    public static boolean chk = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the no.of elements: ");
        int num = sc.nextInt();
        int[] array = new int[num];
        System.out.print("Enter elements into an array: ");
        for (int i = 0; i < array.length; i++)  {
            array[i] = sc.nextInt();
        }
        chk = chkArray(array, 0);
        if (chk)    {
            System.out.println("Array is sorted.");
        }
        else    {
            System.out.println("Array is not sorted.");
        }

        System.out.println();
        sc.close();
    }
    public static boolean chkArray(int[] array, int index) {
        if (index == array.length - 1)   {
            return true;
        }
        if (array[index] < array[index + 1])    {
            return chkArray(array, index + 1);
        }
        else    return false;
    }
}