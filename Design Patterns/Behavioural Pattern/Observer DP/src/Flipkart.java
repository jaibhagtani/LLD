import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flipkart {

    private static Map<Events, List<Subscriber>> subscriberList = new HashMap<>();

    public static void registerSubscriber(Events events, Subscriber subscriber)
    {
        if(!subscriberList.containsKey(events))
        {
            subscriberList.put(events, new ArrayList<>());
        }

        subscriberList.get(events).add(subscriber);
    }

    public void notify(Events events, Order order)
    {
        for(Subscriber s : subscriberList.get(events))
        {
            s.listen(events, order);
        }
    }

    public void placeOrder(Order order)
    {
//        Here I want to notify all subscribers
        this.notify(Events.ORDER_PLACED, order);
    }
}
