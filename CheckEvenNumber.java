import java.util.Scanner;

public class CheckEvenNumber {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is even
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is not even.");
        }

        scanner.close();
    }
}