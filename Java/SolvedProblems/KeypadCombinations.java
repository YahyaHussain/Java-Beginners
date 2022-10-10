/*
Print keypad combination:
General keypad =>
         1      2       3
      .!@#$&^  abc     def
         4      5       6
        ghi    jkl     mno
         7      8       9
        pqrs   tuv     wxyz
                0
             <space>
I/P:    23
O/P:    ad, ae, af
        bd, be, bf
        cd, ce, cf

I/P:    456
O/P:    gjm, gjn, gjo, gkm, gkn, gko, glm, gln, glo
        hjm, hjn, hjo, hkm, hkn, hko, hlm, hln, hlo
        ijm, ijn, ijo, ikm, ikn, iko, ilm, iln, ilo
*/
package SolvedProblems;

import java.util.Scanner;

public class KeypadCombinations {

    public static String[] keypad = {" ", ".!@#$&^", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a keypad number: ");
        String keypadString = sc.nextLine();
        
        System.out.println("Keypad combination of " + keypadString +": ");
        keypadCombination(keypadString, "", 0);

        System.out.println();
        sc.close();
    }

    public static void keypadCombination(String keypadString, String combination, int index)  {
        if (index == keypadString.length())  {
            System.out.println(combination);
            return;
        }
        char currChar = keypadString.charAt(index);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++)  {
            keypadCombination(keypadString, combination + mapping.charAt(i), index + 1);
        }
    }
}