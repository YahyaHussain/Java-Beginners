/*
Print all permutations of a string:
I/P:    abc
O/P:    abc
        acb
        bac
        bca
        cab
        cba
*/
package SolvedProblems;

import java.util.Scanner;

public class PermutationsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Permutation of string " + str + ": ");
        printPermutationsOfString(str, "");

        System.out.println();
        sc.close();
    }

    public static void printPermutationsOfString(String str, String permutationString)   {
        if (str.length() == 0)  {
            System.out.println(permutationString);
            return;
        }
        for (int i = 0; i < str.length(); i++)  {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutationsOfString(newStr, permutationString + currChar);
        }
    }
}