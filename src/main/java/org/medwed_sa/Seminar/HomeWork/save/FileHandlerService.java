package org.medwed_sa.Seminar.HomeWork.save;

import org.medwed_sa.Seminar.HomeWork.save.ioUtils.IOUtils;
import java.io.Serializable;

public class FileHandlerService extends IOUtils implements Writable {
    private String filePath = "src/main/java/org/medwed_sa/Seminar/HomeWork/save/familyTree.out";

    public FileHandlerService() {
        this.filePath = filePath;
    }

    @Override
    public boolean saveFile(Serializable serializable) {
        return super.saveFile(serializable, filePath);
    }

    @Override
    public Object readFile() {
        return super.readFile(filePath);
    }
}
