import java.util.Scanner;

public class SortingPractice    {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the no.of elements: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < arr.length; i++)    {
            arr[i] = sc.nextInt();
        }

        System.out.println("Choose..\n1\tAscending\n2\tDescending");
        int choice = sc.nextInt();

        System.out.println("Choose an algorithm..\n1\tBubble Sort\n2\tSelection Sort\n3\tInsertion Sort");
        int algoChoice = sc.nextInt();

        if (choice == 1)    {
            switch (algoChoice) {
                case 1: ascendBubbleSort(arr);
                break;
                case 2: ascendSelectionSort(arr);
                break;
                case 3: ascendInsertionSort(arr);
                break;

                default: System.out.println("Invalid algorithm.");
            }
        }
        else if (choice == 2)   {
            switch (algoChoice) {
                case 1: descendBubbleSort(arr);
                break;
                case 2: descendSelectionSort(arr);
                break;
                case 3: descendInsertionSort(arr);
                break;

                default: System.out.println("Invalid algorithm.");
            }
        }
        else    {
            System.out.println("Invalid choice!");
        }
        sc.close();
        System.out.println();
    }
    public static void printArray(int[] arr) {

        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++)    {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    public static void ascendBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)    {
            for (int j = 0; j < (arr.length - 1) - i; j++)  {
                if (arr[j] > arr[j + 1])    {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void descendBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)    {
            for (int j = 0; j < (arr.length - 1) - i; j++)  {
                if (arr[j] < arr[j + 1])    {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void ascendSelectionSort(int[] arr) {
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
    }
    public static void descendSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)    {
            int greatest = i;
            for (int j = i + 1; j < arr.length; j++)    {
                if (arr[greatest] < arr[j]) {
                    greatest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[greatest];
            arr[greatest] = temp;
        }
        printArray(arr);
    }
    public static void ascendInsertionSort(int[] arr)   {
        for (int i = 1; i < arr.length; i++)    {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j])   {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        printArray(arr);
    }
    public static void descendInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++)    {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current > arr[j])  {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        printArray(arr);
    }
}