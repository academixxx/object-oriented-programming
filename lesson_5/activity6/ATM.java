import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 50000; // initial balance

        while (true) {
            System.out.println("\nWELCOME TO CSPC ATM MACHINE! I HAVE A BALANCE OF " + balance + " PESOS!");
            System.out.print("Input the amount: ");
            
            int amount = scanner.nextInt(); // read input

            if (amount > 0 && amount <= balance) {
                balance -= amount; // deduct from balance
                System.out.println("THANK YOU FOR WITHDRAWING " + amount + " PESOS!");
            } else {
                System.out.println("INSUFFICIENT BALANCE! PLEASE INPUT A VALID AMOUNT");
            }
        }
    }
}
