import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your Name:");
        String name = input.nextLine();
        System.out.println("Hello, " + name + " " + "Enter your favorite Integer:");
        int favInteger = input.nextInt();
        System.out.println("Enter your favorite decimal value:");
        double favDouble =input.nextDouble();

        System.out.println("Hello "+ name);
        System.out.println("Your favorite integer is " + favInteger);
        System.out.println("Your favorite double is " + favDouble);




        input.close();
    }
}
