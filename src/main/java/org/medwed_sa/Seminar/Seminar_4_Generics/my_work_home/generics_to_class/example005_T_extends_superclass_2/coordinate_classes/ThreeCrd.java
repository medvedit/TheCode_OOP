package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example005_T_extends_superclass_2.coordinate_classes;

public class ThreeCrd extends TwoCrd {
    int c;

    public ThreeCrd(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public int getC() {
        return c;
    }
}
