package exp2.t6;

import java.util.ArrayList;

public class ChessFactory {
    private static ChessFactory chessFactory = null;
    private ArrayList chessList = new ArrayList<>();
    private int blackNum = 0;
    private int whiteNum = 0;

    // 单例模式
    public static ChessFactory getChessFactory() {
        if (chessFactory == null) {
            chessFactory = new ChessFactory();
        }
        return chessFactory;
    }

    public ChessFactory() {
        Chess blackChess = new ConcreteChess("black");
        chessList.add(blackChess);
        Chess whiltChess = new ConcreteChess("white");
        chessList.add(whiltChess);
    }

    public Chess getChess(String color) {
        if (color.equalsIgnoreCase("black")) {
            blackNum++;
            return (Chess) chessList.get(0);
        } else if (color.equalsIgnoreCase("white")) {
            whiteNum++;
            return (Chess) chessList.get(1);
        } else {
            return null;
        }
    }

    public int getBlackNum() {
        return blackNum;
    }

    public int getWhiteNum() {
        return whiteNum;
    }

    public int getChessNum() {
        return getBlackNum() + getWhiteNum();
    }

    public int getColorNum() {
        return chessList.size();
    }
}
