package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex004_iterable.ExBeverage;

import java.util.Iterator;

public class Coffee extends Beverage {

    @Override
    public Iterator<Ingredient> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Ingredient next() {
                return components.get(index++);
            }

        };

    }

}
