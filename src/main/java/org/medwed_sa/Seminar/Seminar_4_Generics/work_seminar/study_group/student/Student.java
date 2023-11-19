package org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group.student;

import org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group.study_group.StudyGroupItem;

public class Student implements StudyGroupItem {
    private long id;
    private String name;
    private int age;


    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return name.compareTo(o.getName());
//    }
}
