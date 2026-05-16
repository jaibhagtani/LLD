package inheritance;

public class Student extends User{
    private String batch;
    private double psp;
    private Mentor mentor;

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
