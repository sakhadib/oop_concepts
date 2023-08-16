public class regular_student extends student
{
    int seat_number;
    double contact_hr;

    // Constructor
    public regular_student(int id, String name, int seat_number, double contact_hr)
    {
        this.id = id;
        this.name = name;
        this.seat_number = seat_number;
        this.contact_hr = contact_hr;
    }

    // Methods
    public void show_all(){
        this.show_info();
        System.out.println("Seat Number: " + this.seat_number);
        System.out.println("Contact Hours: " + this.contact_hr);
        this.show_courses();
    }
}
