package Factory_Method;

public class MySqlDB extends Database{


    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }
}
