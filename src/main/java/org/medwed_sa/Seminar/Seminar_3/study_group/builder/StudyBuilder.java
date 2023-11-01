package org.medwed_sa.Seminar.Seminar_3.study_group.builder;

import org.medwed_sa.Seminar.Seminar_3.study_group.student.Student;

public class StudyBuilder {
    private long currentId = 1;

    public Student build(String name, int age){
        return new Student(currentId++, name, age);
    }

}
