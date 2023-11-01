package org.medwed_sa.Seminar.HomeWork.human.humanComparator;

import org.medwed_sa.Seminar.HomeWork.human.Human;

import java.util.Comparator;

public class HumanComparatorByAge implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getAge(), o2.getAge()); // Сортировка по возрастанию. Если требуется по убыванию, то
                                                          // меняем o1 и o2 местами.
    }
}
