import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Converter {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        int base;
        System.out.println("Hello! Choose your option.");
        System.out.println("For converting from decimal to hexadecimal enter 1016.");
        System.out.println("For converting from decimal to binary enter 102.");
        System.out.println("For converting from decimal to binary enter 210.");
        String choice = reader.readLine();
        switch (choice) {
            case "1016" :
                System.out.println("Enter decimal number from 0 to 10000");
                number = Integer.parseInt(reader.readLine());
                base = 16;
                System.out.println("Result: " + decimalToHexAndBin(number, base));
                break;
            case "102" :
                System.out.println("Enter decimal number from 0 to 10000");
                number = Integer.parseInt(reader.readLine());
                base = 2;
                System.out.println("Result: " + decimalToHexAndBin(number, base));
                break;
            case "210" :
                System.out.println("Enter binary number:");
                BigInteger binaryNumber = new BigInteger(reader.readLine(), 2);
                System.out.println("Result: " + binToDecimal(binaryNumber));
            default:
                System.out.println("There is no such option. Please, restart the program.");
        }
    }

    public static String decimalToHexAndBin(int number, int base) {
        String hexDigits = "0123456789ABCDEF";
        if (number == 0) return "0";
        //тут нужно вставить выбор основания
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int digit = number % base;
            result.insert(0, hexDigits.charAt(digit));
            number = number / base;
        }
        return result.toString();
    }

    public static String binToDecimal (BigInteger binaryNumber) {
        return binaryNumber.toString(10);
    }
}
