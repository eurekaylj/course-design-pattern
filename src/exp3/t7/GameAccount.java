package exp3.t7;

public class GameAccount {
    private AbstractLevel level;
    private String username;

    public GameAccount(String username) {
        this.username = username;
        this.level = new PrimaryLevel(this);
        System.out.println(this.username + "Registration successful!");
        System.out.println("----------------------------------------");
    }

    public void playWin() {
        level.playWin();
    }

    public void playLose() {
        level.playLose();
    }

    public void doubleScore() {
        level.doubleScore();
    }

    public void changeCards() {
        level.changeCards();
    }

    public void peekCards() {
        level.peekCards();
    }

    public AbstractLevel getLevel() {
        return level;
    }

    public void setLevel(AbstractLevel level) {
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
