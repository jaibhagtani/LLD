package Pen_Design;

import Pen_Design.strategies.writestrategies.WriteBehaviour;

public class BallPen extends Pen implements RefilPen {

    private Refil refil;
    private boolean canChangeRefil = false;

    private BallPen(WriteBehaviour writeBehaviour)
    {
        super(PenType.BALL, writeBehaviour);
    }



    public static class Builder {
        private Refil refil;
        private boolean canChangeRefil = false;


        public BallPen.Builder setRefil(Refil refil)
        {
            this.refil = refil;
            return this;
        }

        public BallPen.Builder setCanChangeRefil(boolean bool)
        {
            this.canChangeRefil = bool;
            return this;
        }

        public BallPen build(WriteBehaviour writeBehaviour) {
            BallPen ballPen = new BallPen(writeBehaviour);
            ballPen.refil = this.refil;
            ballPen.canChangeRefil = this.canChangeRefil;

            return ballPen;
        }

    }

    @Override
    public Refil getRefil() {
        return null;
    }

    @Override
    public boolean canChangeRefil() {
        return false;
    }

    @Override
    public void changeRefil(Refil newRefil) {

    }

    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
