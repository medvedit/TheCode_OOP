package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_restrictions.no_generics_array;

public class Gen<T extends Number> {
    T ob;
    T[] value;

    public Gen(T ob, T[] value) {
        this.ob = ob;
        this.value = value;
//        this.value = new T[10]; // Так незаконно !!! Невозможно создать массив элементов типа Т.
    }
    /*
    Нельзя создавать экземпляр массива, тип элементов которого является параметром типа.
     */
}
