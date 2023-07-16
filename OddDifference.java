import java.util.Scanner;

public class OddDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int difference = num1 - num2;

        if (difference % 2 != 0) {
            System.out.println("The difference between " + num1 + " and " + num2 + " is odd.");
        } else {
            System.out.println("The difference between " + num1 + " and " + num2 + " is not odd.");
        }

        scanner.close();
    }
}
//Write a program that prompts the user to enter two integers and checks whether their difference is odd.
