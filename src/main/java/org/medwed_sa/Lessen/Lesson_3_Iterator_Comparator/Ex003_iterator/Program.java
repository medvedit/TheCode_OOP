package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex003_iterator;


import org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex003_iterator.ExBeverage.*;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {


//        #region Worker Iterator ______________________________________________________________________________________
        /*
         * Методы интерфейса Iterator -> hasNext() и next(), будут знать что им делать на каждом шаге их вызовов, т.к.
         * они переопределены в классе Worker, каждый из них с необходимой, в данном случае, реализацией.
         */
//         Worker worker = new Worker(
//             "Имя", "Фамилия", 23, 4567);
//
//         Iterator<String> components = worker;
//
//         while (components.hasNext()) {
//             System.out.println(worker.next());
//         }

//        #endregion ___________________________________________________________________________________________________

//        #region Beverage Iterator ____________________________________________________________________________________

         Beverage latte = new Coffee();
         latte.addComponent(new Water("Вода"));
         latte.addComponent(new Beans("Зерно"));
         latte.addComponent(new Milk("Молоко"));

         Iterator<Ingredient> iterator = latte;
         while (iterator.hasNext()) {
             System.out.println(iterator.next());
         }

        //#endregion ___________________________________________________________________________________________________
    }
}
