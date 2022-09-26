/*
Tower of hanoi using recursion:
Rules:
    1. Only one disk transferred in 1 step
    2. Smaller disks are always kept on top of larger disks

S -> Source
H -> Helper
D -> Destination

            |   |
          1 |   |
          2 |   |
          3 |   |   
        ------------
          S   H   D
    O/P:
            |   |
            |   | 1
            |   | 2
            |   | 3  
        ------------
          S   H   D
*/

import java.util.Scanner;

public class Problem3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter the no.of discs in tower of hanoi: ");
    int num = sc.nextInt();
    towerOfHanoi(num, "S", "H", "D");

    System.out.println();
    sc.close();
  }
  public static void towerOfHanoi(int num, String src, String helper, String dest)  {
    if (num == 1) {
      System.out.println("Disc " + num + " transferred from " + src + " to " + dest);
      return;
    }
    towerOfHanoi(num - 1, src, dest, helper);
    System.out.println("Disc " + num + " transferred from " + src + " to " + dest);
    towerOfHanoi(num - 1, helper, src, dest);
  }
}