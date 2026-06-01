package before;

public class GoogleMaps {

    public void findPath(String from, String to, TransportMode mode)
    {
        if(mode == TransportMode.CAR)
        {
            System.out.println("Finding for Car");
        }
        else if(mode == TransportMode.BIKE)
        {
            System.out.println("Finding for Bike");
        }
        else if(mode == TransportMode.WALK)
        {
            System.out.println("Finding for Walk");
        }
    }
}
