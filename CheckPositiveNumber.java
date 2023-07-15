import java.util.Scanner;

public class CheckPositiveNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // Read the input from the user
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is not positive.");
        }

        // Close the scanner
        scanner.close();
    }
}
