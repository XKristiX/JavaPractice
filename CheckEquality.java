import java.util.Scanner;

public class CheckEquality {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Check if the two numbers are equal
        if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }

        // Close the scanner
        scanner.close();
    }
}