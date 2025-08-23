import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Before Swap");
        System.out.print("Input the value of num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Input the value of num2: ");
        int num2 = scanner.nextInt();

        // Swap using a temporary variable
        int temp = num1; // store num1
        num1 = num2;     // assign num2 to num1
        num2 = temp;     // assign stored value to num2

        System.out.println();
        System.out.println("After Swap");
        System.out.println("The new value of num1 is " + num1);
        System.out.println("The new value of num2 is " + num2);

        scanner.close();
    }
}