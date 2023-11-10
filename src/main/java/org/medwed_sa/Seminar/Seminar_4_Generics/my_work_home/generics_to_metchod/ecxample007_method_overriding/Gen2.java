package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_metchod.ecxample007_method_overriding;

public class Gen2<T> extends Gen<T> {

    public Gen2(T ob) {
        super(ob);
    }

    /*
      Подобно любому другому методу метод в обобщенном классе можно переопределять. Тут переопределен метод
       getVol() из класса родителя.
     */
    @Override
    public T getVol() {
        System.out.print("Класс Gen2 vol = ");
        return vol;
    }
}
