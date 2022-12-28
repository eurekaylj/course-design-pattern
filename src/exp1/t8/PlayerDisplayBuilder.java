package exp1.t8;

public abstract class PlayerDisplayBuilder {
    protected PlayerDisplay playerDisplay = new PlayerDisplay();

    public PlayerDisplay getPlayerDisplay() {
        return this.playerDisplay;
    }

    public abstract void buildMainWindow();
    public abstract void buildMenu();
    public abstract void buildPlaylist();
    public abstract void buildControlBar();
    public abstract void buildFavoriteList();
}
