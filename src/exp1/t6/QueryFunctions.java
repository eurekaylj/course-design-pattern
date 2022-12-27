package exp1.t6;

public class QueryFunctions {
    public static Connection findStudentByName(String name) {
        ConnectionPoolManager connectionPoolManager = ConnectionPoolManager.getInstance();
        Connection connection = connectionPoolManager.getConnection(name);
        return connection;
    }
}
