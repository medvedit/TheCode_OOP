package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example005_T_extends_superclass_2;

import org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example005_T_extends_superclass_2.coordinate_array.ArrayCrd;
import org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example005_T_extends_superclass_2.coordinate_classes.FourCrd;
import org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example005_T_extends_superclass_2.coordinate_classes.TwoCrd;


public class Main {
    public static void main(String[] args) {

        BoundedWildcard bw = new BoundedWildcard();

        TwoCrd[] twoCrd = createTwoCrd();
        ArrayCrd<TwoCrd> two = new ArrayCrd<>(twoCrd);
        System.out.println("Содержание two:");
        bw.showAB(two);
//        showABC(two); // ожидает массив из трёх координат
//        showABCD(two); // ожидает массив из четырёх координат


        FourCrd[] fourCrd = createFourCrd();
        ArrayCrd<FourCrd> four = new ArrayCrd<>(fourCrd);
        System.out.println("Содержание two:");
        bw.showAB(four);
        bw.showABC(four);
        bw.showABCD(four);
    }






    private static TwoCrd[] createTwoCrd() {
        return new TwoCrd[]{
                new TwoCrd(3, 5),
                new TwoCrd(6, 8),
                new TwoCrd(78, 22),
                new TwoCrd(-33, -72)
        };
    }

    private static FourCrd[] createFourCrd() {
        return new FourCrd[]{
                new FourCrd(3, 5, 6, 123),
                new FourCrd(6, 8, 87, 111),
                new FourCrd(78, 22, 0, 77),
                new FourCrd(-33, -72, -88, -1)
        };
    }
}
