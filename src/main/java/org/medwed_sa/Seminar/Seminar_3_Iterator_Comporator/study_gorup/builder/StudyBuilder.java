package org.medwed_sa.Seminar.Seminar_3_Iterator_Comporator.study_gorup.builder;

import org.medwed_sa.Seminar.Seminar_3_Iterator_Comporator.study_gorup.student.Student;

public class StudyBuilder {
    private long currentId = 1;

    public Student build(String name, int age){
        return new Student(currentId++, name, age);
    }

}
