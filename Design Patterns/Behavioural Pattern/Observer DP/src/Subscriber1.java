public class Subscriber1 implements Subscriber {

//    Now thing is How to subscribe to it
//    Using constructor for that

    Subscriber1()
    {
        Flipkart.registerSubscriber(Events.ORDER_PLACED, this);
    }
//    DONE

    @Override
    public void listen(Events events, Order order) {
        // do it what ever it needs
    }
}
