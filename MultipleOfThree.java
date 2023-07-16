import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println(number + " is a multiple of 3.");
        } else {
            System.out.println(number + " is not a multiple of 3.");
        }

        scanner.close();
    }
}
//Write a program that prompts the user to enter an integer and checks whether it is a multiple of 3.
