package prototype_DP;

public class Bird implements Cloneable<Bird> {

    private String color;
    private String name;
    private int age;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    default
    public Bird() {}

//    COPY CONSTRUCTOR Needed to be formed in PROTOTYPE DP
    public Bird(Bird old)
    {
        this.age = old.age;
        this.name = old.name;
        this.color = old.color;
    }

    @Override
    public Bird clone() {

//        This solution only works when the class
//        that I am cloning is the parent class
//        Bird b = new Bird();
//        b.age = this.age;
//        b.name = this.name;
//        b.color = this.color;
//
//        return b;
//        here this is old one
        return new Bird(this);
    }
}
