import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        array();
        myList();
        myMap();
    }


    public static void array(){
        // Creating an array of 5 integers
        int[] numbers = new int[5];
        // Assigning values to the array
        numbers[0] = 12;
        numbers[1] = 17;
        numbers[2] = -5;
        numbers[3] = 3;
        numbers[4] = 7;
        // Accessing the elements of the specified array
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void myList(){
        // Creating a new list of strings
        List<String> myStrings = new ArrayList<String>();
        // Adding new elements to the list
        myStrings.add("My");
        myStrings.add("Name");
        myStrings.add("is");
        myStrings.add("Adib Sakhawat");
        // Accessing the elements of the specified list using a foreach loop ( Java => foreach = for and in = :)
        for (String str : myStrings) {
            System.out.println(str);
        }

    }

    public static void myMap(){
        Scanner scanner = new Scanner(System.in);
        // Creating a new map
        Map<String, Integer> myMap = new HashMap<String, Integer>();

        // Adding new key-value pairs to the map
        myMap.put("Emon", 1);
        myMap.put("Khalid", 2);
        myMap.put("Shuvro", 6);
        myMap.put("Alif", 7);
        myMap.put("Tauhid", 8);
        myMap.put("Iqra", 9);
        myMap.put("Nabila", 11);
        myMap.put("Raisa", 12);
        myMap.put("Nazifa", 14);
        myMap.put("Nafisa", 15);

        String input = scanner.nextLine();
        // Accessing the value of the specified key
        System.out.println("Id of " + input + " is " + myMap.get(input));


    }
}