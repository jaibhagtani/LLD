package Factory_Method;

public abstract class Database implements Query{
    int port;

//    public abstract void connect();
//    public abstract void disconnect();

    public abstract Query createQuery();
}
