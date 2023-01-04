package exp3.t7;

public class SecondaryLevel extends AbstractLevel {
    public SecondaryLevel(AbstractLevel abstractLevel) {
        this.gameAccount = abstractLevel.gameAccount;
        this.point = abstractLevel.point;
        this.level = "熟练级";
    }

    @Override
    public void checkLevel(int score) {
        if (point < 30)
            gameAccount.setLevel(new PrimaryLevel(this));
        else if (point >= 50)
            gameAccount.setLevel(new ProfessionalLevel(this));
    }

    @Override
    public void doubleScore() {
        System.out.println(level + "玩家" + gameAccount.getUsername() + "使用积分翻倍+20");
        point += 20;
        checkLevel(point);
    }

}
