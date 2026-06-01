public class VanillaScoop implements IceCream {

    private IceCream iceCream;

    VanillaScoop(IceCream iceCream)
    {
//        do all checks here
        this.iceCream = iceCream;
    }


    @Override
    public int getCost() {
        return iceCream.getCost() + 20;
    }

    @Override
    public String getContituents() {
        return iceCream.getContituents() + " " + "Vanilla";
    }
}
