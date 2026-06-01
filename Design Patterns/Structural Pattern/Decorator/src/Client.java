public class Client {

    static void main() {
    //    1 Blue Cone + 2 VanillaScoop + 1 chocolateScoop
        IceCream ic1 = new ChocolateScoop(new VanillaScoop(new VanillaScoop(new BlueCone())));

        System.out.println(ic1.getCost());
        System.out.println(ic1.getContituents());
    }
}
