package exp1.t6;

public class Client {
    public static void main(String[] Args) {
        Connection connection1 = QueryFunctions.findStudentByName("first");
        System.out.println("-----------------------------");
        Connection connection2 = QueryFunctions.findStudentByName("second");
    }
}
