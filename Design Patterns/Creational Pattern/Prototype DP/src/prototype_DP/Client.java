package prototype_DP;

import java.util.ArrayList;
import java.util.List;

public class Client {

    static void main() {

        Bird b1 = new Bird();
        b1.setAge(90);
        b1.setColor("white");
        b1.setName("Hello ji");

        Crow b2 = new Crow();
        b2.setName("b2");
        b2.setSound("nvis");

        Sparrow b3 = new Sparrow();
        b3.setName("vifdnvfdsi");
        b3.setLegSize(89);


        List<Bird> originalList = List.of(
                b1,
                b2,
                b3
        );

        List<Bird> newList = new ArrayList<Bird>();

        for(Bird b: originalList) {
            System.out.println(b);
            System.out.println();
            newList.add(b.clone());
        }

        for(Bird b: newList) {
            System.out.println(b);
            System.out.println();
        }

        System.out.println("DONE");

        BirdRegistry br = new BirdRegistry();

        Sparrow longLegged = new Sparrow();
        longLegged.setLegSize(100);

        Crow mogaCrow = new Crow();
        mogaCrow.setSound("90");

        br.registerBird("longLeggedSparrow", longLegged);
        br.registerBird("mogaCrow", mogaCrow);

        Bird newmogaCrow = br.getBird("mogaCrow");
        System.out.println(newmogaCrow);
    }
}
