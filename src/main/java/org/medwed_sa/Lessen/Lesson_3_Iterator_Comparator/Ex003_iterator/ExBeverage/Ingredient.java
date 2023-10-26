package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex003_iterator.ExBeverage;

public abstract class Ingredient {

    public String ingredient;

    public Ingredient(String component) {
        this.ingredient = component;
    }

    @Override
    public String toString() {
        return ingredient;
    }
}
