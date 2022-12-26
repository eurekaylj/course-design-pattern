package exp1.t4;

public class OracleFactory implements DBFactory {

    @Override
    public Connection creatConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }
}
