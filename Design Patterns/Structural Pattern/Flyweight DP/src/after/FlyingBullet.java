package after;

//EXTRINSIC CLASS -> This will change
//Light class
public class FlyingBullet {
    private double x_coord;
    private double y_coord;
    private double z_coord;
    private double x_angle;
    private double y_angle;
    private double z_angle;
    private long userId;
    private double speed;
    private BulletStatus status;

//    Has-a Relationship
    private Bullet bullet;

    public double getX_coord() {
        return x_coord;
    }

    public void setX_coord(double x_coord) {
        this.x_coord = x_coord;
    }

    public double getY_coord() {
        return y_coord;
    }

    public void setY_coord(double y_coord) {
        this.y_coord = y_coord;
    }

    public double getZ_coord() {
        return z_coord;
    }

    public void setZ_coord(double z_coord) {
        this.z_coord = z_coord;
    }

    public double getX_angle() {
        return x_angle;
    }

    public void setX_angle(double x_angle) {
        this.x_angle = x_angle;
    }

    public double getY_angle() {
        return y_angle;
    }

    public void setY_angle(double y_angle) {
        this.y_angle = y_angle;
    }

    public double getZ_angle() {
        return z_angle;
    }

    public void setZ_angle(double z_angle) {
        this.z_angle = z_angle;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public BulletStatus getStatus() {
        return status;
    }

    public void setStatus(BulletStatus status) {
        this.status = status;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
