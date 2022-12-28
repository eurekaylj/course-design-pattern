package exp1.t7;

public class PaintDirector {
    private PersonBuilder personBuilder;

    public void setPersonBuilder(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public Person construct() {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArm();
        personBuilder.buildLeg();
        return personBuilder.getPerson();
    }
}
