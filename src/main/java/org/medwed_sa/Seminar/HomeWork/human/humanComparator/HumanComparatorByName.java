package org.medwed_sa.Seminar.HomeWork.human.humanComparator;

import org.medwed_sa.Seminar.HomeWork.human.Human;

import java.util.Comparator;

public class HumanComparatorByName implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
