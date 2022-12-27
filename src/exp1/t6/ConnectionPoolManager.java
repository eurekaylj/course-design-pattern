package exp1.t6;

public class ConnectionPoolManager {
    private static ConnectionPoolManager instance = null;

    private ConnectionPoolManager() {
    }

    public static ConnectionPoolManager getInstance() {
        if (instance == null) {
            System.out.println("Create connection pool manager!");
            instance = new ConnectionPoolManager();
        } else {
            System.out.println("Connection pool manager is working!");
        }
        return instance;
    }

    public Connection getConnection(String name) {
        return new Connection(name);
    }
}
