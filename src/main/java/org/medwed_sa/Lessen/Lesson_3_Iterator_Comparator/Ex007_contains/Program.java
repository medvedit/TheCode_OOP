package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex007_contains;

// три вода
public class Program {
    public static void main(String[] args) {

        Coffee latte1 = new Coffee();
        latte1.addComponent(new Water("вода"));
        latte1.addComponent(new Water("вода"));
        latte1.addComponent(new Water("вода"));
        for (var ingredient : latte1) {
            System.err.println(ingredient);
        }

        Coffee latte2 = new Coffee();
        latte2.addComponent(new Water("вода1"));
        latte2.addComponent(new Water("вода2"));
        latte2.addComponent(new Water("вода3"));
        for (var ingredient : latte2) {
            System.err.println(ingredient);
        }
    }
}
