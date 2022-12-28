package exp1.t7;

public class Client {
    public static void main(String[] Args) {
        PersonBuilder personBuilder = (PersonBuilder) XMLUtil.getBean();
        PaintDirector paintDirector = new PaintDirector();

        paintDirector.setPersonBuilder(personBuilder);
        Person person = paintDirector.construct();

        System.out.println(person.toString());
    }
}
