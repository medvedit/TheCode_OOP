package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_metchod.ecxample007_method_overriding;

public class Gen<T> {
    T vol;

    public Gen(T vol) {
        this.vol = vol;
    }

    public T getVol() {
        System.out.print("Класс Gen vol = ");
        return vol;
    }
}
