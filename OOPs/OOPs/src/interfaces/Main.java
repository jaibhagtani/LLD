package interfaces;

import java.util.List;

public class Main {

    static void main() {
        List<Herbivore> herbivoreList = List.of(
            new Dog(),
            new Human()
        );

        for(Herbivore h : herbivoreList){
            h.eatPlant();
        }
    }

}
