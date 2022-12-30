package exp2.t3;

public class Client {
    public static void main(String[] args) {
        AbstractFile fl0, fl1, fl2, fl3, fl4;
        Folder fd0, fd1, fd2;

        fl0 = new TextFile();
        fl1 = new ImageFile();
        fd0 = new Folder();

        fd0.addFile(fl0);
        fd0.addFile(fl1);

        fl2 = new VideoFile();
        fl3 = new ImageFile();
        fd1 = new Folder();

        fd1.addFile(fl2);
        fd1.addFile(fl3);

        fl4 = new TextFile();
        fd2 = new Folder();
        fd2.addFile(fd0);
        fd2.addFile(fd1);
        fd2.addFile(fl4);

        fd2.cleanVirus();
    }
}
