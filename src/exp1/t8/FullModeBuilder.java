package exp1.t8;

public class FullModeBuilder extends PlayerDisplayBuilder {
    @Override
    public void buildMainWindow() {
        playerDisplay.setMainWindow("Main Window");
        System.out.println("Main Window");
    }

    @Override
    public void buildMenu() {
        playerDisplay.setMenu("Menu");
        System.out.println("Menu");
    }

    @Override
    public void buildPlaylist() {
        playerDisplay.setPlaylist("Playlist");
        System.out.println("Playlist");
    }

    @Override
    public void buildControlBar() {
        playerDisplay.setControlBar("Control Bar");
        System.out.println("Control Bar");
    }

    @Override
    public void buildFavoriteList() {
        playerDisplay.setFavoriteList("Favorite List");
        System.out.println("Favorite List");
    }
}
