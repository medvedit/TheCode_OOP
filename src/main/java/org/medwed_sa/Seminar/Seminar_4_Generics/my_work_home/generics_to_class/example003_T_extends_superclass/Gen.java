package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example003_T_extends_superclass;

public class Gen <T extends Number> {
    T[] numbers;

    public Gen(T[] array) {
        this.numbers = array;
    }

    public T[] getNumbers() {
        return numbers;
    }

    public double getAverage() {
        double average = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i].doubleValue();
        }
        return average / numbers.length;
    }
}
