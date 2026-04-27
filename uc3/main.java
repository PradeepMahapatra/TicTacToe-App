import java.util.Scanner;

public class InputHandler {

    // Method to get valid slot input from user
    public static int getUserMove(Scanner scanner) {
        int slot;

        while (true) {
            System.out.print("Enter slot number (1-9): ");

            // Check if input is an integer
            if (scanner.hasNextInt()) {
                slot = scanner.nextInt();

                // Validate range
                if (slot >= 1 && slot <= 9) {
                    return slot; // valid input
                } else {
                    System.out.println("❌ Invalid! Enter a number between 1 and 9.");
                }
            } else {
                System.out.println("❌ Invalid! Please enter a valid number.");
                scanner.next(); // clear invalid input
            }
        }
    }
}
