package org.medwed_sa.Seminar.HomeWork.human.humanComparator;

import org.medwed_sa.Seminar.HomeWork.human.EntityCreation;

import java.util.Comparator;

public class HumanComparatorByName<T extends EntityCreation<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
