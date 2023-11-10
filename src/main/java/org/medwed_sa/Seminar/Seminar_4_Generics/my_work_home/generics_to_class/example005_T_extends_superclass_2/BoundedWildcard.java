package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example005_T_extends_superclass_2;

import org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example005_T_extends_superclass_2.coordinate_array.ArrayCrd;
import org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example005_T_extends_superclass_2.coordinate_classes.FourCrd;
import org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example005_T_extends_superclass_2.coordinate_classes.ThreeCrd;

public class BoundedWildcard {

    public void showAB(ArrayCrd<?> arrayAB) {
        System.out.println("Koopдинaты A B:");
        for (int i = 0; i < arrayAB.getArrayCrd().length; i++) {
            System.out.println(arrayAB.getArrayCrd()[i].getA() + " " +
                    arrayAB.getArrayCrd()[i].getB());
        }
        System.out.println();
    }

    public void showABC(ArrayCrd<? extends ThreeCrd> arrayABC) {
        System.out.println("Koopдинaты A B C:");
        for (int i = 0; i < arrayABC.getArrayCrd().length; i++) {
            System.out.println(arrayABC.getArrayCrd()[i].getA() + " " +
                    arrayABC.getArrayCrd()[i].getB() + " " +
                    arrayABC.getArrayCrd()[i].getC());
        }
        System.out.println();
    }

    public void showABCD(ArrayCrd<? extends FourCrd> arrayABCD) {
        System.out.println("Koopдинaты A B C D:");
        for (int i = 0; i < arrayABCD.getArrayCrd().length; i++) {
            System.out.println(arrayABCD.getArrayCrd()[i].getA() + " " +
                    arrayABCD.getArrayCrd()[i].getB() + " " +
                    arrayABCD.getArrayCrd()[i].getC() + " " +
                    arrayABCD.getArrayCrd()[i].getD());
        }
        System.out.println();
    }

}
