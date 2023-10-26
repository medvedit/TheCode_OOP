package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex002_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        /*
         * Пример работы итератора. Создали список, положили в него элементы...
         */
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(11111);
        num.add(123);
        num.add(1234);
        num.add(12345);
        /*
         * Создали переменную iter от интерфейса Iterator (Iterator принадлежит классу коллекции и будет создан
         * как List) и цикле while говорим, что пока есть следующий элемент -> вывести в консоль текущий элемент.
         */
        Iterator<Integer> iter = num.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        /*
         * Но если создать экземпляр класса и "подключить" к созданному экземпляру iterator, то компилятор
         * выдаст ошибку, т.к. он не знает как "ходить" по полям экземпляра этого класса...
         * Переходим в пример Ex002 и открываем первым класс Worker...
         */

        Worker worker = new Worker(
            "Имя", "Фамилия", 23, 4567);

//        Iterator<Worker> components = worker.iterator;

    }
}
