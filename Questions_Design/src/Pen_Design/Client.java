package Pen_Design;

import Pen_Design.strategies.writestrategies.SmoothWriteBehaviour;

public class Client {

    static void main() {


//        PenFactory.createGelPen()
//                  .setRefil(x)
//                  .setRefilable(false);

//      **************************************
//        2 design patterns are used -> Factory and Builder
//            Good thing -> Builder and Factory both worked simultaneously

//        Can use Prototype Registry to store this specific

//        One more requirement -> Different Pens can have similar write Behaviours
        GelPen gelPen = PenFactory
                .createGelPen()
                .setCanChangeRefil(true)
                .setRefil(new Refil())
                .build(new SmoothWriteBehaviour());
    }
}
