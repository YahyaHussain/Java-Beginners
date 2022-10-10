/*
Move all 'x' to the end of the string:
I/P: "axbcdxe"
O/P: "abcdexx"
*/
package SolvedProblems;

import java.util.Scanner;

public class MoveXToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        moveCharToRight(text, "", 0, 0);

        System.out.println();
        sc.close();
    }
    public static void moveCharToRight(String text, String finalString, int index, int count) {
        if (index == text.length()) {
            for (int i = 0; i < count; i++) {
                finalString += 'x';
            }
            System.out.println(finalString);
            return;
        }
        char currChar = text.charAt(index);
        if (currChar == 'x')    {
            count++;
            moveCharToRight(text, finalString, index + 1, count);
        }
        else    {
            finalString += currChar;
            moveCharToRight(text, finalString, index + 1, count);
        }
    }
}