import java.util.Scanner;

public class PeersArray {
    // public static void main(String[] args) {
//         String[] peers = new String[4];
//         peers[0] = "Emily";
//         peers[1] = "John";
//         peers[2] = "Sarah";
//         peers[3] = "Michael";

//         System.out.println("First letter of each peer's name:");
//         for (String name : peers) {
//             char firstLetter = name.charAt(0);
//             System.out.println(firstLetter);
//         }
//     }
// }

//Updated Code

public static void main(String[] args) {
        String[] peers = new String[4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the names of your four peers:");

        for (int i = 0; i < peers.length; i++) {
            System.out.print("Peer " + (i + 1) + ": ");
            peers[i] = scanner.nextLine();
        }

        System.out.println("First letter of each peer's name:");
        for (String name : peers) {
            char firstLetter = name.charAt(0);
            System.out.println(firstLetter);
        }

        scanner.close();
    }
}