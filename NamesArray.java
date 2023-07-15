public class NamesArray {
     public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        System.out.println("Names of three people you know:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

