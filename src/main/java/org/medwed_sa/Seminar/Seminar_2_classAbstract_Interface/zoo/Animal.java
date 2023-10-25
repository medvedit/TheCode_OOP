package org.medwed_sa.Seminar.Seminar_2_classAbstract_Interface.zoo;

import java.io.Serializable;

public abstract class Animal implements Speakable {
    private String name;

    public String getName() {
        return name;
    }
}
