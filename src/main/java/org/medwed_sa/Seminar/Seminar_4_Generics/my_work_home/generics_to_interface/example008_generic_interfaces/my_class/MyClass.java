package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_interface.example008_generic_interfaces.my_class;

public class MyClass<T extends Comparable<T>> implements org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_interface.example008_generic_interfaces.my_class.MinMax<T> {
    T[] value;

    public MyClass(T[] value) {
        this.value = value;
    }

    @Override
    public T min() {
        T v = value[0];
        for (int i = 0; i < value.length; i++) { // Нижний for изменён на foreach
            if (value[i].compareTo(v) < 0) {
                v = value[i];
            }
        }
        return v;

    }

    @Override
    public T max() {
        T v = value[0];
        for (T t : value) {
            if (t.compareTo(v) > 0) {
                v = t;
            }
        }
        return v;
    }
}
