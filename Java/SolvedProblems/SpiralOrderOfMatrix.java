/*
Given a matrix of 'rows x cols' elements, return all elements of matrix in spiral order.
//      1   2   3   4   5

// 1    1   2   3   4   5
// 2    6   7   8   9   10
// 3    11  12  13  14  15
// 4    16  17  18  19  20
// 5    21  22  23  24  25

// O/P: 1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13
*/
package SolvedProblems;

import java.util.Scanner;

public class SpiralOrderOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter no of rows and cols: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements in the matrix:");
        for (int i = 0; i < rows; i++)  {
            for (int j = 0; j < cols; j++)  {
                matrix[i][j] = sc.nextInt();
            }
        }

        int size = rows * cols;

        int[] nums = new int[size];

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        
        int index = 0;

        while (top <= bottom && left <= right)  {

            for (int i = left; i <= right && index < size; i++) {
                nums[index] = matrix[top][i];
                index++;
            }
            top++;

            for (int i = top; i <= bottom && index < size; i++) {
                nums[index] = matrix[i][right];
                index++;
            }
            right--;

            for (int i = right; i >= left && index < size; i--) {
                nums[index] = matrix[bottom][i];
                index++;
            }
            bottom--;

            for (int i = bottom; i >= top && index < size; i--) {
                nums[index] = matrix[i][left];
                index++;
            }
            left++;
        }

        System.out.println("Spiral matrix: ");
        for (int i = 0; i < size; i++)  {
            System.out.print(nums[i] + " ");
        }


        System.out.println();
        sc.close();        
    }
}