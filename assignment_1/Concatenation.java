import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read each input and assign
        System.out.print("Enter an adjective: ");
        String adjective = scanner.next();

        System.out.print("Enter the name of the outdoor game: ");
        String outdoorGame = scanner.next();

        System.out.print("Enter another adjective: ");
        String sAdjective = scanner.next();

        System.out.print("Enter the name of the friend: ");
        String name = scanner.next();

        System.out.print("Enter a verb ending with ing: ");
        String verb = scanner.next();

        System.out.print("Enter one more adjective: ");
        String mAdjective = scanner.next();

        // Pass the variables to the method
        concatenate(adjective, outdoorGame, sAdjective, name, verb, mAdjective);

        // Close the scanner
        scanner.close();
    }

    public static void concatenate(
        String adjective, 
        String outdoorGame,
        String sAdjective,
        String name, 
        String verb,
        String mAdjective
        ) {
            // Concatenate strings
            String message = "\nIt was a " + adjective + " summer day at the beach. My friends and I were in the water " +
                "playing " + outdoorGame + ". " + "As a" + sAdjective + " wave came closer, my friend " 
                + name + " yelled, \"Look! There's a jellyfish" + verb + "!\" As we got closer, we saw" +
                " that the jellyfish was indeed " + verb + "! " + name + " ran out of the water and onto the sand." +
                name + " was afraid of " + verb + " jellyfish. The rest of us stayed in the water playing " + outdoorGame +
                " because " + verb + " jellyfish are " + mAdjective + ".";
            
            // Print the message
            System.out.println(
                message
            );
        }
}