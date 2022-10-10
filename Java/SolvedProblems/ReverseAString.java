/*
Reverse a string using recursion:
I/P: "abcd"
O/P: Reverse: "dcba"
*/
package SolvedProblems;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();
        System.out.print("Reverse: ");
        reverseString(text, text.length() - 1);

        System.out.println();
        sc.close();
    }
    public static void reverseString(String text, int indx) {
        if (indx == 0) {
            System.out.println(text.charAt(0));
            return;
        }
        System.out.print(text.charAt(indx));
        reverseString(text, indx - 1);
    }
}
