public class ChocolateScoop implements IceCream {

    private IceCream iceCream;

    ChocolateScoop(IceCream iceCream)
    {
//        do all checks here
        this.iceCream = iceCream;
    }


    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }

    @Override
    public String getContituents() {
        return iceCream.getContituents() + " " + "Chocolate";
    }
}
