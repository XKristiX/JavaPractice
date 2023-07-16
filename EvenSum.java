import java.util.Scanner;

public class EvenSum {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        if (sum % 2 == 0) {
            System.out.println("The sum of " + num1 + " and " + num2 + " is even.");
        } else {
            System.out.println("The sum of " + num1 + " and " + num2 + " is not even.");
        }

        scanner.close();
    }
}
//write a program that prompts the user to enter two integers and checks whether their sum is even.