package org.medwed_sa.Seminar.HomeWork.model.human.comparator;

import ru.medved_sa.tree_family.model.familyTree.EntityCreation;

import java.util.Comparator;

public class HumanComparatorByAge<T extends EntityCreation<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
