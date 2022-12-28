package exp1.t8;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        PlayerDisplayBuilder fullModeBuilder, miniModeBuilder, memoryModeBuilder;

        System.out.println("完整模式界面显示：");
        fullModeBuilder = new FullModeBuilder();
        director.construct(fullModeBuilder);

        System.out.println();

        System.out.println("精简模式界面显示：");
        miniModeBuilder = new MiniModeBuilder();
        director.construct(miniModeBuilder);

        System.out.println();

        System.out.println("记忆模式界面显示：");
        memoryModeBuilder = new MemoryModeBuilder();
        director.construct(memoryModeBuilder);
    }
}
