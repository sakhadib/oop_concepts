public class distant_student extends student {
    String address;
    double online_contact_hr;

    // Constructor
    public distant_student(int id, String name, String address, double online_contact_hr)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.online_contact_hr = online_contact_hr;
    }

    // Methods
    public void show_all(){
        this.show_info();
        System.out.println("Address: " + this.address);
        System.out.println("Online Contact Hours: " + this.online_contact_hr);
        this.show_courses();
    }


}
