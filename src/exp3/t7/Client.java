package exp3.t7;

public class Client {
    public static void main(String[] args) {
        GameAccount gameAccount = new GameAccount("Eureka");
        
        gameAccount.playWin();
        gameAccount.playWin();
        gameAccount.playWin();
        gameAccount.playWin();
        gameAccount.doubleScore();
        gameAccount.changeCards();
        gameAccount.playWin();
        gameAccount.peekCards();
        gameAccount.playLose();
        gameAccount.playLose();
        gameAccount.playLose();
    }
}
