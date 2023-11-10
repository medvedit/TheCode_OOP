package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_restrictions.no_class_instance;

public class Gen<T> {
    T obg;

    /*
    Создать экземпляр параметра типа невозможно.
     */
    public Gen() {
//        obg = new T(); // Незаконно !!!
    }
    /*
    Здесь предпринимается незаконная попытка создать экземпляр T. Понять причину должно быть легко:
    компилятору не известен тип объекта, который нужно создать. Параметр типа T - это просто заполнитель.
     */

}
