package org.medwed_sa.Seminar.HomeWork.human.humanComparator;

import org.medwed_sa.Seminar.HomeWork.human.EntityCreation;

import java.util.Comparator;


public class HumanComparatorByAge<T extends EntityCreation<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge()); // Сортировка по возрастанию. Если требуется по убыванию, то
                                                          // меняем o1 и o2 местами.
    }
}
