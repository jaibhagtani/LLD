package after2;

public class GoogleMaps {
    private PathFinderStrategyRegistry pathFinderStrategyRegistry;

    GoogleMaps(PathFinderStrategyRegistry pathFinderStrategyRegistry)
    {
        this.pathFinderStrategyRegistry = pathFinderStrategyRegistry;
    }
    public void findPath(String from, String to, TransportMode mode)
    {
//        Now here using this Registry
//        Like this finding path
        PathFinderStrategy pathFinderStrategy = pathFinderStrategyRegistry.get(mode);
//        this will give path
        pathFinderStrategy.findPath(from, to);
    }
}
