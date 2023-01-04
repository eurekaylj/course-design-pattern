package exp3.t7;

public class FinalLevel extends AbstractLevel {

    public FinalLevel(AbstractLevel abstractLevel) {
        this.level = "骨灰级";
        this.gameAccount = abstractLevel.gameAccount;
        this.point = abstractLevel.point;
    }

    @Override
    public void checkLevel(int score) {
        if (point < 60)
            gameAccount.setLevel(new ProfessionalLevel(this));
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

    @Override
    public void peekCards() {
        System.out.println(level + "玩家" + gameAccount.getUsername() + "偷看牌");
    }

}
