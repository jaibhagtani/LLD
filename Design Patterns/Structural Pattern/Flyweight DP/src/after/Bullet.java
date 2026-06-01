package after;

//INTRINSIC CLASS -> This will never change

//*****************************************
//HERE ONE thing ->
//This intrinsic class object must be immutable
//Because while sharing an object with multiple objects, the shared object must be immutable
//Since if that changes, then it would affect other objects as well
//*****************************************

public class Bullet {

    private double radius;
    private double wt;
    private byte[] image;
    private BulletType type;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWt() {
        return wt;
    }

    public void setWt(double wt) {
        this.wt = wt;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public BulletType getType() {
        return type;
    }

    public void setType(BulletType type) {
        this.type = type;
    }
}
