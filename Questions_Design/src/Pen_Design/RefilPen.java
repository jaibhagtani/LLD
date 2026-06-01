package Pen_Design;

public interface RefilPen {

    Refil getRefil();

    boolean canChangeRefil();

    void changeRefil(Refil newRefil);
}
