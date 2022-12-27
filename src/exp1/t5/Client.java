package exp1.t5;

public class Client {
    public static void main(String[] Args) {
        Chief chief;
        Rice rice;
        Noodle noodle;

        chief = (Chief) XMLUtil.getBean();
        rice = chief.createRice();
        noodle = chief.createNoodle();
    }
}
