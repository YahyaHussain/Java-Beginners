import java.util.Scanner;

public class Strings    {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        /*
        System.out.print("Enter your username: ");
        String username = sc.nextLine();

        System.out.println("Welcome, " + username);
        */

        //  Strings are immutable.
        //  .length() is used for Strings and .length is used for arrays.
        //  variables are stored in stack.
        //  values (of variables) are stored in heap.
        //  Strings take more time to perform operations than StringBuilder. 

        //  INPUT STRINGBUILDER --> 1
        System.out.print("Enter username: ");
        StringBuilder name = new StringBuilder(sc.nextLine());

        for (int i = 0; i < name.length() / 2; i++) {

            int front = i;
            int back = name.length() - 1 - i;

            char frontChar = name.charAt(front);
            char backChar = name.charAt(back);

            name.setCharAt(front, backChar);
            name.setCharAt(back, frontChar);
        }

        System.out.println("Reverse: " + name);

        System.out.println();
        sc.close();
    }
}