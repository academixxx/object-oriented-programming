import java.util.Scanner;

public class PesoBillDeno {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
        int[] denominations = {1000, 500, 200, 100, 50, 20, 10, 5, 1};
        int[] counts = new int[denominations.length];
		int max = 9999;
		
		while (true){
			System.out.print("Input the amount: ");
			int peso = scanner.nextInt(); // InpuT
		
			if (peso <= max) {
				// Count all denominations that macthes the amount
				for (int i = 0; i < denominations.length; i++) {
					counts[i] = peso / denominations[i];
					peso %= denominations[i];
				}

				System.out.println("Output:");
				for (int i = 0; i < denominations.length; i++) {
					
					// Print every denominations and their counts
					System.out.println(denominations[i] + " peso bill/s: " + counts[i]);
				}
			} else {
				System.out.println("Please enter a value less than or equal to " + max);
			}
		}

    }
}
