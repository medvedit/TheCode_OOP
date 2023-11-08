package org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V4.Content;

public abstract class Content {
    private String name;

    public Content(String name) {
        this.name = name;
    }
    public Content() {
        this("-");
    }

    @Override
    public String toString() {
        return name;
    }
}