package exp1.t4;

public class MysqlFactory implements DBFactory {

    @Override
    public Connection creatConnection() {
        return new MysqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new MysqlStatement();
    }
}
