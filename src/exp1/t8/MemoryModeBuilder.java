package exp1.t8;

public class MemoryModeBuilder extends PlayerDisplayBuilder {
    @Override
    public void buildMainWindow() {
        playerDisplay.setMainWindow("Main Window");
        System.out.println("Main Window");
    }

    @Override
    public void buildMenu() {
    }

    @Override
    public void buildPlaylist() {
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
