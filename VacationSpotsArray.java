import java.util.Scanner;

public class VacationSpotsArray {
    public static void main(String[] args) {
        // String[] vacationSpots = new String[4];
        // vacationSpots[0] = "Maldives";
        // vacationSpots[1] = "Bora Bora";
        // vacationSpots[2] = "Santorini";
        // vacationSpots[3] = "Maui";

        // System.out.println("Top vacation spot: " + vacationSpots[0]);
        // System.out.println("Bottom vacation spot: " + vacationSpots[3]);

        Scanner input = new Scanner(System.in);
        String[] vacationSpots = new String[4];
        System.out.println("Enter your top 4 vacation spots");
        // vacationSpots[0] = input.nextLine();
        // vacationSpots[1] = input.nextLine();
        // vacationSpots[2] = input.nextLine();
        // vacationSpots[3] = input.nextLine();
        for(int i = 0; i < vacationSpots.length; i++){
            vacationSpots[i] = input.nextLine();
        }
        
        for(int i = 0; i < vacationSpots.length; i++){
            System.out.println(vacationSpots[i]);
        }
        input.close();
    }
}

