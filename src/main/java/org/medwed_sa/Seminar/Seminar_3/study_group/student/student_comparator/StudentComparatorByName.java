package org.medwed_sa.Seminar.Seminar_3.study_group.student.student_comparator;

import org.medwed_sa.Seminar.Seminar_3.study_group.student.Student;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
