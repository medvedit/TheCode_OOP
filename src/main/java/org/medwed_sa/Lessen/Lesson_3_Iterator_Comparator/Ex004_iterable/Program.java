package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex004_iterable;


import org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex004_iterable.ExBeverage.Coffee;
import org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex004_iterable.ExBeverage.Water;

// три воды
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
