package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex003_iterator;

import java.util.Iterator;

/**
 * В созданный клас implements Iterator<String>. String - говорит о том, что выводы через итератор будут в виде строк.
 * Далее переопределим методы интерфейса Iterator и пропишем для них необходимую, свою логику...
 */
public class Worker implements Iterator<String> {
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
//        this.index = 0;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
// ____________________________________________________________________________________________________________________
    /**
     * Создали переменную index
     */
    int index;

    /**
     * В переопределённом методе hasNext index будет увеличиваться на 1. И метод будет работать
     * пока index меньше 4 (количество полей в методе)
     * @return счетчик постфикс
     */
    @Override
    public boolean hasNext() {
        return index++ < 4;
    }


    /**
     * Переопределённый метод next, относительно index выведет соответствующую информацию.
     * @return case относительно index
     */
    @Override
    public String next() {
        switch (index) {
            case 1:
                //return firstName;
                return String.format("firstName: %s", firstName);
            case 2:
                //return lastName;
                return String.format("lastName: %s", lastName);
            case 3:
                //return age;
                return String.format("age: %d", age);
            default:
                //return salary;
                return String.format("salary: %d", salary);

        }
    }
}
