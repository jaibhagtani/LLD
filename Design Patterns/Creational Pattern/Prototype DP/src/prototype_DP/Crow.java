package prototype_DP;

public class Crow extends Bird{

    private String sound = "Haw";

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Crow() {}

//    COPY CONSTRUCTOR Needed to be formed in PROTOTYPE DP
    public Crow(Crow old)
    {
        super(old);
//        since this is a cons, here this refers to new object
        this.sound = old.sound;
    }

    @Override
    public Crow clone() {


//        therefore in this Prototype DP ->
//        **** there is need of constructors ****


//        ********* this cannot be done *********
//        Bird b = super.clone();
//        b.sound = this.sound;
//
//        return b;
        return new Crow(this);
    }
}
