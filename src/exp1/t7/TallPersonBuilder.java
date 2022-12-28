package exp1.t7;

public class TallPersonBuilder extends PersonBuilder {

    @Override
    public void buildHead() {
        person.setHead("Tall body");
    }

    @Override
    public void buildBody() {
        person.setBody("Tall Body");
    }

    @Override
    public void buildArm() {
        person.setArm("Tall Arm");
    }

    @Override
    public void buildLeg() {
        person.setLeg("Tall Leg");
    }
}
