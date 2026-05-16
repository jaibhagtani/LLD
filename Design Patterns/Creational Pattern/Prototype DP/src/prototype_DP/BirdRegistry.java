package prototype_DP;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistry {

    private Map<String, Bird> birdsMap = new HashMap<>();

    public void registerBird(String name, Bird b)
    {
        birdsMap.put(name, b);
    }

    public Bird getBird(String name)
    {
//        .clone() is necessary otherwise original object will be returned
        return birdsMap.get(name).clone();
    }

}
