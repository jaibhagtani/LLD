public class Student {
    String name;
    String address;
    String email;
    String batch;
    double psp;
    String state;

    Student(String name, String address, String email, String batch, double psp, String state)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.batch = batch;
        this.psp = psp;
        this.state = state;
    }
//    copy constructor
    Student(Student s){
        this.name = s.name;
        this.address = s.address;
        this.email = s.email;
        this.batch = s.batch;
        this.psp = s.psp;
        this.state = s.state;
    }

    void changeBatch(String nB)
    {
        this.batch = nB;
    }

    void pauseCourse()
    {
        this.state = "PAUSED";
    }
}
