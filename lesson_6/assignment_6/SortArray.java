import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of Array1: ");
        int size = scanner.nextInt();

        // init arrays
        int[] array1 = new int[size];
        int[] array2 = new int[size + 1];

        // get input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            array1[i] = scanner.nextInt();
        }

        // copy the elements of Array1 to Array2
        for (int i = 0; i < size; i++) {
            array2[i] = array1[i];
        }

        System.out.print("Enter one more number: ");
        array2[size] = scanner.nextInt();

        // append each element in a string
        StringBuilder before = new StringBuilder();
        for (int i = 0; i < array2.length; i++) {
            if (i > 0) before.append(", ");
            before.append(array2[i]);
        }
        System.out.println("Elements of Array2: " + before);

        // built-in sorting
        Arrays.sort(array2);

        // array2 sorted; append each element
        StringBuilder after = new StringBuilder();
        for (int i = 0; i < array2.length; i++) {
            if (i > 0) after.append(", ");
            after.append(array2[i]);
        }
        System.out.println("Sorted Elements: " + after);

        scanner.close();
    }
}
