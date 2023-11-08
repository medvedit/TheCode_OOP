package org.medwed_sa.Seminar.Seminar_3_Iterator_Comporator.study_gorup.study_group;

import org.medwed_sa.Seminar.Seminar_3_Iterator_Comporator.study_gorup.student.Student;
import org.medwed_sa.Seminar.Seminar_3_Iterator_Comporator.study_gorup.student.student_comparator.StudentComparatorByAge;
import org.medwed_sa.Seminar.Seminar_3_Iterator_Comporator.study_gorup.student.student_comparator.StudentComparatorByName;
import org.medwed_sa.Seminar.Seminar_3_Iterator_Comporator.study_gorup.study_group.student_iterator.StudentIterator;

import java.util.*;

public class StudyGroup implements Iterable<Student>{
    private List<Student> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void sortByName(){
//        Collections.sort(studentList, new StudentComparatorByName()); // Как пример вызова метода sort()
        studentList.sort(new StudentComparatorByName());
    }
    public void sortByAge(){
//        Collections.sort(studentList, new StudentComparatorByAge()); // Как пример вызова метода sort()
        studentList.sort(new StudentComparatorByAge());
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }

//    public StringBuilder studentGroupInfo() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Список студентов:\n");
//        for (Student student : studentList) {
//            sb.append(student);
//            sb.append("\n");
////            for (int i = 0; i < studentList.size(); i++) {
////                if (i == 0) {
////                    sb.append("id = ");
////                    sb.append(student.getId());
////                    sb.append("; ");
////                } else if (i == 1) {
////                    sb.append("Имя = ");
////                    sb.append(student.getName());
////                    sb.append("; ");
////                } else if (i == 2) {
////                    sb.append("возраст = ");
////                    sb.append(student.getAge());
////                    sb.append("; ");
////                } else {
////                    sb.append("\n");
////                }
////            }
//        }
//        return sb;
//    }
}
