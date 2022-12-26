package exp1.t4;

public class MysqlConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("MySQL connection.");
    }
}
