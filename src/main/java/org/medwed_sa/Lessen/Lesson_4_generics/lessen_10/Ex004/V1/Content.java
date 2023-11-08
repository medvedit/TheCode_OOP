package org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V1;

public abstract class Content {
    private String name;

    public Content(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
