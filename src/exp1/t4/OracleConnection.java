package exp1.t4;

public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Oracle connection.");
    }
}
