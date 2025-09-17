import java.util.Scanner;

public class Pretest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the main number: ");
		int mNumber = scanner.nextInt();
		
		System.out.print("Loop: ");
		int loop = scanner.nextInt();
		
		
		System.out.println("Output:");
		for (int i = 1; i <= loop; i++) {
			int result = mNumber * i;
			System.out.println(mNumber + " * " + i + " = " + result);
		}
		
	}
}