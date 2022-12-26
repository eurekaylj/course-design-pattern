package exp1.t1;

public class Client {
    public static void main(String[] args) {
        try {
            Person person;
            String type = XMLUtil.getType();
            person = Nvwa.creatPerson(type);
            person.say();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
