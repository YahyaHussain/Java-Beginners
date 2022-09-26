/*
Find the first and last occurence of character in string:
I/P: "abaacaaade"
character: "a"
O/P: First occurence: 0
     Last occurence: 7
*/

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();
        System.out.print("Enter a character / text: ");
        String targetDummy = sc.next();
        char target = targetDummy.charAt(0);
        targetInText(text, target, 0);

        System.out.println();
        sc.close();
    }

    public static int first = -1;
    public static int last = -1;
    public static void targetInText(String text, char target, int indx) {
        if (indx == text.length())  {
            System.out.println("First occurence: " + first);
            System.out.println("Last Occurence: " + last);
            return;
        }
        char currChar = text.charAt(indx);
        if (currChar == target) {
            if (first == -1)    {
                first = indx;
            }
            else    {
                last = indx;
            }
        }
        targetInText(text, target, indx + 1);
    }
}