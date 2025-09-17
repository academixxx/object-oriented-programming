import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize array
        int[] arr = new int[size];

        // Get the numbers(integers)
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            arr[i] = scanner.nextInt();
        }

        // reverse the elements of the array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        // store eaach element in a String Builder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(arr[i]);
        }
        // Print the result in one line
        System.out.println("\nReversed order: " + sb.toString());

    }
}