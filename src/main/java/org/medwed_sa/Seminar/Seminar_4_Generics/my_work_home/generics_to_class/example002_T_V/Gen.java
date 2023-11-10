package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example002_T_V;

public class Gen <T, V> {
    private T tObg;
    private V vObg;

    public Gen(T tObg, V vObg) {
        this.tObg = tObg;
        this.vObg = vObg;
    }

    public T getTObg() {
        return tObg;
    }

    public V getVObg() {
        return vObg;
    }

    public void chowType() {
        System.out.printf("Типом T является %s\n", tObg.getClass().getName());
        System.out.printf("Типом V является %s\n", vObg.getClass().getName());
    }
}
