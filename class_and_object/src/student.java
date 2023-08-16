public class student {

    // Defining the attributes of the class
    public int id;
    public String name;
    public String department;


    // Defining the constructor of the class
    public student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Constructor overloading
    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // methods
    public void add_department(String department) {
        this.department = department;
    }

    public void print_student() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Department: " + this.department);
    }
}
