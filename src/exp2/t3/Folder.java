package exp2.t3;

import java.util.ArrayList;

public class Folder implements AbstractFile {
    private ArrayList list = new ArrayList();

    @Override
    public void cleanVirus() {
        for (Object object : list) {
            ((AbstractFile) object).cleanVirus();
        }
    }

    public void addFile(AbstractFile abstractFile) {
        list.add(abstractFile);
    }

    public void removeFile(AbstractFile abstractFile) {
        list.remove(abstractFile);
    }
}
