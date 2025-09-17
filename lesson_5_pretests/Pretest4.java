import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input start: ");
        int start = scanner.nextInt();

        System.out.print("Input end: ");
        int end = scanner.nextInt();

        scanner.close();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;  // add i
        }

        System.out.println("The Sum is: " + sum);
    }
}
