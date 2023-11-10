package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example005_T_extends_superclass_2.coordinate_classes;

public class FourCrd extends ThreeCrd{
    int d;

    public FourCrd(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
    }

    public int getD() {
        return d;
    }
}
