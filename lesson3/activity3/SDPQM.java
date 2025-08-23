import java.util.Scanner;

public class SDPQM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter 2nd number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        // Handle division and modulo by zero
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

        scanner.close();
    }
}