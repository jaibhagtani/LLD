package Pen_Design;

public class PenFactory {

    public static GelPen.Builder createGelPen()
    {
        return new GelPen.Builder();
    }
    public static BallPen.Builder createBallPen()
    {
        return new BallPen.Builder();
    }
}
