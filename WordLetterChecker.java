import java.util.Scanner;

public class WordLetterChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.print("Enter a letter: ");
        char letter = scanner.nextLine().charAt(0);

        if (word.contains(String.valueOf(letter))) {
            System.out.println("Yep, it's got one of those");
        } else {
            System.out.println("So, sorry");
        }

        scanner.close();
    }
}
