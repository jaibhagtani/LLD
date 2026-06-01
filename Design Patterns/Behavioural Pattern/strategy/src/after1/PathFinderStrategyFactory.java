package after1;

public class PathFinderStrategyFactory {

    public PathFinderStrategy getPathFinderStrategy(TransportMode mode)
    {
        if(mode == TransportMode.CAR)
        {
            return new CarPathFinderStrategy();
        }
        else if(mode == TransportMode.BIKE)
        {
            return new BikePathFinderStrategy();
        }
        else if(mode == TransportMode.WALK)
        {
            return new WalkPathFinderStrategy();
        }
        return null;
    }

}
