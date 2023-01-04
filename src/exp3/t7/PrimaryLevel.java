package exp3.t7;

public class PrimaryLevel extends AbstractLevel {

    public PrimaryLevel(GameAccount gameAccount) {
        this.level = "入门级";
        this.gameAccount = gameAccount;
        point = 0;
    }

    public PrimaryLevel(AbstractLevel level) {
        this.level = "入门级";
        this.gameAccount = level.gameAccount;
        point = level.point;
    }

    @Override
    public void checkLevel(int score) {
        if (point >= 30) {
            gameAccount.setLevel(new SecondaryLevel(this));
        }
    }
}
