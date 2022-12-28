package exp1.t8;

public class Director {
    public PlayerDisplay construct(PlayerDisplayBuilder builder) {
        builder.buildMainWindow();
        builder.buildMenu();
        builder.buildPlaylist();
        builder.buildControlBar();
        builder.buildFavoriteList();
        return builder.getPlayerDisplay();
    }
}
