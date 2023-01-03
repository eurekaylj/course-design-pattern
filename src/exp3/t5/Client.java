package exp3.t5;

public class Client {
    public static void main(String[] args) {
        UserInfoDTO user = new UserInfoDTO();
        Caretaker caretaker = new Caretaker();

        user.setAccount("Alice");
        user.setPassword("test");
        user.setTelNo("110");
        System.out.println("State 1:");
        user.show();
        // save memento
        caretaker.setMemento(user.saveMemento());
        System.out.println("-------------------------");

        user.setPassword("password");
        user.setTelNo("119");
        System.out.println("State 2:");
        user.show();
        System.out.println("-------------------------");

        user.restoreMemento(caretaker.getMemento());
        System.out.println("Back to state 1:");
        user.show();
        System.out.println("-------------------------");
    }
}
