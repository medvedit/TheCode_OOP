package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex005_comparable;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();

        // #region Collections.sort(numbers);___________________________________________________________________________

//         List<Integer> numbers = new ArrayList<>();
//         for (int i = 0; i < 10; i++) {
//         numbers.add(r.nextInt(1,20));
//         }
//
//         System.out.println(numbers);
//         Collections.sort(numbers);
//         System.out.println(numbers);

        // #endregion___________________________________________________________________________________________________

        // #region Comparable<Worker>___________________________________________________________________________________

        List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31),
                    r.nextInt(10000)));
        }
        System.out.println(db); // начальный, не отсортированный список.

                                           // 1 вариант:
        db.sort(new AgeComparator());  // Запуск сортировки через отдельный компонент прописанный в класс
                                         // AgeComparator. В случае , если класс для создания сущностей не может
                                         // в себя implements Comparable<Worker>
        System.out.println(db); // после 1 запуска сортировки.


                                   // 2 вариант:
        Collections.sort(db); // Запуск сортировки после @Override метода compareTo() и
                                  // implements Comparable<Worker> в самом классе от которого создаем сущности.
        System.out.println(db); // после 2 запуска сортировки.

                                                                  // 3 вариант:
        db.sort(((w1,w2) -> Integer.compare(w1.age, w2.age))); // Запуск сортировки через лямбду.
                                                                  // Когда не работает 1 вариант и 2 вариант.
        // Array.sort(...)
        System.out.println(db); // после 3 запуска сортировки.

        // #endregion___________________________________________________________________________________________________


    }
}

