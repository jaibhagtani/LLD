package before;

import java.util.ArrayList;
import java.util.List;

public class Client {

    static void main() {
//        100 * 2000
//        100 players
//        2000 bullets/player
        List<Bullet> bulletList = new ArrayList<>();
        for(int i = 0;i < 100 * 2000;i++)
        {
            Bullet bullet = new Bullet();
            bulletList.add(bullet);
        }

//        much more memory required
        System.out.println("REACHED HERE");
    }
}
