package after2;

public class Client {

    static void main() {
        PathFinderStrategyRegistry pfsr = new PathFinderStrategyRegistry();

        pfsr.registerStrategy(TransportMode.CAR, new CarPathFinderStrategy());
        pfsr.registerStrategy(TransportMode.BIKE, new BikePathFinderStrategy());
        pfsr.registerStrategy(TransportMode.WALK, new WalkPathFinderStrategy());

        GoogleMaps gm = new GoogleMaps(pfsr);
    }
}
