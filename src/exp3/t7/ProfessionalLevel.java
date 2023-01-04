package exp3.t7;

public class ProfessionalLevel extends AbstractLevel {

    public ProfessionalLevel(AbstractLevel abstractLevel) {
        this.gameAccount = abstractLevel.gameAccount;
        this.point = abstractLevel.point;
        this.level = "高手级";
    }

    @Override
    public void checkLevel(int score) {
        if (point >= 60) {
            gameAccount.setLevel(new FinalLevel(this));
        } else if (point < 50) {
            gameAccount.setLevel(new SecondaryLevel(this));
        }
    }

    @Override
    public void doubleScore() {
        System.out.println(level + "玩家" + gameAccount.getUsername() + "使用积分翻倍+20");
        point += 20;
        checkLevel(point);
    }

    @Override
    public void changeCards() {
        System.out.println(level + "玩家" + gameAccount.getUsername() + "换牌");
    }
}
