package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex005_comparable;

public class Worker implements Comparable<Worker> {
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
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }

    /**
     * Оба метода compareTo() будут работать одинаково. Закомментированный - как второй вариант его реализации.
     */
    @Override
    public int compareTo(Worker o) {
//        return Integer.compare(this.age, o.age); // сортировка по возрасту
        return Integer.compare(this.salary, o.salary); // сортировка по зарплате
    }
//    Это логика от разработчиков compareTo().
//    @Override
//    public int compareTo(Worker o) {
//        if (this.age > o.age)
//            return 1;
//        else if (this.age < o.age)
//            return -1;
//        else
//            return 0;
//    }
}
