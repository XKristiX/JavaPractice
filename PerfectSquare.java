import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isPerfectSquare = false;
        for (int i = 1; i <= number; i++) {
            if (i * i == number) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        scanner.close();
    }
}
//Write a program that prompts the user to enter an integer and checks whether it is a perfect square.
