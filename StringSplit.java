public class StringSplit {
    public static void main(String[] args) {
        String list = "apple,banana,orange,grape";
        String[] items = list.split(",");

        System.out.println("List of fruits:");
        for (String item : items) {
            System.out.println(item);
        }

        System.out.println("First item: " + items[0]);
        System.out.println("Third item: " + items[2]);
    }
}

