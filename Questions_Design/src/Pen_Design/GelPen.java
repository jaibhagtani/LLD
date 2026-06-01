package Pen_Design;

import Pen_Design.strategies.writestrategies.SmoothWriteBehaviour;
import Pen_Design.strategies.writestrategies.WriteBehaviour;

import java.sql.Ref;

public class GelPen extends Pen implements RefilPen {

    private Refil refil;
    private boolean canChangeRefil = false;

//    only create GelPen via builder
    private GelPen(WriteBehaviour writeBehaviour)
    {
        super(PenType.GEL, writeBehaviour);
    }

    public static class Builder {
        private Refil refil;
        private boolean canChangeRefil = false;


        public Builder setRefil(Refil refil)
        {
            this.refil = refil;
            return this;
        }

        public Builder setCanChangeRefil(boolean bool)
        {
            this.canChangeRefil = bool;
            return this;
        }

        public GelPen build(WriteBehaviour writeBehaviour)
        {
            GelPen gelPen = new GelPen(writeBehaviour);
            gelPen.refil = this.refil;
            gelPen.canChangeRefil = this.canChangeRefil;

            return gelPen;
        }


    }

    @Override
    public Refil getRefil() {
        return this.refil;
    }

    @Override
    public boolean canChangeRefil() {
        return this.canChangeRefil;
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
