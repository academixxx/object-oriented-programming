import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        if ((num >= 20) && (num % 2 == 0)) {
            System.out.println("Number accepted.");
        } else if ((num < 20) && (num % 2 == 0)) {
            System.out.println("Number rejected. It is an even number but less than 20.");
        } else {
            System.out.println("Number rejected. It is an odd number.");
        }
        
        scanner.close();
    }
}
