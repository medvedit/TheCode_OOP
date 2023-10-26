package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex007_contains;

import java.util.Objects;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredient that)) return false;
        return Objects.equals(brand, that.brand);
    }

}
