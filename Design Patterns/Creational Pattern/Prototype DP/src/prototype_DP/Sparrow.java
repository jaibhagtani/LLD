package prototype_DP;

public class Sparrow extends Bird{

    private int legSize = 8;

    public void setLegSize(int legSize) {
        this.legSize = legSize;
    }

    public int getLegSize() {
        return legSize;
    }

    public Sparrow() {};

    public Sparrow(Sparrow old)
    {
        super(old);
        this.legSize = old.legSize;
    }
    @Override
    public Sparrow clone() {
//        return super.clone();
        return new Sparrow(this);
    }
}
