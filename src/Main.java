import Models.Course;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String name = new String("John");
        String name2 = name;

        name = "Carl";

        System.out.println(name2);
    }
}