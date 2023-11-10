package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example005_T_extends_superclass_2.coordinate_array;

import org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example005_T_extends_superclass_2.coordinate_classes.TwoCrd;

public class ArrayCrd<T extends TwoCrd> {
    T[] arrayCrd;

    public ArrayCrd(T[] arrayCrd) {
        this.arrayCrd = arrayCrd;
    }

    public T[] getArrayCrd() {
        return arrayCrd;
    }
}
