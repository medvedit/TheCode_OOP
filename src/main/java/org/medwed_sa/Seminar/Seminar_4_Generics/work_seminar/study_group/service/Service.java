package org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group.service;

import org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group.builder.StudyBuilder;
import org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group.student.Student;
import org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group.study_group.StudyGroup;

public class Service {
    private StudyGroup<Student> studyGroup;
    private StudyBuilder builder;

    public Service() {
        studyGroup = new StudyGroup<>();
        builder = new StudyBuilder();
    }

    public void addStudent(String name, int age){
        Student student = builder.build(name, age);
        studyGroup.addStudent(student);
    }


    public String getStudentInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список студентов:\n");
        for (Student o : studyGroup) {
            sb.append(o);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void sortByName(){
        studyGroup.sortByName();
    }

    public void sortByAge(){
        studyGroup.sortByAge();
    }

    @Override
    public String toString() {
        return getStudentInfo();
    }

    //    public StringBuilder getStudentInfo(){
//        return studyGroup.studentGroupInfo();
//    }


}
