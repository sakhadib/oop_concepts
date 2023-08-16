// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        System.out.println("\n");
        // Creating an object of the class student
        student student1 = new student(1, "John", "Computer Science");
        student1.print_student();

        System.out.println("\n");
        // Creating another object of the class student without department
        student student2 = new student(2, "Mary");
        student2.add_department("Electrical Engineering");
        student2.print_student();
    }
}