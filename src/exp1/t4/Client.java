package exp1.t4;

public class Client {
    public static void main(String[] args) {
        try {
            Connection connection;
            Statement statement;
            DBFactory factory;

            factory = (DBFactory) XMLUtil.getBean();
            connection = factory.creatConnection();
            statement = factory.createStatement();

            connection.connect();
            statement.action();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
