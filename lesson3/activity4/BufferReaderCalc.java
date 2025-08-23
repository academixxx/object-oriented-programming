import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderCalc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter 1st number: ");
        String input1 = br.readLine();

        System.out.print("Please enter 2nd number: ");
        String input2 = br.readLine();

        int num1 = Integer.parseInt(input1.trim());
        int num2 = Integer.parseInt(input2.trim());

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        String quotientStr;
        String remainderStr;
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            quotientStr = String.valueOf(quotient);
            int remainder = num1 % num2;
            remainderStr = String.valueOf(remainder);
        } else {
            quotientStr = "undefined (division by zero)";
            remainderStr = "undefined (division by zero)";
        }

        System.out.println();
        System.out.println("The Sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        System.out.println("The quotient is: " + quotientStr);
        System.out.println("The remainder is: " + remainderStr);
    }
}