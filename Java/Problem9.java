/*
Print all sub-sequences in a string:
I/P: abc
O/P: abc
     ab
     ac
     a
     bc
     b
     c
*/

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a string: ");
        String sequence = sc.nextLine();
        subsequence(sequence, "", 0);

        System.out.println();
        sc.close();
    }
    public static void subsequence(String sequence, String result, int index) {
        if (index == sequence.length()) {
            System.out.println(result);
            count++;
            return;
        }
        char currChar = sequence.charAt(index);
        // currChar to be in the sub-sequence
        subsequence(sequence, result + currChar, index + 1);
        // currChar not to be in the sub-sequence
        subsequence(sequence, result , index + 1);
    }
}