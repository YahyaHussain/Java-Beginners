/*
Assume there is an ant, it climbs 4 meters and then suddenly slips by 3 meters in 1 minute time, how much time will it take to climb 40 meters?
*/

import java.util.Scanner;

public class Problem1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the distance travelled: ");
        int meter = sc.nextInt();
        int min = 0;
        for (int i = 1; i <= meter; i++) {
            min = min + 4;

            if (min == meter)   {
                min = i;
                break;
            }

            min = min - 3;
        }

        System.out.println("Time taken to climb: " + min + " min");

        System.out.println();
        sc.close();
    }
}