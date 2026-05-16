public class Database {

    private static Database database_instance = null;

    private Database(){}

    public static Database getInstance()
    {
        if(database_instance == null)
        {
//            Here multithread is also considered
            synchronized(Database.class)
            {
                    if(database_instance == null)
                    {
                        database_instance = new Database();
                    }
            }
        }
        return database_instance;
    }

}
