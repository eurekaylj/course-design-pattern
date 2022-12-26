package exp1.t4;

public interface DBFactory {
    public Connection creatConnection();

    public Statement createStatement();
}
