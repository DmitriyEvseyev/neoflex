package  com.neoflex.task1.proxy;

public class Main {
    public static void main(String[] args) {

        DatabaseConnection connection = new DatabaseConnectionProxy();
        connection.connect();
    }
}