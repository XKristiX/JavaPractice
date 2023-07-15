import java.util.Scanner;

public class CheckOddNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is odd
        if (number % 2 != 0) {
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number is not odd.");
        }

        // Close the scanner
        scanner.close();
    }
}




