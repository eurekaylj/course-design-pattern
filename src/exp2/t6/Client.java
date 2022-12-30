package exp2.t6;

public class Client {
    public static void main(String[] args) {
        Chess chess0, chess1, chess2, chess3;
        ChessFactory chessFactory = ChessFactory.getChessFactory();

        chess0 = chessFactory.getChess("black");
        chess0.display(new Position(10, 10));
        chess1 = chessFactory.getChess("white");
        chess1.display(new Position(15, 11));
        chess2 = chessFactory.getChess("black");
        chess2.display(new Position(9, 12));
        chess3 = chessFactory.getChess("white");
        chess3.display(new Position(10, 12));

        System.out.println("Total color: " + chessFactory.getColorNum());
        System.out.println("Total black chess: " + chessFactory.getBlackNum());
        System.out.println("Total white chess: " + chessFactory.getWhiteNum());
        System.out.println("Total chess: " + chessFactory.getChessNum());
    }
}
