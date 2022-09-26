import java.util.Scanner;

public class Sorting    {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the no.of elements: ");
        int no = sc.nextInt();

        int[] arr = new int[no];

        System.out.println("Enter the elements into the array:");
        for (int i = 0; i < arr.length; i++)    {
            arr[i] = sc.nextInt();
        }

        /*  // BUBBLE SORT:
            // i is counter, j is index
            // Largest element gets sorted first
            // Eveytime i increments, the element on ((arr.length - 1) - i) will be in a sorted position
            // Time complexity: O(n^2)
        for (int i = 0; i < arr.length - 1; i++)    {
            for (int j = 0; j < ((arr.length - 1) - i); j++)    {
                if (arr[j] > arr[j + 1])    {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.print("j -> ");
                printArray(arr);
            }
            System.out.print("i -> ");
            printArray(arr);
        }
        printArray(arr);
        */
        

        /*  // SELECTION SORT:
            // Eveytime i increments, the element on i position will be sorted
            // Time complexity: O(n^2)
        for (int i = 0; i < arr.length - 1; i++)    {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++)    {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        printArray(arr);
        */

        /*    // INSERTION SORT:

        for (int i = 1; i < arr.length; i++)    {
            int current = arr[i];
            int j = i - 1;
            while ((j >= 0) && (current < arr[j]))  {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        printArray(arr);
        */
        

        System.out.println();
        sc.close();
    }

    public static void printArray(int[] arr)   {
        System.out.print("Array:\n[ ");
        for (int i = 0; i < arr.length; i++)    {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}