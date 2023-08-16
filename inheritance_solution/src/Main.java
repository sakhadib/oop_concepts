public class Main {
    public static void main(String[] args) {
        course physics = new course(1, "Physics", 3);
        course chemistry = new course(2, "Chemistry", 3);
        course math = new course(3, "Math", 3);
        course english = new course(4, "English", 3);
        course computer = new course(5, "Computer", 3);
        course biology = new course(6, "Biology", 3);

        regular_student student1 = new regular_student(1, "John", 1, 2.5);
        student1.AddCourse(physics);
        student1.AddCourse(chemistry);
        student1.AddCourse(biology);

        distant_student student2 = new distant_student(2, "Jane", "123 Main St", 1.5);
        student2.AddCourse(math);
        student2.AddCourse(english);
        student2.AddCourse(computer);

        System.out.println("Regular Student:");
        student1.show_all();

        System.out.println("\n\n\nDistant Student:");
        student2.show_all();


    }
}