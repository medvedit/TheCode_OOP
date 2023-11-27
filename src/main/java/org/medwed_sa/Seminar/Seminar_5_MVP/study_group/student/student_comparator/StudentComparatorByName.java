package org.medwed_sa.Seminar.Seminar_5_MVP.study_group.student.student_comparator;

import org.medwed_sa.Seminar.Seminar_5_MVP.study_group.study_group.StudyGroupItem;

import java.util.Comparator;

public class StudentComparatorByName<T extends StudyGroupItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
