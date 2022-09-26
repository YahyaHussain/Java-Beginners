import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        /*
            Bit manipulation:
                1.  Get (Retrieve a bit or a digit from bits or number)
                2.  Set (Set the bit as 1)
                3.  Clear   (Set the bit as 0)
                4.  Update  (Change the bit)
        */

        // int num;

        /*
            GET BIT:
            bit_mask: 1 << i    (1 left_shift i)    here i is the index or position
            Operation: AND
            if (afterOperation == 0): Bit at position i is 0
            if (afterOperation != 0): Bit at position i is 1
            //  Get the 3rd bit (or position 2) of a number n => (0101) in binary.
                i = 2
                n=>     0   1   0   1
                index=> 3   2   1   0
                bit_mask => (1 << 2) = 0100
                Operation => (0101 & 0100) = 0100
                Since, (Operation != 0)    Bit at position 2 is 1.
        */
        
        // System.out.print("Enter a number: ");
        // num = sc.nextInt();
        // System.out.print("Enter the index of bit to be retrieved: ");
        // int n = sc.nextInt();
        // int bitMask = 1 << n;
        // if ((num & bitMask) == 0) System.out.println("Bit at " + n + " index: 0");
        // else    System.out.println("Bit at " + n + " index: 1");
        

        /*
            SET BIT:
            bit_mask: 1 << i    (1 left_shift i)    here i is the index or position
            Operation: OR
            After operation you get number with set bit at index i.
            //  Set the 2nd bit (or position 1) of a number n => (0101) in binary.
                i = 1
                n=>     0   1   0   1
                index=> 3   2   1   0
                bit_mask => (1 << 1) = 0010
                Operation => (0101 | 0010) = 0111
                0111 is the number with set bit at index 1.
        */

        // System.out.print("Enter a number: ");
        // num = sc.nextInt();
        // System.out.print("Enter the index of bit to set: ");
        // int n = sc.nextInt();
        // int bitMask = 1 << n;
        // System.out.println("Number after set bit: " + (num | bitMask));


        /*
            CLEAR BIT:
            bit_mask: 1 << i    (1 left_shift i)    here i is the index or position
            Operation: NOT (bit_mask) and then AND
                    ~bit_mask  (1s complement of bit_mask)
                    n & (~bit_mask) (AND operation with inverted bit_mask)
            After operation you get number with clear bit at index i.
            //  Clear the 3rd bit (or position 2) of a number n => (0101) in binary.
                i = 2
                n=>     0   1   0   1
                index=> 3   2   1   0
                bit_mask => (1 << 2) = 0100
                            ~0100 => 1011
                operation => (0101 & 1011) = 0001
                After operation you get number with clear bit at index i.

        */
        
        // System.out.print("Enter a number: ");
        // num = sc.nextInt();
        // System.out.print("Enter the index of bit to clear: ");
        // int n = sc.nextInt();
        // int bitMask = 1 << n;
        // bitMask = ~bitMask;
        // System.out.println("Number after clear bit: " + (num & bitMask)/*(num & ~bitMask)*/);
        

        /*
            UPDATE BIT:
            bit_mask: 1 << i    (1 left_shift i)    here i is the index or position
            Operation:
                    for 0:  NOT (bit_mask) and then AND
                    for 1:  OR
            After operation your number gets updated with either 1 or 0.
            //  Update the 3rd bit (or position 2) of a number n => (0101) in binary with 0.
                i = 2
                n=>     0   1   0   1
                index=> 3   2   1   0
                bit_mask => (1 << 2) = 0100
                            ~0100 = 1011
                operation => (0101 & 1011) = 0001
                After operation you get number with the  positional bit updated or cleared.
            //  Update the 2nd bit (or position 1) of a number n => (0101) in binary with 1.
                i = 1
                n=>     0   1   0   1
                index=> 3   2   1   0
                bit_mask => (1 << 2) = 0010
                operation => (0101 | 0010) = 0111
                After operation you get number with the  positional bit updated or set.
        */

        // System.out.print("Enter a number: ");
        // num = sc.nextInt();
        // System.out.print("Enter the index of bit to update: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the bit to be updated with: ");
        // int bit = sc.nextInt();
        // int bitMask = 1 << n;
        // if (bit == 0)   {
        //     bitMask = ~bitMask;
        //     System.out.println("Number after bit update: " + (num & bitMask)/*(num & ~bitMask)*/);
        // }
        // else if (bit == 1)   {
        //     System.out.println("Number after bit update: " + (num | bitMask));
        // }
        // else    System.out.println("Invalid state! Bit can either be 0 or 1");

        // System.out.print("Enter a number: ");
        // int no = sc.nextInt();
        // boolean powOf2 = isPowOf2(no);
        // if (powOf2) System.out.println(no + " is a power of 2.");
        // else    System.out.println(no + " is not a power of 2.");


        /*  // TOGGLE:
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.print("Enter the index of bit to toggle: ");
        int n = sc.nextInt();
        int bit_mask = 1 << n;
        int no = num & bit_mask;
        if (no == 0)    {
            System.out.println(num + " after toggle at " + n + " index: " + (num | bit_mask));
        }
        else    {
            bit_mask = ~bit_mask;
            System.out.println(num + " after toggle " + n + " index: " + (num & bit_mask));
        }
        */

        /*  // Minimum no.of bits required to represent an integer in binary:
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            count += 1;
            num = num >> 1;
        }
        System.out.println("Minimum no.of bits required: " + count);
        */

        /*  // No.of set bits in an integer:
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num = num >> 1;
        }
        System.out.println("No.of 1's: " + count);
        */

        /*  // No.of clear bits in an integer:
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 0) count += 1;
            num = num >> 1;
        }
        System.out.println("No.of 0's: " + count);
        */

        /*
        System.out.print("Enter a binary number: ");
        num = sc.nextInt();
        int decimal = binaryToDecimal(num);
        System.out.println(num + " in decimal: " + decimal);
        */

        /*
        System.out.print("Enter a decimal number: ");
        num = sc.nextInt();
        if (num == 0)   {
            System.out.println(num + " in binary:\n[ 0 ]");    
        }
        else    {
            int[] decimal = decimalToBinary(num);
            System.out.print(num + " in binary:\n[ ");
            for (int i = 0; i < decimal.length; i++)    {
                System.out.print(decimal[i] + " ");
            }
            System.out.println("]");
        }
        */

        System.out.println();
        sc.close();
    }

    /*
    public static boolean isPowOf2(int num) {
        if (num < 2)    return false;
        else    {
            while (num >= 2) {
                if ((num % 2) == 0)  {
                    num = num / 2;
                    continue;
                }
                else    return false;
            }
        }
        return true;
    }
    */

    /*
    public static int binaryToDecimal(int num)  {
        int decimal = 0;
        int count = 0;
        while (num > 0) {
            if ((count == 0) && ((num & 1) == 1))   decimal = 1;
            if ((count > 0) && ((num & 1) == 1)) decimal += (2 * count);
            count++;
            num = num / 10;
        }
        return decimal;
    }
    */

    /*
    public static int[] decimalToBinary(int num) {
        int count = 0;
        int decimal = num;
        while (num > 0)    {
            count++;
            num = num >> 1;
        }

        int[] binary = new int[count];

        for (int i = count - 1; i >= 0; i--)    {
            binary[i] = (decimal & 1);
            decimal = decimal >> 1;
        }

        return binary;
    }
    */
}