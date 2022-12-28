package exp1.t7;

public class ShortPersonBuilder extends PersonBuilder {

    @Override
    public void buildHead() {
        person.setHead("Short body");
    }

    @Override
    public void buildBody() {
        person.setBody("Short Body");
    }

    @Override
    public void buildArm() {
        person.setArm("Short Arm");
    }

    @Override
    public void buildLeg() {
        person.setLeg("Short Leg");
    }
}
