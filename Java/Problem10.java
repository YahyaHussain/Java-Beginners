/*
Print all the unique subsequence in a string:
I/P: aaa
O/P: aaa
     aa
     a
Explanation: unique subsequence among (aaa, aa, aa, a, aa, a, a) are (aaa, aa, a).

I/P: aba
O/P: aba
     ab
     aa
     a
     ba
     b
*/

import java.util.HashSet;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a string: ");
        String sequence = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        System.out.println("List of unique subsequences in " + sequence + ":");
        uniqueSubsequence(sequence, "", set, 0);

        System.out.println();
        sc.close();
    }
    public static void uniqueSubsequence(String sequence, String result, HashSet<String> set, int index) {
        if (index == sequence.length()) {
            if (set.contains(result))   {
                return;
            }
            else{
                System.out.println(result);
                set.add(result);
                return;
            }
        }
        char currChar = sequence.charAt(index);
        // currChar to be in the subsequence
        uniqueSubsequence(sequence, result + currChar, set, index + 1);
        // currChar not to be in the subsequence
        uniqueSubsequence(sequence, result, set, index + 1);
    }
}
