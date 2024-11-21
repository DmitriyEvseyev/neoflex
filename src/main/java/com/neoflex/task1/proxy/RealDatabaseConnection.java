package main.java.com.neoflex.task1.proxy;

public class RealDatabaseConnection implements DatabaseConnection {
    private final String databaseName;

    public RealDatabaseConnection() {
        this.databaseName = "test_database";
    }

    @Override
    public String connect() {
        System.out.println("Connected to the database: " + databaseName);
        return databaseName;
    }
}