package Factory_Method;

public class PostgresDB extends Database{

    @Override
    public Query createQuery() {
        return PostgresQuery();
    }
}
