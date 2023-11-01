package org.medwed_sa.Seminar.HomeWork.save;

import java.io.Serializable;

public interface Writable {
    boolean saveFile(Serializable serializable);
    Object readFile();

}
