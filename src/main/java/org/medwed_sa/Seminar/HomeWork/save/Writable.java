package org.medwed_sa.Seminar.HomeWork.save;

import java.io.Serializable;

public interface Writable {
    String filePath = "src/main/java/org/medwed_sa/Seminar/HomeWork/save/familyTree.out";

    boolean saveFile(Serializable serializable, String filePath);

    Object readFile(String filePath);

}
