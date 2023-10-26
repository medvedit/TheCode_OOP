package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex002_iterator;

public class Worker {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
                  String lastName,
                  int age,
                  int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("Имя: %s Фамилия: %s", firstName, lastName);
    }

}
