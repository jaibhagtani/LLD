package Pen_Design;

import Pen_Design.strategies.writestrategies.WriteBehaviour;

public class FountainPen extends Pen{


    private Refil refil;
    private boolean canChangeRefil = false;

    //    to set the type of Pen -> Doing by Constructor of Parent
    private FountainPen(WriteBehaviour writeBehaviour)
    {
        super(PenType.FOUNTAIN, writeBehaviour);
    }


    public static class Builder {
        private Refil refil;
        private boolean canChangeRefil = false;


        public FountainPen.Builder setRefil(Refil refil)
        {
            this.refil = refil;
            return this;
        }

        public FountainPen.Builder setCanChangeRefil(boolean bool)
        {
            this.canChangeRefil = bool;
            return this;
        }

        public FountainPen build(WriteBehaviour writeBehaviour) {
            FountainPen fountainPen = new FountainPen(writeBehaviour);
            fountainPen.refil = this.refil;
            fountainPen.canChangeRefil = this.canChangeRefil;

            return fountainPen;
        }
    }


    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
