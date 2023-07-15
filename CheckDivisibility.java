import java.util.Scanner;

public class CheckDivisibility {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int secondNumber = scanner.nextInt();

    if (secondNumber == 0) {
    System.out.println("Error: Cannot divide by zero.");
        } else if (firstNumber % secondNumber == 0) {
            System.out.println(firstNumber + " is divisible by " + secondNumber);
        } else {
            System.out.println(firstNumber + " is not divisible by " + secondNumber);
        }
        
        scanner.close();
    }
}

