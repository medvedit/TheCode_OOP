package org.medwed_sa.Seminar.HomeWork.model.save;

import java.io.Serializable;

public interface Writable<E> {
    boolean saveFile(Serializable serializable, String fileName);
    E readFile(String fileName);

}
