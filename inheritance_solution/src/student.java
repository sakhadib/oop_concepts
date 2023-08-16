import java.util.List;
import java.util.ArrayList;

public class student {
    public int id;
    public String name;
    public List<course> courses = new ArrayList<course>();

    public void AddCourse(course course) {
        this.courses.add(course);
    }

    public void show_info(){
        System.out.println("Student ID: " + this.id);
        System.out.println("Student Name: " + this.name);
    }

    public void show_courses(){
        System.out.println("\n\tCourses: ");
        String sq = "\t";
        for (course course : this.courses) {
            sq += course.name + ", ";
        }
        System.out.println(sq);
    }
}
