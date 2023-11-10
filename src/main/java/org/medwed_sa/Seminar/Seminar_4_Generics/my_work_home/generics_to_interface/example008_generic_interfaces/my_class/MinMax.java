package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_interface.example008_generic_interfaces.my_class;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();


}
