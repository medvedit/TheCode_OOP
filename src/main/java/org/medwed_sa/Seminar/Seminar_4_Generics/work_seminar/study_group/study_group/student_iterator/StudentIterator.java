package org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group.study_group.student_iterator;

import org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group.student.Student;

import java.util.Iterator;
import java.util.List;

public class StudentIterator<T> implements Iterator<T> {
    private int index;
    private List<T> studentList;

    public StudentIterator(List<T> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public T next() {
        return studentList.get(index++);
    }
}
