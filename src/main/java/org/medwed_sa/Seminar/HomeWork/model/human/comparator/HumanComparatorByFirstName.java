package org.medwed_sa.Seminar.HomeWork.model.human.comparator;


import org.medwed_sa.Seminar.HomeWork.model.familyTree.EntityCreation;

import java.util.Comparator;

public class HumanComparatorByFirstName<T extends EntityCreation<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
