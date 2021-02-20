package halfAdder;

import java.util.Scanner;

public class ExecutionClass {
    public static void main(String[] args) throws NotBinaryDigitException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Bit : ");
        int firstBit = scanner.nextInt();
        System.out.println("Enter second Bit : ");
        int secondBit = scanner.nextInt();
        if (!((firstBit == 0 || firstBit == 1)&&(secondBit == 0 || secondBit == 1))) throw new NotBinaryDigitException();
        HalfAdder.printHalfAdderTruthTable();
        HalfAdder.printAddResult(firstBit, secondBit);
    }
}
