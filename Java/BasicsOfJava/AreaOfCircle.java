package BasicsOfJava;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter radius of a circle: ");
        int radius = sc.nextInt();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + Math.ceil(3.14285714 * (radius * radius)));

        sc.close();
    }
}