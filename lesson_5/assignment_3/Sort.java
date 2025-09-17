import java.util.Scanner;
import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        boolean sorted = true;
		ArrayList<Integer> arr = new ArrayList<>();
		
		// read inputs
		System.out.print("Input num1: ");
		int num1 = scanner.nextInt();
		System.out.print("Input num2: ");
		int num2 = scanner.nextInt();
		System.out.print("Input num2: ");
		int num3 = scanner.nextInt();
		
		scanner.close();
		
		// add to the array
		arr.add(num1);
		arr.add(num2);
		arr.add(num3);
		
		// check
		for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                sorted = false;
                break;
            }
        }
		
		// result
		String result = (sorted) ? "in order" : "not in order";
		System.out.println("Numbers " + result);
	}
}
