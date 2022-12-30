package exp2.t5;

public class Mainframe {
    private Memory memory;
    private CPU cpu;
    private HardDisk hardDisk;
    private OS os;

    public Mainframe() {
        memory = new Memory();
        cpu = new CPU();
        hardDisk = new HardDisk();
        os = new OS();
    }

    public void on() {
        memory.check();
        cpu.run();
        hardDisk.read();
        os.load();
        System.out.println("主机开机成功");
    }

    public void off() {
        memory.close();
        cpu.close();
        hardDisk.close();
        os.close();
        System.out.println("主机关闭成功");
    }
}
