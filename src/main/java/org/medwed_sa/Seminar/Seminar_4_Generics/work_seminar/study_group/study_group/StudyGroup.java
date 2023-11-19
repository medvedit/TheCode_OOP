package org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group.study_group;

import org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group.student.student_comparator.StudentComparatorByAge;
import org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group.student.student_comparator.StudentComparatorByName;
import org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group.study_group.student_iterator.StudentIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup<E extends StudyGroupItem> implements Iterable<E>{
    private List<E> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(E student) {
        studentList.add(student);
    }

    public void sortByName(){
//        Collections.sort(studentList, new StudentComparatorByName()); // Как пример вызова метода sort()
        studentList.sort(new StudentComparatorByName<>());
    }
    public void sortByAge(){
//        Collections.sort(studentList, new StudentComparatorByAge()); // Как пример вызова метода sort()
        studentList.sort(new StudentComparatorByAge<>());
    }

    @Override
    public Iterator<E> iterator() {
        return new StudentIterator<>(studentList);
    }

//    public StringBuilder studentGroupInfo() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Список студентов:\n");
//        for (E student : studentList) {
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
