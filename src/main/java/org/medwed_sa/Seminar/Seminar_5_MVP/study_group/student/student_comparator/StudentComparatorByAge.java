package org.medwed_sa.Seminar.Seminar_5_MVP.study_group.student.student_comparator;

import org.medwed_sa.Seminar.Seminar_5_MVP.study_group.study_group.StudyGroupItem;

import java.util.Comparator;

public class StudentComparatorByAge<T extends StudyGroupItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
//        return o1.getAge() - o2.getAge(); можно и так...
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
