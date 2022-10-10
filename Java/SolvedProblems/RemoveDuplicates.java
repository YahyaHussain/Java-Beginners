/*
Remove duplicates in a string:
I/P: abbcccdda
O/P: abcd
*/
package SolvedProblems;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        removeDuplicates(text, "", 0);

        System.out.println();
        sc.close();
    }
    public static boolean[] alphaInArray = new boolean[26];
    public static void removeDuplicates(String text, String result, int index) {
        if (index == text.length()) {
            System.out.println(result);
            return;
        }
        char currChar = text.charAt(index);
        if (alphaInArray[currChar - 'a'])   {
            removeDuplicates(text, result, index + 1);
        }
        else    {
            result += currChar;
            alphaInArray[currChar - 'a'] = true;
            removeDuplicates(text, result, index + 1);
        }
    }
}
