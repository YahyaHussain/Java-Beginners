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
        System.out.print("Enter a number (GET operation): ");
        int numGet = sc.nextInt();
        System.out.print("Enter the index of bit to be retrieved: ");
        int indexGet = sc.nextInt();
        int bitMaskGet = 1 << indexGet;
        if ((numGet & bitMaskGet) == 0) System.out.println("Bit at " + indexGet + " index: 0");
        else    System.out.println("Bit at " + indexGet + " index: 1");
        
        System.out.println();
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
        System.out.print("Enter a number (SET operation): ");
        int numSet = sc.nextInt();
        System.out.print("Enter the index of bit to set: ");
        int indexSet = sc.nextInt();
        int bitMaskSet = 1 << indexSet;
        System.out.println("Number after set bit: " + (numSet | bitMaskSet));

        System.out.println();
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
        System.out.print("Enter a number (CLEAR operation): ");
        int numClr = sc.nextInt();
        System.out.print("Enter the index of bit to clear: ");
        int indexClr = sc.nextInt();
        int bitMaskClr = 1 << indexClr;
        bitMaskClr = ~bitMaskClr;
        System.out.println("Number after clear bit: " + (numClr & bitMaskClr)/* (num & ~bitMask) */);
        
        System.out.println();
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
        System.out.print("Enter a number (UPDATE operation): ");
        int numUpdate = sc.nextInt();
        System.out.print("Enter the index of bit to update: ");
        int indexUpdate = sc.nextInt();
        System.out.print("Enter the bit to be updated with: ");
        int bitUpdate = sc.nextInt();
        int bitMaskUpdate = 1 << indexUpdate;
        if (bitUpdate == 0)   {
            bitMaskUpdate = ~bitMaskUpdate;
            System.out.println("Number after bit update: " + (numUpdate & bitMaskUpdate)/*(num & ~bitMask)*/);
        }
        else if (bitUpdate == 1)   {
            System.out.println("Number after bit update: " + (numUpdate | bitMaskUpdate));
        }
        else    System.out.println("Invalid state! Bit can either be 0 or 1");

        System.out.println();
        // Is the given number power of two
        System.out.print("Enter a number (Power of two): ");
        int numIsPowOfTwo = sc.nextInt();
        boolean powOf2 = isPowOf2(numIsPowOfTwo);
        if (powOf2) System.out.println(numIsPowOfTwo + " is a power of 2.");
        else    System.out.println(numIsPowOfTwo + " is not a power of 2.");

        System.out.println();
        // TOGGLE (0 becomes 1 and 1 becomes 0):
        System.out.print("Enter a number (TOGGLE operation): ");
        int numToggle = sc.nextInt();
        System.out.print("Enter the index of bit to toggle: ");
        int indexToggle = sc.nextInt();
        int bitMaskToggle = 1 << indexToggle;
        int noToggle = numToggle & bitMaskToggle;
        if (noToggle == 0)    {
            System.out.println(numToggle + " after toggle at " + indexToggle + " index: " + (numToggle | bitMaskToggle));
        }
        else    {
            bitMaskToggle = ~bitMaskToggle;
            System.out.println(numToggle + " after toggle " + indexToggle + " index: " + (numToggle & bitMaskToggle));
        }

        System.out.println();
        // Minimum no.of bits required to represent an integer in binary:
        System.out.print("Enter a number (minimum bits to represent binary): ");
        int numIntToBin = sc.nextInt();
        int countBitsIntToBin = 0;
        while (numIntToBin > 0) {
            countBitsIntToBin += 1;
            numIntToBin = numIntToBin >> 1;
        }
        System.out.println("Minimum no.of bits required: " + countBitsIntToBin);

        System.out.println();
        // No.of set bits in an integer:
        System.out.print("Enter a number (set bits in integer): ");
        int numSetInt = sc.nextInt();
        int countSetInt = 0;
        while (numSetInt > 0) {
            countSetInt += numSetInt & 1;
            numSetInt = numSetInt >> 1;
        }
        System.out.println("No.of 1's in: " + countSetInt);

        System.out.println();
        // No.of clear bits in an integer:
        System.out.print("Enter a number (clear bits in integer): ");
        int numClrInt = sc.nextInt();
        int countClrInt = 0;
        while (numClrInt > 0) {
            if ((numClrInt & 1) == 0) countClrInt += 1;
            numClrInt = numClrInt >> 1;
        }
        System.out.println("No.of 0's: " + countClrInt);

        System.out.println();
        // Binary to decimal
        System.out.print("Enter a binary number (to decimal): ");
        int numBinToDec = sc.nextInt();
        int decimal = binaryToDecimal(numBinToDec);
        System.out.println(numBinToDec + " in decimal: " + decimal);

        System.out.println();
        // Decimal to binary
        System.out.print("Enter a decimal number (to binary): ");
        int numDecToBIn = sc.nextInt();
        if (numDecToBIn == 0)   {
            System.out.println(numDecToBIn + " in binary:\n[ 0 ]");    
        }
        else    {
            int[] decimalArr = decimalToBinary(numDecToBIn);
            System.out.print(numDecToBIn + " in binary:\n[ ");
            for (int i = 0; i < decimalArr.length; i++)    {
                System.out.print(decimalArr[i] + " ");
            }
            System.out.println("]");
        }

        sc.close();
    }
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
}