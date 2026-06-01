package after1;

public class GoogleMaps {

    public void findPath(String from, String to, TransportMode mode)
    {
//        but Here
//        ************************************************
//        Factory always gives new object, which is not necessary
//        We are only here to use methods, there for now using Registry in after2
        PathFinderStrategyFactory pfsf = new PathFinderStrategyFactory();
        PathFinderStrategy pathFinderStrategy = pfsf.getPathFinderStrategy(mode);

//        Like this finding path
        pathFinderStrategy.findPath(from, to);
    }
}
