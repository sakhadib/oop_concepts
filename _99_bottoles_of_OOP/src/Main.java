import java.util.Scanner;
public class Main {
    public static int number_of_bottles;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        scanner.close();
        number_of_bottles = number;

        for (int i = number; i >= 0; i--){
            System.out.println(verse(i));
            System.out.println();
        }

    }

    public static String verse(int num_of_current_verse){

        return switch (num_of_current_verse) {
            case 0 -> "No more bottles of milk on the wall, no more bottles of milk.\n" +
                    "Go to the store and buy some more, " + number_of_bottles + " bottles of milk on the wall.";

            case 1 -> "1 bottle of milk on the wall, 1 bottle of milk.\n" +
                    "Take it down and pass it around, no more bottles of milk on the wall.";

            case 2 -> "2 bottles of milk on the wall, 2 bottles of milk.\n" +
                    "Take one down and pass it around, 1 bottle of milk on the wall.";

            default ->
                    num_of_current_verse + " bottles of milk on the wall, " + num_of_current_verse + " bottles of milk.\n" +
                    "Take one down and pass it around, " + (num_of_current_verse - 1) + " bottles of milk on the wall.";
        };
    }
}