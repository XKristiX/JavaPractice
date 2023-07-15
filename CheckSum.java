import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Prompt the user to enter the third integer
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Check if the sum of the first two numbers is equal to the third number
        if (num1 + num2 == num3) {
            System.out.println("The first two numbers add up to the third number.");
        } else {
            System.out.println("The first two numbers do not add up to the third number.");
        }

        // Close the scanner
        scanner.close();
    }
}
