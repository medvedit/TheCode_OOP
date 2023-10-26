package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex007_contains;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage
        implements Iterable<Ingredient> {
    public List<Ingredient> components;
    int index;

    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component) {

        if (!components.contains(component))
            components.add(component);
    }

}