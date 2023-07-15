import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Prompt the user to enter a character
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);

// Converts to lower case
ch = Character.toLowerCase(ch);

 // Check if the character is a vowel
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The character is a vowel.");
        } else {
            System.out.println("The character is not a vowel.");
        }

        // Close the scanner
        scanner.close();
    }
}



