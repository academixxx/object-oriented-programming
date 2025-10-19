import java.util.Scanner;
import java.util.Arrays;

class MergeArrays {
    public static void main(String[] args) {

        // initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Array 1
        System.out.print("Enter the size of array 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            array1[i] = element;
        }

        // Array 2
        System.out.print("Enter the size of array 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            array2[i] = element;
        }

        // third array to store the merged arrays
        int[] array3 = new int[size1 + size2];

        // using built-in method to copy elements from the two arrays into the third array
        System.arraycopy(array1, 0, array3, 0, size1);
        System.arraycopy(array2, 0, array3, size1, size2);

        // print the merged arrays
        System.out.println("Elements of Array 3: " + Arrays.toString(array3).replace("[", "").replace("]", ""));

        scanner.close();
    }
}