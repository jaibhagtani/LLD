package Pen_Design;

import Pen_Design.strategies.writestrategies.WriteBehaviour;

public class Marker extends Pen implements RefilPen {


    private Refil refil;
    private boolean canChangeRefil = false;

    private Marker(WriteBehaviour writeBehaviour)
    {
        super(PenType.MARKER, writeBehaviour);
    }



    public static class Builder {
        private Refil refil;
        private boolean canChangeRefil = false;

        public Marker.Builder setRefil(Refil refil)
        {
            this.refil = refil;
            return this;
        }

        public Marker.Builder setCanChangeRefil(boolean bool)
        {
            this.canChangeRefil = bool;
            return this;
        }

        public Marker build(WriteBehaviour writeBehaviour) {
            Marker marker = new Marker(writeBehaviour);
            marker.refil = this.refil;
            marker.canChangeRefil = this.canChangeRefil;

            return marker;
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
