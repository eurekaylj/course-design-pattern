package exp1.t8;

public class MiniModeBuilder extends PlayerDisplayBuilder {
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
    }
}
