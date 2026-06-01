package after;

import java.util.ArrayList;
import java.util.List;

public class Client {

    static void main() {

//        20 types of bullet
//        for now taking 2 types -> BulletType

        BulletRegistry br = new BulletRegistry();
        Bullet b1 = new Bullet();
        b1.setType(BulletType.FIVE_MM);
        br.registerBullet(BulletType.FIVE_MM, b1);

        Bullet b2 = new Bullet();
        b2.setType(BulletType.SEVEN_MM);
        br.registerBullet(BulletType.SEVEN_MM, b2);




//        100 * 2000
//        100 players
//        2000 bullets/player
        List<FlyingBullet> flyingBulletList = new ArrayList<>();
        for(int i = 0;i < 100 * 2000;i++)
        {
            FlyingBullet fb = new FlyingBullet();
//            setting extrinsic attributes
//            .....................
//            All bullets lets say of BulletType.FIVE_MM
            fb.setBullet(br.getBullet(BulletType.FIVE_MM));
            flyingBulletList.add(fb);
        }

        System.out.println("Reached Here");
//        much less memory required
    }
}
