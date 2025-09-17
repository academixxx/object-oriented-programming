import java.util.Scanner;

public class Pretest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input your grade: ");
		double grade = scanner.nextDouble();
		
		scanner.close();
		
		String result;
		
		if (grade > 100) {
			result = "Grade not in range.";
		} else if (grade >= 90) {
			result = "Excellentt.";
		} else if (86 <= grade && grade <= 89) {
			result = "Very Good.";
		} else if (80 <= grade && grade <= 85) {
			result = "Good.";
		} else if (75 <= grade && grade <= 79) {
			result = "Poor.";
		} else {
			result = "Failed.";
		}
		
		System.out.println("Your grade is " + result);
	}
}