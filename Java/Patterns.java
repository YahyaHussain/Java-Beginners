import java.util.Scanner;

public class Patterns {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        
        //int rows, cols;

        /*
        System.out.print("Enter the rows in solid rectangle: ");
        rows = sc.nextInt();

        System.out.print("Enter the cols in solid rectangle: ");
        cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        //      1   2   3   4   5
        // 1    *   *   *   *   *
        // 2    *   *   *   *   *
        // 3    *   *   *   *   *
        // 4    *   *   *   *   *
        */        

        /*
        System.out.print("Enter the rows in hollow rectangle: ");
        rows = sc.nextInt();

        System.out.print("Enter the cols in hollow rectangle: ");
        cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
           
            for (int j = 1; j <= cols; j++) {
                
                if ((i > 1 && i < rows) && (j > 1 && j < cols))   {
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }

            System.out.println();
        }

        //      1   2   3   4   5
        // 1    *   *   *   *   *
        // 2    *               *
        // 3    *               *
        // 4    *   *   *   *   *
        */

        /*
        System.out.print("Enter the rows in half pyramid: ");
        rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        //     1   2   3   4   5
        // 1   *
        // 2   *   *
        // 3   *   *   *
        // 4   *   *   *   *
        // 5   *   *   *   *   *
        */
        
        /*
        System.out.print("Enter the rows in inverted pyramid: ");
        rows = sc.nextInt();

        for (int i = rows; i > 0; i--) {
            
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        //     1   2   3   4   5
        // 1   *   *   *   *   *
        // 2   *   *   *   *
        // 3   *   *   *
        // 4   *   *
        // 5   *
        */
        
        /*
        System.out.print("Enter the rows in inverted half pyramid: ");
        rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {
            
            for (int j = 1; j < i; j++) System.out.print("  ");
            
            for (int j = 0; j <= rows - i; j++)  System.out.print("* ");
            
            System.out.println();
        }

        //      1   2   3   4
        // 1                *
        // 2            *   *
        // 3        *   *   *
        // 4    *   *   *   *
        */
        
        /*
        System.out.print("Enter the rows in Floyd's triangle: ");
        rows = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++)    {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }

        //      1   2   3   4
        // 1    1
        // 2    2   3
        // 3    4   5   6
        // 4    7   8   9   10
        */        

        /*
        System.out.print("Enter the rows in 0 - 1 triangle: ");
        rows = sc.nextInt();

        for (int i = 1; i <= rows; i++)    {
            
            for (int j = 1; j <= i; j++)    {
                
                if (((i + j) % 2) == 0) System.out.print("1 ");
                else System.out.print("0 ");                
            }

            System.out.println();
        }

        //      1   2   3   4   5
        // 1    1
        // 2    0   1
        // 3    1   0   1
        // 4    0   1   0   1
        // 5    1   0   1   0   1
        */
        
        /*
        System.out.print("Enter the rows in inverted half pyramid with numbers: ");
        rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        //     1   2   3   4   5
        // 1   1   2   3   4   5
        // 2   1   2   3   4
        // 3   1   2   3
        // 4   1   2
        // 5   1
        */
        
        /*
        System.out.print("Enter the rows in rhombus: ");
        rows = sc.nextInt();
        cols = 2 * rows;

        for (int i = 1; i <= rows; i++)    {
            
            for (int j = 1; j <= cols; j++) {
                
                if ((i < rows) && (j <= rows - i)){
                    System.out.print("  ");
                    continue;
                }
               
                if ((j <= cols) && (j <= cols - i)){
                    System.out.print("* ");
                    continue;
                }
            }

            System.out.println();

        /*
        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++)    {
                System.out.print(" " + i);
            }

            System.out.println();
        }
        *//*
        }

        //     1   2   3   4   5   6   7   8   9
        // 1                   *   *   *   *   *
        // 2               *   *   *   *   *
        // 3           *   *   *   *   *
        // 4       *   *   *   *   *
        // 5   *   *   *   *   *
        */
        
        /*
        System.out.print("Enter the rows in pyramid: ");
        rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++)    {
                System.out.print(" " + i);
            }

            System.out.println();
        }

        //      1 2 3 4 5 6 7 8 9
        // 1            1
        // 2          2   2
        // 3        3   3   3
        // 4      4   4   4   4
        // 5    5   5   5   5   5
        */        

        /*
        System.out.print("Enter the rows in palindromic number pyramid: ");
        rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            for(int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
  
            for(int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        //      1 2 3 4 5 6 7 8 9
        // 1            1
        // 2          2 1 2
        // 3        3 2 1 2 3
        // 4      4 3 2 1 2 3 4
        // 5    5 4 3 2 1 2 3 4 5
        */

        /*
        System.out.print("Enter the rows in butterfly pattern: ");
        rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++)    {
                System.out.print("* ");
            }

            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++)   {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++)    {
                System.out.print("* ");
            }
            
            System.out.println();
        }

        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= i; j++)    {
                System.out.print("* ");
            }

            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++)   {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--)    {
                System.out.print("* ");
            }

            System.out.println();
        }


        //      1 2 3 4 5 6 7 8
        // 1    *             *
        // 2    * *         * *
        // 3    * * *     * * *
        // 4    * * * * * * * *
        // 5    * * * * * * * *
        // 6    * * *     * * *
        // 7    * *         * *
        // 8    *             *
        */

        sc.close();

        System.out.println();
    }
}
