package after2;

import java.util.HashMap;
import java.util.Map;

public class PathFinderStrategyRegistry {

    Map<TransportMode, PathFinderStrategy> registry = new HashMap<>();

    public void registerStrategy(TransportMode mode, PathFinderStrategy pathFinderStrategy)
    {
        registry.put(mode, pathFinderStrategy);
    }

    public PathFinderStrategy get(TransportMode mode)
    {
        return registry.get(mode);
    }
}
