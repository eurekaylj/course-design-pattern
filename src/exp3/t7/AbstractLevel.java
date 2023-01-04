package exp3.t7;

public abstract class AbstractLevel {
    protected GameAccount gameAccount;
    protected int point;
    protected String level;

    public abstract void checkLevel(int score);

    public void playLose() {
        point -= 10;
        System.out.println(level + "玩家" + gameAccount.getUsername() + "输了一局,积分-10,当前积分:" + point);
        checkLevel(point);
    }

    public void playWin() {
        point += 10;
        System.out.println(level + "玩家" + gameAccount.getUsername() + "赢了一局,积分+10,当前积分:" + point);
        checkLevel(point);
    }

    public void doubleScore() {
        System.out.println(level + "未解锁积分加倍");
    }

    public void changeCards() {
        System.out.println(level + "未解锁换牌");
    }

    public void peekCards() {
        System.out.println(level + "未解锁偷看牌");
    }


}
