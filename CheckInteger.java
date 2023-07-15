import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
    

if (number <= 10) {
            System.out.println("This number is between 1 and 10");
        } else {
            System.out.println("This number is not between 1 and 10");
        }
        scanner.close();
    }
}
