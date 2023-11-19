package org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group;

import org.medwed_sa.Seminar.Seminar_4_Generics.work_seminar.study_group.service.Service;

public class Main {

    public static void main(String[] args) {

        Service service = new Service();
        service.addStudent("Иван", 18);
        service.addStudent("Полина", 20);
        service.addStudent("Кирил", 17);
        service.addStudent("Дарья", 19);

        System.out.println(service);
        service.sortByName();
        System.out.println(service);
        service.sortByAge();
        System.out.println(service);
    }
}
