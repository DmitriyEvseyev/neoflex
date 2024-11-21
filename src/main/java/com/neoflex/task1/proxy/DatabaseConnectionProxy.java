package  com.neoflex.task1.proxy;

public class DatabaseConnectionProxy implements DatabaseConnection {
    private final RealDatabaseConnection realDatabaseConnection;
    private final String databaseUrl;

    public DatabaseConnectionProxy() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/";
        this.realDatabaseConnection =  new RealDatabaseConnection();
    }

    @Override
    public String connect() {
        String connect = databaseUrl  + realDatabaseConnection.connect();
        System.out.println("Proxy: Connecting to the database via URL: " + connect);
        return connect;
    }
}